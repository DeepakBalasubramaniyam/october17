package seventeenth;

public class staticmembersandinstancemenbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticmembersandinstancemenbers s1=new staticmembersandinstancemenbers();
		staticmembersandinstancemenbers s2=new staticmembersandinstancemenbers();
		s1.a=1;
		s2.a=2;
		System.out.println("s1 instance a value is"+" "+s1.a);
		System.out.println("s2 instance a value is"+" "+s2.a);
		System.out.println();
		
		staticmembersandinstancemenbers.b=1;
		staticmembersandinstancemenbers.b=2;
		System.out.println("The value of static variable b is"+" "+staticmembersandinstancemenbers.b);
		System.out.println();
		
		s1.c=3;
		s2.c=4;
		
		s1.instancemethod();
		s2.instancemethod();
		
		staticmembersandinstancemenbers.d=5;
		staticmembersandinstancemenbers.d=6;
		staticmembersandinstancemenbers.staticmethod();
		


	}
	int a;
	static int b;
	int c;
	static int d;
	public void instancemethod(){
		System.out.println("The value of instance variable c inside the instance method of s1 instance is"+" "+c);
		
	}
	public static void staticmethod(){
		System.out.println("The value of instance variable c inside the static method of s2 instance is"+" "+d);
		
		
	}

}
