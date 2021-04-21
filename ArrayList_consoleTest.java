package week05.day3.arrayList2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_consoleTest {

	public static void main(String[] args) {
		ArrayList<Member>  arr = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<3; i++) {
			System.out.print("회원아이디"); int id=sc.nextInt();
			System.out.print("회원이름");String name= sc.next();
			Member m = new Member( id, name);
			arr.add(m);
		}
		
		for( int i=0; i< arr.size(); i++) {
			System.out.println(  arr.get(i));
		}
		 
	}

}