package week05.day3.arrayList2;
class Member2{
	String id;
	String name;	
	public Member2(String id, String name) {
		this.id =id;
		this.name = name;		
	}	
	public String getBornYear() {
		return id.substring(0, 4);
	}
	@Override
	public String toString() {
		return id + "  " + name;
	}	
}
public class MyArrayListTest {		
	public static void main(String[] args) {	
		/*
		Object obj1 = new Member2("200112104903211", "kim");
		Object obj2 = new Member2("199601101207654", "lee");
		Object obj3 = new Member2("200112104903212", "park");
		
		*/
		MyArrayList  list = new MyArrayList();		
		list.add(new Member2("200112104903211", "kim"));		
		list.add(new Member2("199601101207654", "lee"));
		list.add(new Member2("200112104903212", "park"));		
		for(int i=0; i< list.size();i++) {
			//System.out.println( list.get(i).toString());	
			System.out.println( list.get(i));
			 Object  obj = list.get(i);
			 Member2 tmp = (Member2)obj;			 			
			//제네릭이 아닌 버젼은 가져올때 cast 해 줘야 하는 번거로움이 있다.
		//	Member2 tmp = (Member2)list.get(i);
			//System.out.println(tmp.getBornYear());			
		}
	}

}
