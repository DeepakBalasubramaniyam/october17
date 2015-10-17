package seventeenth;

public class stringeualsmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String a=new String("abc");
		String b=new String("abc");
		if(a==b){
			System.out.println("== using new keyword id is true");
		}
		else{
			System.out.println("== using new keyword id is false");
			
		}
		
		String c=new String("abc");
		String d=c;
		if(c==d){
			System.out.println("== without using new keyword id is true");
		}
		else{
			System.out.println("== without using new keyword id is false");
			
		}
		
		String e="abc";
		String f="abc";
		if(e==f){
			System.out.println("== using only string is true");
		}
		else{
			System.out.println("== using only stringis false");
			
		}*/
		
		String a="abc";
		String c=new String("abc");
		String e=new String("abc");
		
		String b="abc";
		String d=new String("abc");
		String f=e;
		
		System.out.println("Is String objects equal using only string"+" "+a==b);
		System.out.println("Is String objects equal using new keyword"+" "+c==d);
		System.out.println("Is String objects equal by equalling one String to another"+" "+e==f);
		
		

	}

}
