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
//读文件 当文件在工程下时new File("res/beans.xml");
//当文件在源文件下时  String path = ReaderXml.class.getClassLoader().getResource(".").toString()
//path = path + "beans.xml"
public class ReaderXml {
  @Test
  public void testxml() throws Exception{
	  SAXReader reader = new SAXReader(true);
		reader.setErrorHandler(new DefaultHandler(){
			@Override
			public void error(SAXParseException e) throws SAXException {
				System.out.println("---error方法---");
				System.out.println(e.getSystemId()+"文档的第"
						+e.getLineNumber()
						+"行，第"+e.getColumnNumber()
						+"发生有效性错误，错误信息是"+e.getMessage());
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
