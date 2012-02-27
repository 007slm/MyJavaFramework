import sun.jvm.hotspot.oops.InstanceKlass;
import sun.jvm.hotspot.tools.jcore.ClassFilter;

/**
 * 
 * @author 007slm
 *
 * dump出jvm已经加载的class classFilter是过滤器
 * 
 * 依赖jdk7 的sa-jdi.jar
 */
public class DumpClass implements ClassFilter {
	public static void main(String[] args) {
		//java -classpath ".:./bin:$JAVA_HOME/lib/sa-jdi.jar" -Dsun.jvm.hotspot.tools.jcore.filter=MyFilter sun.jvm.hotspot.tools.jcore.ClassDump 20542
		System.setProperty("sun.jvm.hotspot.tools.jcore.filter","DumpClass");
		sun.jvm.hotspot.tools.jcore.ClassDump.main(args);
	}
	
    public boolean canInclude(InstanceKlass kls) {
    	String klassName = kls.getName().asString();  
    	return klassName.startsWith("java/lang/String");
    }
}
