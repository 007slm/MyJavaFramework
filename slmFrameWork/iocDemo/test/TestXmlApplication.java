package test;

import ioc.domain.Student;
import ioc.domain.Teacher;
import ioc.serivce.XmlClassPathApplicationContext;

import org.junit.Test;

public class TestXmlApplication {
	@Test
    public void test(){
    	XmlClassPathApplicationContext context = new XmlClassPathApplicationContext();
    	//context.setElements("beans.xml");
    	context.init("beans.xml");
    	Student s = (Student)context.getBean("stu");
    	System.out.println(s);
    	Teacher t1 = (Teacher)context.getBean("tea");
		System.out.println(t1);	
		Teacher t2 = (Teacher)context.getBean("tea");
		System.out.println(t2);	
    	
    	
    }
}
