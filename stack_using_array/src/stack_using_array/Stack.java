package stack_using_array;

public class Stack {
	
	public static final int CAPACITY=10;
	protected  int capacity;
	protected int[] stackRep;
	protected int top =-1;
	
	public Stack(){
		this(CAPACITY);
	}

	public Stack(int cap) {
		capacity=cap;
		stackRep= new int[capacity];
	}
	
	public int size(){
		
		return top+1;
	}
	
	public boolean isEmpty(){
		return (top<0);
		
	}
	
	public void push(int data) throws Exception{
		
		if(size()==CAPACITY){
			
			throw new Exception(" Stack is full");
			
		}
		stackRep[++top]=data;
	}
	public int top() throws Exception{
		if(top ==-1){
		throw new Exception("Stack is empty");	
		}
		return stackRep[top];
	}
		
	public int pop() throws Exception{
		if(top ==-1){
		throw new Exception("Stack is empty");	
		}
		return stackRep[top--];
	}
	@Override
	public String toString(){
		
		String s = "[";
		
		for(int i=0;i<=top;i++){
			
			s+=stackRep[i]+",";
		}
		s+="]";
		return s;
		
		
	}

}
