import java.awt.List;
import java.util.ArrayList;


public class TestArray {
	public static void main(String[] args) {
		ArrayList x = new ArrayList<String>();
		x.add("a");
		x.add("b");
		x.add("c");
		x.add("d");
		
		Object[] str =x.toArray(new String[0]);
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println(3 % 13);
	}
}
