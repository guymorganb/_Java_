package linkedLists;


// linked list nodes store data, and the address of the next node that its attached too.
public class Node <T>{
		T data;
		Node <T> next;		// makes a pointer to the next node
		
		Node(T data){		
			this.data = data;
		}
		
}
