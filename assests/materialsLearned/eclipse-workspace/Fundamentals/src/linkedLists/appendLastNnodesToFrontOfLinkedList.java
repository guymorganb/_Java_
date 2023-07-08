package linkedLists;

public class appendLastNnodesToFrontOfLinkedList {
	
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		//Your code goes here
		if(head == null || n <= 0) {
            return head;
        }

        // calculate the length of the list
        Node<Integer> temp = head;
        int length = 0;
        while(temp != null) {
            temp = temp.next;
            length++;
        }

        // if n is greater than the length of the list, reduce n
        n = n % length;
        if(n == 0) {
            return head;
        }

        // find the new split point
        int splitPoint = length - n;

        temp = head;
        int count = 1;

        // traverse the list to the split point
        while(count < splitPoint && temp != null) {
            temp = temp.next;
            count++;
        }

        // if we found a valid split point
        if(temp != null) {
            Node<Integer> newHead = temp.next; // the new head is the next node
            temp.next = null; // disconnect the old list after the split point

            // find the last node in the list
            temp = newHead;
            while(temp.next != null) {
                temp = temp.next;
            }

            // connect the last node to the old head
            temp.next = head;
            head = newHead; // the new head of the list
        }

        return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
