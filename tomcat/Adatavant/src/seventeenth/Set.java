package seventeenth;
import java.util.*;
public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs1=new HashSet();
		HashSet<Integer> hs2=new HashSet();
		HashSet<Character> hs3=new HashSet();
		HashSet hs4=new HashSet();
		
		hs1.add("one");
		hs1.add("two");
		hs1.add("three");
		hs1.add("four");
		hs1.add("five");
		hs1.add("six");
		hs1.add("seven");
		hs1.add("eight");
		hs1.add("nine");
		hs1.add("ten");
		hs1.add("eleven");
		hs1.add("twelve");
		
		hs2.add(5);
		hs2.add(1);
		hs2.add(1);
		
	    hs3.add('K');
		hs3.add('P');
		hs3.add('P');
		
		hs4.add(1);
		hs4.add("krishna");
		hs4.add('K');
		hs4.add('K');
		
		System.out.println("HashSet Examples");
		System.out.println();
		System.out.println("HashSet using only string"+" "+hs1);
		System.out.println("HashSet using only Integer"+" "+hs2);
		System.out.println("HashSet using only Character"+" "+hs3);
		System.out.println("HashSet using anything"+" "+hs4);
		System.out.println();
		
		TreeSet<String> ts1=new TreeSet();
		TreeSet<Integer> ts2=new TreeSet();
		TreeSet<Character> ts3=new TreeSet();
		TreeSet ts4=new TreeSet();
		
		ts1.add("Krishna");
		ts1.add("Narayana");
		ts1.add("Narayana");
		
		ts2.add(5);
		ts2.add(1);
		ts2.add(1);
		
	    ts3.add('K');
		ts3.add('P');
		ts3.add('P');
		
		/*ts4.add(1);
		ts4.add("krishna");
		ts4.add('K');
		ts4.add('K');*/
		
		System.out.println("TreeSet Examples");
		System.out.println();
		System.out.println("TreeSet using only string"+" "+ts1);
		System.out.println("TreeSet using only Integer"+" "+ts2);
		System.out.println("TreeSet using only Character"+" "+ts3);
		//System.out.println("TreeSet using anything"+" "+ts4);
		System.out.println();
		




	}

}
