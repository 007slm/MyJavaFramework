package test;

import ioc.serivce.DocumentHolder;
import ioc.serivce.DocumentHolderImpl;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
//���ļ� ���ļ��ڹ�����ʱnew File("res/beans.xml");
//���ļ���Դ�ļ���ʱ  String path = ReaderXml.class.getClassLoader().getResource(".").toString()
//path = path + "beans.xml"
public class ReaderXml {
  @Test
  public void testxml() throws Exception{
	  SAXReader reader = new SAXReader(true);
		reader.setErrorHandler(new DefaultHandler(){
			@Override
			public void error(SAXParseException e) throws SAXException {
				System.out.println("---error����---");
				System.out.println(e.getSystemId()+"�ĵ��ĵ�"
						+e.getLineNumber()
						+"�У���"+e.getColumnNumber()
						+"������Ч�Դ��󣬴�����Ϣ��"+e.getMessage());
			}
		});
		
		String path = ReaderXml.class.getClassLoader().getResource(".").toString();
		path = path +"beans.xml";
		//Document doc = reader.read(path);
		//System.out.println(doc);
//		DocumentHolder dhl = new DocumentHolderImpl();
//		System.out.println(path);
//		Document d1 = dhl.getDocument(path);
//		Document d2 = dhl.getDocument(path);
//		System.out.println(d1);
//		System.out.println(d2);
  }
}
