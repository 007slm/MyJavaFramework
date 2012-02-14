package ioc.serivce;

import java.util.Collection;

import org.dom4j.Document;
import org.dom4j.Element;

public interface ElementLoader {
	//加入一份doc的所有Element
  void addElements(Document doc);
  //根据元素的id获得Element
  Element getElement(String id);
  
  Collection<Element> getElements();
}
