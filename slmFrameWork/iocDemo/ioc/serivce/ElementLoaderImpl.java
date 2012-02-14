package ioc.serivce;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;

public class ElementLoaderImpl implements ElementLoader{
	//左边 id  右边元素
	private Map<String,Element> elements = new HashMap<String,Element>();

	public void addElements(Document doc) {
		// 所有根标签 
		List<Element> beans  = doc.getRootElement().elements();
		
		for(Element e:beans){
			String id  = e.attributeValue("id");
			elements.put(id, e);
			
		}
		
	}

	public Element getElement(String id) {
		return elements.get(id);
	}

	public Collection<Element> getElements() {
		return elements.values();
		
	}

}
