package seventeenth;

public class staicmethodcallandinstancemethodcall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staicmethodcallandinstancemethodcall s=new staicmethodcallandinstancemethodcall();
		s.instancemethod();
		staticmethod();

	}
	int c;
	static int d;
	public void instancemethod(){
		System.out.println("The value of instance variable c inside the instance method of s1 instance is"+" "+c);
		staticmethod();
		this.instancemethod();
		
	}
	public static void staticmethod(){
		System.out.println("The value of instance variable c inside the static method of s2 instance is"+" "+d);
		//staicmethodcallandinstancemethodcall s=new staicmethodcallandinstancemethodcall(); correct
		//s.instancemethod(); correct
		//this.instancemethod(); wrong
		
	}

}
