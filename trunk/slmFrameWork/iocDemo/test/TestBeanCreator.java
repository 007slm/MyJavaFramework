package test;

import ioc.domain.Student;
import ioc.serivce.BeanCreator;
import ioc.serivce.BeanCreatorImpl;
import ioc.serivce.DocumentHolder;
import ioc.serivce.DocumentHolderImpl;
import ioc.serivce.ElementLoader;
import ioc.serivce.ElementLoaderImpl;
import ioc.serivce.ElementReader;
import ioc.serivce.ElementReaderImpl;

import org.dom4j.Document;
import org.junit.Assert;
import org.junit.Test;

public class TestBeanCreator {
  @Test
  public void test(){
	  String path = TestElementLoader.class.getClassLoader().getResource(".").toString();
		path = path +"beans.xml";
		DocumentHolder dh = new DocumentHolderImpl();
		Document doc = dh.getDocument(path);
		ElementLoader el = new ElementLoaderImpl();
		el.addElements(doc);
		ElementReader reader = new ElementReaderImpl();
		String className = reader.getArribute(el.getElement("stu"), "class");
		BeanCreator bean = new BeanCreatorImpl();
		Student o = (Student) bean.createBeanUseDefaultConstruct(className);
		Assert.assertNotNull(o);
		System.out.println(o);
		
		
	  
  }
}
