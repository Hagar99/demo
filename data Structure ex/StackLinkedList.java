package dataStructure;

public class StackLinkedList<T>{
	
     Node top;
	private int length;
	
	class Node{
		T item;
		Node next;
	}
	
	public StackLinkedList() {
		length = 0;
		top = null;
	}
	
	void push(T item) {
		Node node = new Node();
		node.item = item;
		node.next = top;
		top = node;
		length++;
	}

	boolean isEmpty() {
		return length == 0;
	}
	
	void pop() {
		
		if(isEmpty())
			System.out.println("Don't pop");
		
		else {
			 Node tem = top;
			top = top.next;
			tem = tem.next = null;
		}
		length--;
		
	}
	
	void print () {
		Node cur = top;

		if(cur == null)
		       System.out.println("Empty!");
		while (cur != null) {
		
			System.out.println(cur.item);
			cur = cur.next;
		}
	}
}
