package seventeenth;

public class stringequalsethodinallways {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abc";
		String c=new String("abc");
		String e=new String("abc");
		String g=new String("abc");
		String i="abc";
		
		String b="abc";
		String d=new String("abc");
		String f=e;
		String h=new String("abc");
		String j=new String("abc");
		
		System.out.println("Is String objects equal using only string?"+" "+(a==b));
		System.out.println("Is String objects equal using new keyword?"+" "+(c==d));
		System.out.println("Is String objects equal by equalling one new String to another string?"+" "+(e==f));
		System.out.println("Is String objects equal by using equals method?"+" "+(g.equals(h)));
		System.out.println("Is String objects equal by equalling one String to another new string?"+" "+(i==j));
		

	}

}
