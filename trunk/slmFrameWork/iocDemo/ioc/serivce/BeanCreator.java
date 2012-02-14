package ioc.serivce;
//获得属性 创建对象
public interface BeanCreator {
   public Object createBeanUseDefaultConstruct(String className);
}
