package ioc.serivce;

import org.dom4j.Element;

public interface ElementReader {
//判断一个元素是否为单态模式
	public String getArribute(Element e,String nam);
	public boolean isSingleton(Element e);
	  
}
