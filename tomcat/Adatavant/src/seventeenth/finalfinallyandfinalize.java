package seventeenth;

public class finalfinallyandfinalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int a=5;
		
		//a=6;
		try{
			int b=1;
			int c=a/b;
			System.out.println(c);
			
		}
		catch(Exception error){
			System.out.println("error");
		}
		finally{
			System.out.println("ok");
		}
		
		finalfinallyandfinalize f=new finalfinallyandfinalize();
		f=null;
		System.gc();

	}

}
/*final class A{
	
}
class B extends A{
	
}*/
class C{
	final void C(){
		System.out.println("c");
	}
	
}
class D extends C{
	/*public void C(){
		
	}*/
	
}