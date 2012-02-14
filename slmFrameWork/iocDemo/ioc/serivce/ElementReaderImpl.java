package ioc.serivce;

import org.dom4j.Element;

public class ElementReaderImpl implements ElementReader{

	public boolean isSingleton(Element e) {
//		String s = e.attributeValue("singleton");
//		if(s.equals("true")){
//			return true;
//		}
//		return false;
		Boolean singleton = new Boolean(getArribute(e, "singleton"));
		return singleton;
		
	}

	public String getArribute(Element e, String name) {
		String value = e.attributeValue(name);
		return value;
	}

}
