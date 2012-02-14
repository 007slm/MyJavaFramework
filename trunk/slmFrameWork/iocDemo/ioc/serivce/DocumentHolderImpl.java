package ioc.serivce;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class DocumentHolderImpl implements DocumentHolder {
	//string ��·��
	//Document ��document����
	private Map<String,Document> docs = new HashMap<String,Document>();
	
	public Document getDocument(String filePath) {
		Document doc = this.docs.get(filePath);
		if(doc == null){
			doc = this.docs.put(filePath,readDocument(filePath));
		}
		return this.docs.get(filePath);
	}
   private Document readDocument(String filePath){
	   SAXReader reader = new SAXReader();
		Document doc = null;
		try {
			 doc = reader.read(filePath);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ApplicationException("�ļ��Ҳ���"+e.getMessage());
		}
		return doc;
   }
  
}
