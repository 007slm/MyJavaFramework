package ioc.serivce;

public class BeanCreatorImpl implements BeanCreator {

	public Object createBeanUseDefaultConstruct(String className){
		Class clazz;
		Object o=null;
		try {
			clazz = Class.forName(className);
			o =  clazz.newInstance();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return o;
	
			
		
	}

}
