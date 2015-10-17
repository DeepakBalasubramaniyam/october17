package lists;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList al=new ArrayList();
		al.add("narayana");
		al.add("krishna");
		al.add("perumal");
		System.out.println(al);*/
		Vector v=new Vector();
		v.addElement("abc");
		v.addElement("def");
		v.addElement("ghi");
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			Object name=e.nextElement();
			System.out.println(name);
			
		}



	}

}
