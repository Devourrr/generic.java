package week05.day3.arrayList2;

import java.util.ArrayList;


public class ArrayList_NoGenericTest {

	public static void main(String[] args) {
		 
		ArrayList   arr = new ArrayList();
		
		Member m = new  Member(100, "��ȸ��");		
		arr.add(m);
		
		Member m1 = new  Member(101, "��ȸ��");		
		arr.add(m1);
		
		Member m2 = new  Member(102, "��ȸ��");		
		arr.add(m2);
		
		
		for( int i=0 ; i< arr.size(); i++) {
			System.out.println( arr.get(i));
			// System.out.println( arr.get(i).toString() ); 
			 Member tmp=  (Member) arr.get(i);
			 System.out.println( tmp.getMemberName());
			
		}
		
	}

}
