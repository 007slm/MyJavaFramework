
public class TestException {
	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			if(i==2){
				throw new Exception("dd");
			}
			System.out.println(i);
			
		}
	}
}
