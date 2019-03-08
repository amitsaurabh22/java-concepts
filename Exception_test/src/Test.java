
public class Test {
	
	public static void main(String[] args){
	try{
		
		String s = null;
		s.hashCode();
	}
	catch (NullPointerException e) {
        System.out.println("Error NullPointerException "+ e.getMessage());
        throw e;
    } catch (Exception e) {
    	  System.out.println("Error Exception"+ e.getMessage());
    }

}
}
