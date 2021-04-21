package week05.day3.arrayList2;

public class MyArrayListG<T> {
	
	Object[] nums;
	int current;
	
	public MyArrayListG() {
		nums = new Object[3];
		current=0;
	}
	
	public void add( T obj) {
		nums[current]= obj;
		current++;
	}
	
	 
	public T get( int  index ) {
		 
		return (T) nums[index];
		
	}
	
	public int size() {
		return current;
	} 

}