package week05.day3.arrayList2;

public class MyArrayListGTest {
	
	public static void main(String[] args) {
		
		MyArrayListG<Member2>  list = new MyArrayListG<>();
		list.add(new Member2("200112104903211", "kim"));
		list.add(new Member2("199601101207654", "lee"));
		list.add(new Member2("200112104903212", "park"));
		
		
					
		for(int i=0; i< list.size();i++) {
			System.out.println( list.get(i).getBornYear());
			System.out.println( list.get(i));
		}			

	}

}
