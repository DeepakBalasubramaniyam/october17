package sixthpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class exceptions {
	
	//method 1
	public void arrayoutofrange() {
		FileInputStream fis=null;
		try{ 
			//negative index
			int l[]=new int[5];
			l[1]=-1;
			System.out.println(l[1]);
			
			//file not found
			fis=new FileInputStream("c:\\deepak\\deepak.txt");
			
			//string index out of bound
			String name="deepak";
			char ch=name.charAt(5);
			System.out.println(ch);
			
			//class not found
			//Class.forName("com.mysql.jdbc.Driver");
			
			//arithmetic
			int a=5,b=1;
			int c=a/b;
			System.out.println(c);
			
			//array index out of bound
			int d[]=new int[5];
			d[0]=1;
			d[1]=2;
			d[2]=3;
			d[3]=4;
			d[4]=5;
			d[5]=6;
			System.out.println(d[5]);
			
			
		}
		catch(ArrayIndexOutOfBoundsException error){
    		System.out.println("array index not found exception"+" "+error);
    		
    	}
		catch(ArithmeticException error){
			System.out.println("Arithmeticexception error"+" "+error);
		}
	    /*catch(ClassNotFoundException error){
			System.out.println("class not found exception"+" "+error);
		}*/
		catch(StringIndexOutOfBoundsException error){
			System.out.println("string error");
			
		}
		catch(FileNotFoundException error){
			System.out.println("file not found");
		}
		catch(NegativeArraySizeException error){
			System.out.println("negative array size exception");
			
		}
			
	}
	
	//method 2
	public void arithmetic() {
		FileInputStream fis=null;
		try{ 
			//negative index
			int l[]=new int[5];
			l[1]=-1;
			System.out.println(l[1]);
			
			//file not found
			fis=new FileInputStream("c:\\deepak\\deepak.txt");
			
			//string index out of bound
			String name="deepak";
			char ch=name.charAt(3);
			System.out.println(ch);
			
			//class not found
			//Class.forName("com.mysql.jdbc.Driver");
			
			//array index out of bound
			int d[]=new int[10];
			d[0]=1;
			d[1]=2;
			d[2]=3;
			d[3]=4;
			d[4]=5;
			d[5]=6;
			System.out.println(d[4]);
			
			//arithmetic
			int a=5,b=0;
			int c=a/b;
			System.out.println(c);
			
			
			
		}
		catch(ArrayIndexOutOfBoundsException error){
    		System.out.println("array index not found exception"+" "+error);
    		
    	}
		catch(ArithmeticException error){
			System.out.println("Arithmeticexception error"+" "+error);
		}
	    /*catch(ClassNotFoundException error){
			System.out.println("class not found exception"+" "+error);
		}*/
		catch(StringIndexOutOfBoundsException error){
			System.out.println("string error");
			
		}
		catch(FileNotFoundException error){
			System.out.println("file not found");
		}
		catch(NegativeArraySizeException error){
			System.out.println("negative array size exception");
			
		}
			
	}

	//method 3
	public void stringoutofrange() {
		FileInputStream fis=null;
		try{ 
			//negative index
			int l[]=new int[5];
			l[2]=5;
			System.out.println(l[2]);
			
			//file not found
			fis=new FileInputStream("c:\\deepak\\deepak.txt");
			
			
			//arithmetic
			int a=5,b=1;
			int c=a/b;
			System.out.println(c);
			
			//array index out of bound
			int d[]=new int[10];
			d[0]=1;
			d[1]=2;
			d[2]=3;
			d[3]=4;
			d[4]=5;
			d[5]=6;
			System.out.println(d[5]);
			
			
			//string index out of bound
			String name="deepak";
			char ch=name.charAt(6);
			System.out.println(ch);
			
			//class not found
			//Class.forName("com.mysql.jdbc.Driver");
			
			
		}
		catch(ArrayIndexOutOfBoundsException error){
    		System.out.println("array index not found exception"+" "+error);
    		
    	}
		catch(ArithmeticException error){
			System.out.println("Arithmeticexception error"+" "+error);
		}
	    /*catch(ClassNotFoundException error){
			System.out.println("class not found exception"+" "+error);
		}*/
		catch(StringIndexOutOfBoundsException error){
			System.out.println("string error");
			
		}
		catch(FileNotFoundException error){
			System.out.println("file not found");
		}
		catch(NegativeArraySizeException error){
			System.out.println("negative array size exception");
			
		}
			
	}

	//method 4
	public void file() {
		FileInputStream fis=null;
		try{ 
			//string index out of bound
			String name="deepak";
			char ch=name.charAt(1);
			System.out.println(ch);
			
			//class not found
			//Class.forName("com.mysql.jdbc.Driver");
			
			//arithmetic
			int a=5,b=1;
			int c=a/b;
			System.out.println(c);
			
			//array index out of bound
			int d[]=new int[10];
			d[0]=1;
			d[1]=2;
			d[2]=3;
			d[3]=4;
			d[4]=5;
			d[5]=6;
			System.out.println(d[5]);
			
		
			//negative index
			int l[]=new int[5];
			l[3]=3;
			System.out.println(l[3]);
			
			//file not found
			fis=new FileInputStream("exists.txt");
			
				
		}
		catch(ArrayIndexOutOfBoundsException error){
    		System.out.println("array index not found exception"+" "+error);
    		
    	}
		catch(ArithmeticException error){
			System.out.println("Arithmeticexception error"+" "+error);
		}
	    /*catch(ClassNotFoundException error){
			System.out.println("class not found exception"+" "+error);
		}*/
		catch(StringIndexOutOfBoundsException error){
			System.out.println("string error");
			
		}
		catch(FileNotFoundException error){
			System.out.println("file not found");
		}
		catch(NegativeArraySizeException error){
			System.out.println("negative array size exception");
			
		}
			
	}

	//method 5
	public void negativeindex() {
		FileInputStream fis=null;
		try{ 
			
			//file not found
			fis=new FileInputStream("c:\\deepak\\deepak.txt");
			
			//string index out of bound
			String name="deepak";
			char ch=name.charAt(4);
			System.out.println(ch);
			
			//class not found
			//Class.forName("com.mysql.jdbc.Driver");
			
			//arithmetic
			int a=5,b=1;
			int c=a/b;
			System.out.println(c);
			
			//array index out of bound
			int d[]=new int[10];
			d[0]=1;
			d[1]=2;
			d[2]=3;
			d[3]=4;
			d[4]=5;
			d[5]=6;
			System.out.println(d[5]);
			
			//negative index
			int l[]=new int[-5];
			l[-1]=-1;
			System.out.println(l[-1]);
			
			
		}
		catch(ArrayIndexOutOfBoundsException error){
    		System.out.println("array index not found exception"+" "+error);
    		
    	}
		catch(ArithmeticException error){
			System.out.println("Arithmeticexception error"+" "+error);
		}
	    /*catch(ClassNotFoundException error){
			System.out.println("class not found exception"+" "+error);
		}*/
		catch(StringIndexOutOfBoundsException error){
			System.out.println("string error"+" "+error);
			
		}
		catch(FileNotFoundException error){
			System.out.println("file not found"+" "+error);
		}
		catch(NegativeArraySizeException error){
			System.out.println("negative array size exception"+" "+error);
			
		}
			
	}


}
