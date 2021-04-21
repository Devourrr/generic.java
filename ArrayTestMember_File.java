package week05.day3.arrayList2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTestMember_File {

	public static void main(String[] args) throws FileNotFoundException {
	 
		ArrayList<Member2> list = new ArrayList<>();
		
		Scanner sc = new Scanner( new File("member.txt"));
		
		while( sc.hasNext()) {
		   String input = sc.nextLine();		   
		   System.out.println(input);
		   
		   Scanner sc2= new Scanner(input).useDelimiter(",");
		   String id =sc2.next();  //주민번호
		   String name= sc2.next(); //이름
		   
		   Member2 member = new Member2( id, name);
		   list.add(member);   
		}
		
		
		for( int i=0 ; i< list.size(); i++) {
			System.out.println(  list.get(i)  );	
			System.out.println(  list.get(i).getBornYear()  );			
		}

		
	}

}
/*
 * 
 199912011902877,kim
199812011902877,lee
199412011902877,park
*/

