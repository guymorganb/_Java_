package ObjectOrientedPrograming;

public class DynamicArray {
	// keep an internal array
	
	private int data[];
	
	private int nextElementIndex;
	
	public DynamicArray(){
		data = new int[5];
		nextElementIndex = 0;		// sets initial element index to 0, so when calling add() an element is added to the next open index
	}
	
	public int size() {
		return nextElementIndex;
	}
	
	public boolean isEmpty() {
		return nextElementIndex == 0;
	}
	
	public int get(int i) {
		if(i >= nextElementIndex) {
			// throw error i is out of bounds
			return -1;	
		}
		return data[i];
	}
	
	public void set(int i, int num) {
		if(i >= nextElementIndex) {
			// throw error
			return;
		}
		data[i] = num;
		
	}
	
	public void add(int elem) {
		if(nextElementIndex == data.length) {
			increaseCapacity(elem);
		}
		 data[nextElementIndex] = elem;
		 nextElementIndex+=1;
	}
	
	private void increaseCapacity(int elem) {
		int[] newData = new int[data.length+1];
		for(int i = 0, j = elem; i < data.length+1; i++) {
			if(i < data.length) {
			newData[i] = data[i];
			}else {
				newData[i]=j;
			}
		}
		data = newData;
	}

	public void removeLast() {
		if(nextElementIndex == 0) {
			return;		// if array is empty, return
		}
		int[] newData = new int[data.length-1];
		for(int i = 0; i < newData.length; i++) {
			newData[i] = data[i];
		}
		nextElementIndex --;
		data = newData;
	}
	
	public int length() {
		return data.length;
	}
	
}
