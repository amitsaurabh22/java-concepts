package genric;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dog> dog1 =new ArrayList<Animal>();
		ArrayList<Animal> animal1 =new ArrayList<Dog>();
		List<Animal> list =new ArrayList<Animal>();
		ArrayList<Dog> dogs =new ArrayList<Dog>();
		
		ArrayList<Animal> animals=dogs;
		List<Dog> doglist=dogs;
		ArrayList<Object> objects =new ArrayList<Object>();
		List<Object> objList=objects;
		ArrayList<Object> obj=new ArrayList<Dog>();

	}

}
