package seventeenth;
import java.util.*;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1=new ArrayList();
		ArrayList<Integer> al2=new ArrayList();
		ArrayList<Character> al3=new ArrayList();
		ArrayList al4=new ArrayList();
		
		
		al1.add("Krishna");
		al1.add("Narayana");
		al1.add("Narayana");
		
		al2.add(5);
		al2.add(1);
		al2.add(1);
		
		al3.add('K');
		al3.add('P');
		al3.add('P');
		
		al4.add(1);
		al4.add("krishna");
		al4.add('K');
		al4.add('K');
		
		System.out.println("ArrayList Examples");
		System.out.println();
		System.out.println("ArrayList using only string"+" "+al1);
		System.out.println("ArrayList using only Integer"+" "+al2);
		System.out.println("ArrayList using only Character"+" "+al3);
		System.out.println("ArrayList using anything"+" "+al4);
		System.out.println();
		
		LinkedList<String> ll1=new LinkedList();
		LinkedList<Integer> ll2=new LinkedList();
		LinkedList<Character> ll3=new LinkedList();
		LinkedList ll4=new LinkedList();
		
		
		ll1.add("Krishna");
		ll1.add("Narayana");
		ll1.add("Narayana");
		
		ll2.add(5);
		ll2.add(1);
		ll2.add(1);
		
		ll3.add('K');
		ll3.add('P');
		ll3.add('P');
		
		ll4.add(1);
		ll4.add("krishna");
		ll4.add('K');
		ll4.add('K');
		
		System.out.println("LinkedList Examples");
		System.out.println();
		System.out.println("LinkedList using only string"+" "+ll1);
		System.out.println("LinkedList using only Integer"+" "+ll2);
		System.out.println("LinkedList using only Character"+" "+ll3);
		System.out.println("LinkedList using anything"+" "+ll4);





	}

}
