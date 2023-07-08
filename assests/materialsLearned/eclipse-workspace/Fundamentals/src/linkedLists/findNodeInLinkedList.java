package linkedLists;

public class findNodeInLinkedList {

	public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		Node<Integer> temp = head;
		int index = 0;
		while(temp != null){
			if(temp.data == n){
				// If the data is found, return the current index
				return index;
			}else{
				index++;
				temp = temp.next;
			}
		}
		// If the loop completes without finding the data, return -1
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
