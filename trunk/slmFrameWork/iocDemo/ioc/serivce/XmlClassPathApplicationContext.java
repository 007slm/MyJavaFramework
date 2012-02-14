package ioc.serivce;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;

public class XmlClassPathApplicationContext implements ApplicationContext {
   //缓存所有对象的一个map
	private Map<String,Object> beans = new HashMap<String,Object>();
	//加载文档
	private DocumentHolder documentHolder = new DocumentHolderImpl();
	//加载标签
	private ElementLoader elementLoader = new ElementLoaderImpl();
	//读取属性
	private ElementReader elementReader = new ElementReaderImpl();
	//创建对象
	private BeanCreator beanCreator = new BeanCreatorImpl();
	
	public void setElements(String xmlPath){
		URL classPathUrl = XmlClassPathApplicationContext.class.getClassLoader().getResource(".");
		String classPath;
		try {
			classPath = java.net.URLDecoder.decode(classPathUrl.getPath(),"UTF-8");
			Document doc = documentHolder.getDocument(classPath+xmlPath);
			elementLoader.addElements(doc);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public void createBeans(){
		Collection<Element> elements = elementLoader.getElements();
		for(Element e: elements){
			String id = e.attributeValue("id");
			beans.put(id,instance(e));
			
		}
	}
	public Object instance(Element e){
		String className = elementReader.getArribute(e, "class");
		return beanCreator.createBeanUseDefaultConstruct(className);
		
		
		
	}
	public void init(String xmlPath){
		this.setElements(xmlPath);
		this.createBeans();
		
	}
	
	public Object getBean(String id) {
		Element e = elementLoader.getElement(id);
		boolean rs = elementReader.isSingleton(e);
		if(rs == true){
		return this.beans.get(id);
		
		}
		return instance(e);
	}

}
