import java.util.LinkedHashMap;
import java.util.TreeMap;

import org.nutz.json.Json;


public class TestJson{
	public static void main(String[] args) {
		String json ="{aaa:12,bbb:\"bbbb\",ccc:{c1:\"c1\",c2:2},ddd:['a','b','c']}";
		@SuppressWarnings("unchecked")
		LinkedHashMap<String,Object> jsonMap= Json.fromJson(LinkedHashMap.class,json);
		
		
		for(Object obj:jsonMap.keySet()){
			System.out.println(jsonMap.get(obj)+"|||||"+jsonMap.get(obj).getClass().getName());
			if(jsonMap.get(obj) instanceof TreeMap){
				@SuppressWarnings({ "rawtypes", "unchecked" })
				LinkedHashMap lhm =new LinkedHashMap((TreeMap)jsonMap.get(obj));
				System.out.println(lhm+"|||||"+lhm.getClass().getName());
			}
		}
		
		
	}
	
	
}
