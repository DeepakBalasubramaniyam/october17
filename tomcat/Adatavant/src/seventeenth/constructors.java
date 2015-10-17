package seventeenth;

public class constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructors c1=new constructors();
		constructors c2=new constructors(1,"Krishna",'K');


	}
	int a;
	String b;
	char c;
	public constructors(){
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		
	}
    public constructors(int a,String b,char c){
    	this.a=a;
    	this.b=b;
    	this.c=c;
    	System.out.println(this.a);
    	System.out.println(this.b);
    	System.out.println(this.c);
		
		
	}

}
