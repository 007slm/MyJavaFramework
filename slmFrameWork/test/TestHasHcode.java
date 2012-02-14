
public class TestHasHcode {
	public static void main(String[] args) {
		System.out.println("hello".hashCode());
		Integer helloHashCode =99162322;
		System.out.println(helloHashCode.hashCode());
		System.out.println("hello".hashCode()==helloHashCode.hashCode());
		
	}
}
