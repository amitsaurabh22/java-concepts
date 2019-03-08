import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			
			list.add(sc.next());
		}
		System.out.println(list);
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
			
	
		System.out.println(list);
	
	}



public static void compareNumberAsString(){

	// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	String one = sc.nextLine();
	String two = sc.nextLine();
	int result =one.compareTo(two);
	if (result > 0) {

		System.out.println("larger number is" + one);
	} else if (result == 0) {
		System.out.println("numbers are equal" + one);
	} else {

		System.out.println("larger number is" + two);
	}
	}

}