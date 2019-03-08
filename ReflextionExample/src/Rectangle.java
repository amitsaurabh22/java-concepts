
public class Rectangle {
	
	
	private int lenght;
	
	private int width;
	

      public int getLenght() {
		return lenght;
	}


	public void setLenght(int lenght) {
		this.lenght = lenght;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public Rectangle(int lenght, int width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}


	public int getArea(){
    	 
    	 return lenght *width;
     }

	private void  privateMethod(){
   	 
   	 System.out.println("private method invoked");
    }

	
	

}
