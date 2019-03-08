package asert;

public class TestAssert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		
		try {
			assert i>2:"hello";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("inside excpetion");
			e.printStackTrace();
		}

	}

}
