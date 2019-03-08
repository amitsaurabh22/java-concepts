
public class TestMain {

	public static void main(String[] args) {
		Volume v = new Volume();
		
		if(v instanceof Volume){
			System.out.println("it is instance");
		}else{
		
		FIleSystem fs =(FIleSystem)v;
		fs.toString();
		}

	}

}
