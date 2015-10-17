package fourthpackage;
import java.util.*;

public class Factorialusingrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorialusingrecursion f=new Factorialusingrecursion();
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number to get the factorial:");
		int a=input.nextInt();
		int ans=factorial(a);
		if(ans>=1){
		System.out.println("The factorial of"+" "+a+" "+"is"+" "+ans);
		}
		else{
			System.out.println("please write correct number");
		}
		
				

	}
	public static int factorial(int b){
		if((b==0||b==1)){
			return 1;
			
		}
		else if(b>1){
			return b*factorial(b-1);
			
		}
		else{
			return b;
		}
		
		
		
		
			
	}
	

}
