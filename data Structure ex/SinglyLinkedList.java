package dataStructure;

// default LinkedList
public class SinglyLinkedList <T> {

	class Node{
		
		T item; // value
		Node next; // pointer
	}
	
	
	
	private Node head; // pointing to the first element
	private Node tail;
	private int length = 0;
	
	public SinglyLinkedList() { // constructor
		head = tail = null;
		length = 0;
	}
	
	
	boolean isEmpty() {
		return length == 0;
	}
	
	
	void addFirst(T item){ // this element will be the first 
		
		Node node = new Node();
		node.item = item;
		
		if(length == 0) {
			head = tail = node;
			
		}else {
			node.next = head;
			head = node;
		}
		
		length++;
	}
	
	
	void addLast(T item) { // this element will be the last
		
		Node node = new Node();
		node.item = item;
		
		if(length == 0) {
			head = tail = node;
		}else {
			tail.next = node;
			tail = node;
		}
		
		length++;
	}
	
	void randomInsertion(T element, int indx) { // 1-based index
		
		if(indx < 1) 
			System.out.println("Out of Range!");
		else if(indx == 1)
			addFirst(element);

		else if(indx == length)
			addLast(element);
		else{
			
		Node node = new Node();
		node.item = element;
		Node cur = head;
		
		for(int i = 0; i < indx - 1; i++) { // node before the inserted element
			cur = cur.next;
		}
		
		node.next = cur.next;
		cur.next = node;

		length++;
		}
	}

	
	void removeFirst() {
		if (length == 0)
			System.out.println("LinkedList is Empty!");
		else {
			if (length == 1)
				head = tail = null;
			else {
				head = head.next;
			}

			length--;
		}
   }
	
	
	void removeLast() {
		if (length == 0)
			System.out.println("LinkedList is Empty!");
		else {
			if (length == 1)
				head = tail = null;
			else {
				Node cur = head.next;
				Node prv = head;
				
				while(cur != tail) {
					prv = cur;
					cur = cur.next;
				}
				
				prv.next = null;
				tail = prv;
			}

			length--;
		}

	}
	
	
	void removeItem(T item) {
		if(length == 0)
			System.out.println("LinkedList is Empty!");
		else if (head.item == item) {
			removeFirst();
			length--;
		}
		else {
			Node prv = head, cur = head.next;
			while (cur != null && cur.item != item) {
				prv = cur;
				cur = cur.next;
			}

			if(cur == null)
				System.out.println("Item Not Found!");
			else if (cur == tail)
				removeLast();
			else {
				prv.next = cur.next;
				cur.next = null;
			}
			length--;
		}
		
		if(length == 0) 
			head = tail = null;
	}
	
	void reverse() {
		
		Node prv = null, cur = head , nxt = head.next;
		
		while(nxt != null) {
			nxt = cur.next;
			cur.next = prv;
			prv = cur;
			cur = nxt;
		}
		
		head = prv;
	}
	
	int search(T item) {
		int pos = -1;
		if(length == 0)
			return pos;
		else {
			Node cur = head;
			
			while(cur != null) {
				if(cur.item == item) {
					return pos;
				}
				cur = cur.next;
				pos++;
			}
		
			return -1;
			
		}
	}
	
	void print() {
		
		Node node = head;
		if(head == null)
			System.out.println("Empty!");
		while(node != null) {
			System.out.println(node.item);
			node = node.next;
		}
	}
}
