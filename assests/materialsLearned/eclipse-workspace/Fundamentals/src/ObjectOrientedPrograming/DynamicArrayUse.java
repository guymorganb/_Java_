package ObjectOrientedPrograming;
import java.util.ArrayList;
public class DynamicArrayUse {

	public static void main(String[] args) {
		DynamicArray d = new DynamicArray();
		
		for(int i = 1; i < 10; i++) {
			d.add(10 + i);
		}
		
		
		
		
		System.out.println(d.size());
		
		System.out.println(d.get(0));
		System.out.println(d.get(1));
		System.out.println(d.get(2));
		System.out.println(d.get(3));
		System.out.println(d.get(4));
		System.out.println(d.get(5));
		System.out.println(d.get(6));
		System.out.println(d.get(7));
		System.out.println(d.get(8));
		
		
		
		System.out.println(d.length());
		
		d.add(2);
		
		System.out.println(d.get(0));
		System.out.println(d.get(1));
		System.out.println(d.get(2));
		System.out.println(d.get(3));
		System.out.println(d.get(4));
		System.out.println(d.get(5));
		System.out.println(d.get(6));
		System.out.println(d.get(7));
		System.out.println(d.get(8));
		System.out.println(d.get(9));
		
		System.out.println(d.length());
//		
		d.removeLast();
		System.out.println("space");
		System.out.println(d.get(8));
		
		System.out.println(d.length());
//		d.set(3, 170);
//		System.out.println(d.get(3));
//		
//		while(! disEmpty()) {
//			System.out.println(d.removeLast());
//			System.out.println("size -" + d.size());
//			
//		}
		
	}

}
