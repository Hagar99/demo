package dataStructure;

public class DoublyLinkedList <T>{

	int length;
	Node head;
	Node tail;
	
	class Node{
		T item;
		Node prev;
		Node next;
	}
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		length = 0;
	}
	
	
	boolean isEmpty() {
		return length == 0;
	}
	
	void insertFirst(T element) {
		Node node = new Node();
		node.item = element;
		if (length == 0) {
			head = tail = node;
			node.next = node.prev = null;
		} else {
			node.next = head;
			head.prev = node;
			node.prev = null;
			head = node;
		}
		length++;
	}

	void insertLast(T element) {
		Node node = new Node();
		node.item = element;
		if(length == 0) {
			head = tail = node;
			node.next = node.prev = null;
		} else {
		     node.prev = tail;
		     tail.next = node;
		     node.next = null;
		     tail = node;
		}
		length++;
	}
	
	
	void insertAtPos(int pos, T element) {
		Node node = new Node();
		node.item = element;
		if(pos < 0 || pos > length)
			System.out.println("Can't Add");
		else if(pos == 0) 
			insertFirst(element);
		else if(pos >= length-1)
			insertLast(element);
		else {
			Node cur = head;
			for(int i = 0 ; i < pos-1; i++) { //  node before position
			   	cur = cur.next;
			}
			node.next = cur.next; // pointing to the node at pos 1
			node.prev = cur;
			cur.next.prev = node;
			cur.next = node;
			
			length++;
		}
	}
	
	void removeFirst() {
		if (length == 0)
			System.out.println("Can't Remove!");
		else {
			if (length == 1) {
				head = tail = null;
			} else {
				head = head.next;
				head.prev = null;
			}
			length--;
		}
	}
	
	void removeLast() {
		if(length == 0) 
			System.out.println("Can't Remove!");
		else {
			if(length == 1)
				head = tail = null;
			else {
				tail.prev.next = null; // or after the next line put tail.next = null
				tail = tail.prev;
			}
			length--;
		}
	}
	

	void removeAtPos(int pos) {
		if(pos < 0 || pos > length)
			System.out.println("Can't Add");
		else if(pos == 0) 
			removeFirst();
		else if(pos >= length-1)
			removeLast();
		else {
			Node cur = head;
			for(int i = 1; i < pos; i++)
				cur = cur.next;
			
			cur.next = cur.next.next; // cur.next points to the latest node
			cur.next.prev = cur;
			
			length--;
		}
	}
	
	void removeItem(T item) {
		if(length == 0)
			System.out.println("Can't Remove!");
		else {
			Node cur = head;
			while(cur != null && cur.item != item) {
				cur = cur.next;
			}
			
			if(cur == null) 
				System.out.println("Item Not found!");
			else {
				if(cur == head)
					removeFirst();
				else if(cur == tail)
					removeLast();
				else {
					cur = cur.prev; // cur points to the previous node
					cur.next = cur.next.next;
					cur.next.prev = cur;	
				}
				
				length--;
			}
		}
	}
	
	void display() {
		
		Node cur = head;
		for(int i = 0; cur != null ; i++) {
			System.out.println(cur.item);
			cur = cur.next;
		}
		
	}
	
	
}
