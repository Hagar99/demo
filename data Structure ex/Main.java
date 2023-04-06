package dataStructure;

import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main implements Comparator<Integer> {
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
	

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);

		
		
		
//		Set<String> strings =  new TreeSet<>(); /// sorted
//		strings.add("looo");
//		strings.add("fola"); // fola  looo
//		
//		Iterator<String> it = strings.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}


//		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(new Main());
//		  
//        // Adding items to the pQueue using add()
//        pQueue.add(10);
//        pQueue.add(20);
//        pQueue.add(15);
//        System.out.println(pQueue);
// 
//        // Printing the top element of PriorityQueue
//        System.out.println(pQueue.peek());
//        System.out.println(pQueue);
//        // Printing the top element and removing it
//        // from the PriorityQueue container
//        System.out.println(pQueue.poll());
//        System.out.println(pQueue);
//  
//        // Printing the top element again
//        System.out.println(pQueue.peek());
//        System.out.println(pQueue);
//        
        
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int i=0;i<3;i++){
//            pq.add(i);
//            pq.add(1);
//        }
//        System.out.println(pq);
		
//		 PriorityQueue<String> pq = new PriorityQueue<>();
//		    
//	        pq.add("Geeks");
//	        pq.add("For");
//	        pq.add("Geeks");
//	    
//	        System.out.println(pq);
		
		
//		ArrayDeque<String> ar = new ArrayDeque<>();
//	
//		ar.add("kefaya");
		
		
//		Stack<Double> st = new Stack<>();
//		
//		java.util.Stack<Double> st2 = new java.util.Stack<>();
//		st2.push(1.1);
//		st2.push(5.23);
//		st2.push(2.8);
//		st2.pop();
//		//st.getTop();
//		Iterator<Double> it = st2.iterator();
//				
//		while(it.hasNext())
//			System.out.print(it.next() + " ");
		
		
		
//		DoublyLinkedList<Integer> db = new DoublyLinkedList<>();
//		
//		db.insertAtPos(0, 6);
//		db.insertAtPos(1, 4);
//		db.insertLast(9);
//		db.insertLast(7);
//		db.insertFirst(3);
////		db.removeLast();
////		db.removeAtPos(1);
//		db.removeItem(4);
//		
//		db.display();
		
		
		
		
//		SinglyLinkedList<String> link = new SinglyLinkedList<>();
//		
//		link.addLast("Hagar");
//		link.addLast("Samah");
//		link.addLast("mona");
//		link.addLast("Nono");
//		link.addFirst("Mavia");
//	
//		System.out.println(link.search("ko"));
//		link.reverse();
		
//     	link.removeItem("mxz");
//     	link.removeItem("mona");
//		link.removeLast();
//		link.print();
		
		
		
//		QueueLinkedList<Object> koko = new QueueLinkedList<>();
//		
//		koko.enQueue('F');
//		koko.enQueue('W');
//		koko.enQueue(2);
//		koko.deQueue();
//		koko.enQueue('P');
//		koko.getRear();
//		koko.display();
//		
		
	
		
		
//		Circular_Queue<Integer> q = new Circular_Queue<>(10);
//		
//		q.EnQueue(5);
//		q.EnQueue(1);
//		q.deQueue();
//		q.EnQueue(8);
//		System.out.println(q.getFront());
//		System.out.println(q.getRear());
//		q.display();
//		
//		StackLinkedList<Character> stack = new StackLinkedList<>();
//		
//		String str = sc.nextLine();
//		boolean ans = true;
//		
//		int idx = 0;
//		while(idx < str.length()) {
//			if(str.charAt(idx) == '[' || str.charAt(idx) == '(' || str.charAt(idx) == '{')
//				stack.push(str.charAt(idx));
//			
//			if (stack.isEmpty() & (str.charAt(idx) == ')' || str.charAt(idx) == ']' || str.charAt(idx) == '}')) {
//				ans = false;
//				break;
//			} else {
//
//				if (str.charAt(idx) == ')' && stack.top.item == '(')
//					stack.pop();
//				else if (str.charAt(idx) == '}' && stack.top.item == '{')
//					stack.pop();
//				else if (str.charAt(idx) == ']' && stack.top.item == '[')
//					stack.pop();
//			}
//			idx++;
//		}
//		
//		if(!ans|| !stack.isEmpty()) System.out.println("Not Correct!");
//		else System.out.println("Right Expr");
		
//		st.push(1);
//		st.push(4);
//		st.print();
//		System.out.println(st.isEmpty());
//		
//		st.pop();
//		st.pop();
//		st.print();

		

	}




}
