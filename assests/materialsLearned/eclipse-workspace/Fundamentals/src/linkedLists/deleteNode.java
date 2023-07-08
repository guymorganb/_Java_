package linkedLists;

public class deleteNode {

	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.
		if(pos == 0){
			// delete node head
			if(head != null){
				head = head.next;
			}
			return head;
		}
		Node<Integer> temp = head;
		int count = 0;

		// find the node preceding the one we want to delete
		while (temp != null && count < pos - 1){
			temp = temp.next;
			count++;
		}
			// If we've found such a node and it's not the last one
		if (temp != null && temp.next != null) {
			// Bypass the node we want to delete
			temp.next = temp.next.next;
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
