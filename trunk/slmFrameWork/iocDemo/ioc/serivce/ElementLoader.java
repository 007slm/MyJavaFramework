package ioc.serivce;

import java.util.Collection;

import org.dom4j.Document;
import org.dom4j.Element;

public interface ElementLoader {
	//����һ��doc������Element
  void addElements(Document doc);
  //����Ԫ�ص�id���Element
  Element getElement(String id);
  
  Collection<Element> getElements();
}
