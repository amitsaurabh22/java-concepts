import java.lang.reflect.Method;


public class TestReflex {
	
	public static void main(String[] ars){
		
		Rectangle rec = new Rectangle(10, 5);
		try {
			Class<? extends Rectangle> cls=rec.getClass();
			System.out.println("class name is "+cls.getName());
			Method method = cls.getMethod("getArea", null);
			int result = (int) method.invoke(rec, null);
			System.out.println("area is "+result);
			
			Method privateMethod = cls.getDeclaredMethod("privateMethod", null);
			privateMethod.setAccessible(true);
			privateMethod.invoke(rec, null);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
