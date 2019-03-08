package increment;

public class Incriment {

	public static void main(String[] args) {
		int x=0;
		int y=5;
		System.out.println(--y);

		y=++x;

		y=x++;
		x=y;
		
		System.out.println(++x);
		System.out.println(x++);
		
		y=5;
		System.out.println(x==y);
		System.out.println(x);
	}

}
