package dataStructure;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T extends Comparable<T>>{
	
	int length = 0;
    Node root;
	
	class Node{
		T item;
		Node left, right = null;
	}
	
	void preorderTraverse(Node parent) { // root left right
		
		if(parent != null) {
			System.out.println(parent.item);
			preorderTraverse(parent.left);
			preorderTraverse(parent.right);
		}
	}
	
	void inorderTraverse(Node parent) { // left root right
		if(parent != null) {
			preorderTraverse(parent.left);
			System.out.println(parent.item);
			preorderTraverse(parent.right);
		}
	}
	
	
	void postOrder(Node parent) { // left right root
		if(parent != null) {
			preorderTraverse(parent.left);
			preorderTraverse(parent.right);
			System.out.println(parent.item);
		}
	}
	
	
	void BFS(Node parent) { // printing by level order BFS
		if(parent == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.offer(parent);
		while(!q.isEmpty()) {
			if(q.peek().left != null)
				q.add(q.peek().left);
			if(q.peek().right != null)
				q.add(q.peek().left);
			
			System.out.println(q.poll());
		}
	}

	
//	void insert(T item) {
//		Node node = new Node();
//		node.item = item;
//		if(length == 0) node.left = node.right = null;
//		else {
//			int cmp;
//			Node cur = root;
//			while(cur != null) {
//				cmp = item.compareTo(item); 
//				if(cmp > 0) // new node bigger than the root
//					cur = cur.right;
//				else
//					cur = cur.left;
//			}
//		}
//		
//	
//	}

	
	

}
