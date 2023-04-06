package dataStructure;

public class Circular_Queue <T>{
	
	int MAX_SIZE;
	int rear;
	int front = 0;
	int length = 0;
	Object arr[];
	
	public Circular_Queue(int mx) {
    	if(mx <= 0) mx = 100;
    	MAX_SIZE = mx;
		rear = MAX_SIZE;
		arr = new Object[MAX_SIZE];
	}
	
	boolean isEmpty() {
		
		return length == 0;
	}
	
	boolean isFull() {
		
		return length == MAX_SIZE;
	}
	
	void EnQueue(T element) {
	
		if(isFull())
			System.out.println("Queue is Full!");
		else {
			rear %= MAX_SIZE; // 0, 1, 0
			arr[rear++] = element;// 1, 2, 1 
			length++;
		}
	}
	

	void deQueue() {

		if (isEmpty())
			System.out.println("Queue is Empty!");
		else {
			front %= MAX_SIZE; // 0
			front++;// 1
			length--;
		}
	}
	
	
	Object getFront() {
		return (isEmpty() ? (Object) (-1) : (T) arr[front % MAX_SIZE]);
	}
    
	Object getRear() {
		return (isEmpty() ? (Object) (-1) : (T) arr[(rear-1) % MAX_SIZE]);
	}
	
	
	void display() {
		int i = front;
		do {
			System.out.println(arr[i++]);
			i%=MAX_SIZE;

		} while (i != rear);
	}
    
}
