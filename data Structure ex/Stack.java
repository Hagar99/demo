package dataStructure;

public class Stack <T> {

	
	private int top;
	int Max_Size = 100;
	Object arr[] = new Object[Max_Size];
	
	
	Stack(){
	
		top = -1;
	}
	
	boolean isEmpty(){
		if(top == -1) 
			return true;
		
		return false;
	}
	
	
	boolean isFull() {
		if(top >= Max_Size - 1)
			return true;
		
		return false;
	}
	
	void push(T elem) {
		if(isFull())
			System.out.println("The Stack is Full!");
		else 
			arr[++top] = elem;
		
	}
	
	
	void pop() {
		if(isEmpty())
			System.out.println("The Stack is Empty!");
		else
			top--;
	}

	
	void getTop() {
	
		if(isEmpty())
			System.out.println("Stack is Empty!");
		else 
			System.out.println(arr[top]);
	}
	void print() {
		
		System.out.print("{");
		
		for(int i = 0; i <= top; i++)
		{
		  if(i < top) System.out.print(arr[i] + ", ");
		  else System.out.print(arr[i]); 
		}
			
		System.out.println("}");
	}
	

}
