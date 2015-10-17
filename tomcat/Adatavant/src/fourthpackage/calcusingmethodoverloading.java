package fourthpackage;
import java.util.*;
public class calcusingmethodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcusingmethodoverloading z=new calcusingmethodoverloading();
		Scanner input=new Scanner(System.in);
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for subtraction");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter 4 for division");
		int a=input.nextInt();
		
		if(a==1){
			z.calc();
		}
		else if(a==2){
			z.calc("sub");
		}
		else if(a==3){
			z.calc(1);
		}
		else if(a==4){
			z.calc(1.5);
		}
		else{
			System.out.println("Sorry you entered the incorrect number");
		}
		
	
	}
	Scanner input1=new Scanner(System.in);
	public void calc(){
		System.out.println("welcome to addition part");
		System.out.println("enter the first number to add");
		double f=input1.nextDouble();
		System.out.println("enter the second number to add");
		double s=input1.nextDouble();
		double t=f+s;
		System.out.println("The addition of two numbers is"+" "+t);
		
	}
    public void calc(String sub){
    	System.out.println("welcome to subtraction part");
		System.out.println("enter the first number to subtract");
		double f=input1.nextDouble();
		System.out.println("enter the second number to subtract");
		double s=input1.nextDouble();
		double t=f-s;
		System.out.println("The subtraction is"+" "+t);
		
		
	}
    public void calc(int a){
    	System.out.println("welcome to multiplication part");
		System.out.println("enter the first number to multiply");
		double f=input1.nextDouble();
		System.out.println("enter the second number to multiply");
		double s=input1.nextDouble();
		double t=f*s;
		System.out.println("The multiplication of two numbers is"+" "+t);
		
	
    }
    public void calc(double b){
    	System.out.println("welcome to division part");
		System.out.println("enter the first number to divide");
		double f=input1.nextDouble();
		System.out.println("by which number you want to divide");
		double s=input1.nextDouble();
		double t=f/s;
		System.out.println("The addition of two numbers is"+" "+t);
		
	
    }
	
}