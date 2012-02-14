import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

public class FreeMarkerTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Configuration config = new Configuration();
		try {
			config.setDirectoryForTemplateLoading(new File("D:/x5.1.0.1690/studio/workspace/TestUtils"));
			config.setObjectWrapper(new DefaultObjectWrapper());
			
			Template template = config.getTemplate("test.ftl","UTF-8");
			//创建数据模型
			Map root = new HashMap();
			List<User> users = new ArrayList<User>();
			User u1 = new User();
			u1.setId("123");
			u1.setName("王五");
			users.add(u1);
			User u2 = new User();
			u2.setId("2345");
			u2.setName("张三");
			
			User u3 = new User();
			u3.setId("fgh");
			u3.setName("李四");
			users.add(u2);
			users.add(u3);
			
			root.put("userList", users);
			Map product = new HashMap();
			root.put("lastProduct", product);
			product.put("url", "http://www.google.com");
			product.put("name", "green hose");
			File file = new File("e:/test.html");
			if(!file.exists()){
				//System.out.println("file exist");
				file.createNewFile();
			}
			Writer out = new BufferedWriter(new FileWriter(file));
			template.process(root, out);
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}