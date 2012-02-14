package test;

import static org.junit.Assert.assertEquals;
import ioc.domain.Student;
import ioc.serivce.DocumentHolderImpl;

import java.util.Map;

import org.dom4j.Document;
import org.junit.Test;

public class TestDocumentHolderImpl {

	
	
	@Test
	public void testImpl(){
		DocumentHolderImpl dhl = new DocumentHolderImpl();
		String path = DocumentHolderImpl.class.getClassLoader().getResource(".").toString();
		System.out.println(path);
		path = path +"beans.xml";
		System.out.println(path);
		Document d1 = dhl.getDocument(path);
		Document d2 = dhl.getDocument(path);
		System.out.println(d1);
		System.out.println(d2);
	}
}
