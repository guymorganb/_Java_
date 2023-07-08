package linkedLists;

public class eliminateDuplicates {
	
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
		if(head == null || head.next == null) {
            return head;  // If head is null or there is only one node, return head.
        }

        Node<Integer> current = head;
        while(current.next != null) {
            if(current.data.equals(current.next.data)) {
                current.next = current.next.next;  // If current node and next node have the same data, skip next node.
            } else {
                current = current.next;  // If current node and next node have different data, move to next node.
            }
        }
        return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
