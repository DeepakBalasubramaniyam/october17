package Hahtable;

import java.util.*;

public class Hashtableexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
		ht.put(1, "narayana");
		ht.put(5, "krishna");
		ht.put(10, "perumal");
		ht.put(10, "god");
		
		/*ht.put(null, "god");
		ht.put(null, null);
		ht.put(null, null);*/
		System.out.println(ht);
		HashMap hm=new HashMap();
		hm.put(1,"narayana");
		hm.put(2, "krishna");
		hm.put(null, null);
		hm.put(null, null);
		hm.put(5, null);
		
		System.out.println(hm);
		Vector v=new Vector();
		for(int i=1;i<=10;i++){
			v.addElement(i);
			
		}
		System.out.println(v);
		
		
		
		
		

	}

}
