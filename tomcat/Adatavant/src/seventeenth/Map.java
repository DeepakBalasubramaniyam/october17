package seventeenth;
import java.util.*;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm1=new HashMap();
		HashMap<String,String> hm2=new HashMap();
		HashMap<Integer,String> hm3=new HashMap();
		HashMap<String,Integer> hm4=new HashMap();
		HashMap<Integer,Character> hm5=new HashMap();
		
		hm1.put(1,1);
		hm1.put(2,2);
		hm1.put(3,3);
		
		hm2.put("Krishna","perumal");
		hm2.put("Krishna","perumal");
		hm2.put("Krishna","Deepak");
		
	    hm3.put(1,"Krishna");
		hm3.put(2,"Narayana");
		hm3.put(3,"Krishna");
		
		hm4.put("Krishna",1);
		hm4.put("Narayana",2);
		hm4.put("Deepak",2);
		
		System.out.println("HashMap Examples");
		System.out.println();
		System.out.println("HashMap using <Integer,Integer>"+" "+hm1);
		System.out.println("HashMap using <String,String>"+" "+hm2);
		System.out.println("HashMap using <Integer,String>"+" "+hm3);
		System.out.println("HashMap using <String,Integer>"+" "+hm4);
		System.out.println();
		
		
		TreeMap<Integer,Integer> tm1=new TreeMap();
		TreeMap<String,String> tm2=new TreeMap();
		TreeMap<Integer,String> tm3=new TreeMap();
		TreeMap<String,Integer> tm4=new TreeMap();
		TreeMap<Integer,Character> tm5=new TreeMap();
		
		tm1.put(1,1);
		tm1.put(2,2);
		tm1.put(3,3);
		
		tm2.put("Krishna","perumal");
		tm2.put("Krishna","perumal");
		tm2.put("Krishna","Deepak");
		
	    tm3.put(1,"Krishna");
		tm3.put(2,"Narayana");
		tm3.put(3,"Krishna");
		
		tm4.put("Krishna",1);
		tm4.put("Narayana",2);
		tm4.put("Deepak",2);
		
		System.out.println("TreeMap Examples");
		System.out.println();
		System.out.println("TreeMap using <Integer,Integer>"+" "+tm1);
		System.out.println("TreeMap using <String,String>"+" "+tm2);
		System.out.println("TreeMap using <Integer,String>"+" "+tm3);
		System.out.println("TreeMap using <String,Integer>"+" "+tm4);
		System.out.println();
		




	}

}
