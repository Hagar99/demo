package dataStructure;

public class QueueLinkedList <T>{

	int length = 0;
	Node front, rear;
	
	class Node{
		
		T item;
		Node next;
	}
	
	public QueueLinkedList() {
		front = rear = null;
	}
	
	boolean isEmpty() {
		return(front == null && rear == null);
	}
	
	
	void enQueue(T item) { // add to the last
		Node node = new Node();
		node.item = item;
		if(isEmpty()) {
			front = rear = node;
		}else {
			rear.next = node;
			rear = node;
			length++;
		}
	}
	
	void deQueue() { // delete first
	
		if(isEmpty())
			System.out.println("Queue is Empty!");
		else {
		    front = front.next;
		    if(front == null) rear = null;
		    length--;
		}
		
	}
	
	void getFront() {
		if(isEmpty())
			System.out.println("Queue is Empty!");
		else System.out.println(front.item);
	}
	
	
	void getRear() {
		if(isEmpty())
			System.out.println("Queue is Empty!");
		else System.out.println(rear.item);
	}
	
	void display() {
		if(isEmpty())
			System.out.println("Queue is Empty!");
		else {
			Node cur = front;
			while(cur != null) {
				System.out.println(cur.item);
				cur = cur.next;
			}
		}
	}
}
