package ioc.serivce;

import org.dom4j.Element;

public interface ElementReader {
//�ж�һ��Ԫ���Ƿ�Ϊ��̬ģʽ
	public String getArribute(Element e,String nam);
	public boolean isSingleton(Element e);
	  
}
