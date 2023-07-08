package linkedLists;
import java.util.Scanner;
public class userInputLinkedList {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
