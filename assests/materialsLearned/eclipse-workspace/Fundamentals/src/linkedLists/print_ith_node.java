package linkedLists;

public class print_ith_node  {

	public static void ithNode(Node<Integer> head, int i) {
	Node<Integer> temp = head;
    int count = 0;
    while(temp != null){
    	if(count == i){
    		System.out.println(temp.data);
    		return;
    	}else{
    		count++;
    		temp = temp.next;
    	}
    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
