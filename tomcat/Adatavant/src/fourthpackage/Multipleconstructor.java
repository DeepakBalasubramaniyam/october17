package fourthpackage;

public class Multipleconstructor {
	public Multipleconstructor(){
		System.out.println("Default constructor");
		
	}
    public Multipleconstructor(int a,int b){
    	System.out.println("addition is"+" "+(a+b));
		
	}
    public Multipleconstructor(int a,String b){
    	System.out.println(a+" "+"is integer and"+" "+b+" "+"is string");
	
    }
    public Multipleconstructor(String a,int b){
    	System.out.println(b+" "+"is integer and"+" "+a+" "+"is string");
    	
    }
    public Multipleconstructor(String a,String b){
    	System.out.println(a+" "+"and"+" "+b+" "+"both are strings");
    	
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipleconstructor m=new Multipleconstructor("narayana","narayana");

	}

}
