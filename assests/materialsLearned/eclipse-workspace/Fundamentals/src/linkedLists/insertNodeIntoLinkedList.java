package linkedLists;

import java.util.Scanner;

public class insertNodeIntoLinkedList {

	public static void print(Node <Integer> head) {
		System.out.println("Print " + head);
		
		while(head != null) {
			System.out.println(head.data);
			head = head.next;	// will set head to the address of the next node
		}
	}
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		// keep taking user input until user inputs -1
		int data = s.nextInt();
		// return the head
		Node<Integer> head = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			// check if head is null to assign head node
			if(head == null) {
				head = currentNode;
			}else {
				// create the connection to the next node
				Node<Integer> tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				// tail will reference last node
				// connect current node after last node
				tail.next = currentNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	
	public static Node<Integer> insert(Node<Integer> head, int elem, int pos) {
//		2 -> 8 -> 10 -> 15 -> 25
		// insert 20 at position 3
		// if you have to insert at position i, you must have the reference to position i-1
		// travel to i-1 node
		// make connection to i'th node before connecting i-1 node
		Node<Integer> newNode = new Node<Integer>(elem);
		
		
		// handle 0th position
		if (pos == 0) {
			newNode.next = head;
			return newNode;		// whenever there's a change in the head you need to return it so main gets it
		}
		int count = 0;
		// reference to node at previous position
		Node<Integer> prev = head;
		while(count < pos - 1) {
			count++;
			prev = prev.next;
		}
		if(prev != null) {
			// points to the new node
			// make connection before breaking the i-1 nodes connection
			newNode.next = prev.next;
			prev.next = newNode;
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		head = insert(head, 80, 2);
		print(head);
	}

}
