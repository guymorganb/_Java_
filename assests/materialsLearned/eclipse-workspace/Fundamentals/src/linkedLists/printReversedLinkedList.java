package linkedLists;

public class printReversedLinkedList {
	public static void printReverse(Node<Integer> root) {
		//Your code goes here
		 if (root == null) {
            return;  // Base case of recursion: if the list is empty, do nothing.
        }
        
        printReverse(root.next);  // Recursive call: print the rest of the list.

        System.out.print(root.data + " ");  // Print the current node after the rest of the list has been printed.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
