package week05.day3.arrayList2;
import java.util.ArrayList;

class Member{
	private int memberId;
	private String memberName;
	
	public Member(int   memberId, String memberName) {
		this.memberId= memberId;
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberId +" " + memberName;
	}
	public String getMemberName() {
		return memberName;
	}
	
}
//��������, �ߺ����
public class ArrayList_GenericTest {

	public static void main(String[] args) {
		 
		ArrayList<Member>  arr = new ArrayList<>();
		
		Member m = new  Member(100, "��ȸ��");		
		arr.add(m);   // �������� add()
		
		Member m1 = new  Member(101, "��ȸ��");		
		arr.add(m1);
		
		Member m3 = new  Member(101, "��ȸ��");		
		arr.add(m3);
		
		Member m2 = new  Member(102, "��ȸ��");		
		arr.add(m2);
		
		
		for( int i=0 ; i< arr.size(); i++) {
			System.out.println( arr.get(i));   // ��䳻���� ������ ����  get(index)
			// System.out.println( arr.get(i).toString() ); 
			System.out.println( arr.get(i).getMemberName() );
			
		}
		
		

	}

}
