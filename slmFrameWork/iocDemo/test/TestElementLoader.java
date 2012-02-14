package test;

import ioc.serivce.DocumentHolder;
import ioc.serivce.DocumentHolderImpl;
import ioc.serivce.ElementLoader;
import ioc.serivce.ElementLoaderImpl;
import ioc.serivce.ElementReader;
import ioc.serivce.ElementReaderImpl;

import java.util.Collection;

import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.Assert;
import org.junit.Test;

public class TestElementLoader {
	
	@Test
   public void testImpl(){
		ElementLoader el = new ElementLoaderImpl();
		String path = TestElementLoader.class.getClassLoader().getResource(".").toString();
		path = path +"beans.xml";
		DocumentHolder dh = new DocumentHolderImpl();
		Document doc = dh.getDocument(path);
		el.addElements(doc);
		Assert.assertNotNull(el.getElement("stu"));
		Assert.assertEquals(2, el.getElements().size());
		Collection<Element> es = el.getElements();
		ElementReader er = new ElementReaderImpl();
		for(Element e:es){
			System.out.println(e.attributeValue("class"));
			System.out.println(e.attributeValue("id"));
			System.out.println(e.attributeValue("singleton"));
			System.out.println("================");
			System.out.println(er.isSingleton(e));
			System.out.println("================");
			
		}
		String name = er.getArribute(el.getElement("stu"), "class");
		System.out.println(name);
	
	
		      
		
   }
}
