package loop;

public class TestLoop {
	
	public static void  main(String...  arg) {
		
		create10Employe();
		
	}
	
	
	public static void create10Employe(){
		Employee emp =null;
		for(int i=0;i<10;i++){
			if(emp!=null){
				
				System.out.println("Before "+emp.getId());
			}
			 emp = new Employee(i);
			 System.out.println("After "+emp.getId());
		}
		
	}
	
	
	public static void create10EmployeVersion2(){
		Employee emp2 =null;
		for(int i=0;i<10;i++){

			if(emp2!=null){
				
				System.out.println("Before "+emp.getId());
			}
			Employee emp =null;
			 emp = new Employee(i);
			 System.out.println("After "+emp.getId());
		}
		
	}

}
