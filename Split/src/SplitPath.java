import java.util.Arrays;
import java.util.List;


public class SplitPath {

	public static void main(String[] args) {
		//test1();
		//test2();
		test3();
	}
	
	private static void test1(){
		String paths=",";
		  List<String> pathList = Arrays.asList(paths.split(","));		  
		  System.out.println(pathList);
	}
	
	private static void test2(){
		String[]  nameOrDomain= new String[2];
		
		String name1="emc"+"\\"+"amit";
		String name2="amit";
		nameOrDomain=name1.split("\\\\");
		System.out.println(nameOrDomain[1]);
		System.out.println(nameOrDomain[0]);
	
	}
	
	private static void test3(){
		String ids="UID:7877";
		String[]  uid= new String[2];
		uid= ids.split(":");	
		if(uid.length>1){
		Integer idvalue=Integer.parseInt(uid[1]);
		System.out.println(idvalue);
		
		if(idvalue < 1000000){
	}
		}
	}
	
	
}
