package fourthpackage;
import java.util.*;
public class methodoverrideareaofsqtrirec {
	Scanner input=new Scanner(System.in);
	int a;
	public void area(){
		if(a==1){
			System.out.println("Area of square");
			System.out.println("Enter the length of side");
			double no=input.nextDouble();
			double ans=no*no;
			System.out.println("The area of square is"+" "+ans+" "+"sq units.");
			
		}
		else{
			System.out.println("Incorrect option");
		}
		
	}

}
class second extends methodoverrideareaofsqtrirec{
	Scanner input=new Scanner(System.in);
	
	int a;
    public void area(){
    	if(a==2){
    		System.out.println("Area of rectangle");
    		System.out.println("Enter the height of the rectangle");
    		double no1=input.nextDouble();
    		System.out.println("Enter the width of the rectangle");
    		double no2=input.nextDouble();
    		double ans1=no1*no2;
    		System.out.println("The area of rectangle is"+" "+ans1+" "+"sq units.");
			
    	}
    	else if((a==1)||(a>3)||(a<1)){
    		super.a=this.a;
    		super.area();
    	}
	}
}
class third extends second{
	Scanner input=new Scanner(System.in);
	
	int a;
    public void area(){
    	
    	if(a==3){
    		System.out.println("Area of triangle");
    		System.out.println("Enter the base of the triangle");
    		double no1=input.nextDouble();
    		System.out.println("Enter the vertical height of the triangle");
    		double no2=input.nextDouble();
    		double ans=((1.0/2)*(no1*no2));
    		System.out.println("The area of triangle is"+" "+ans+" "+"sq units.");
			
        	
    	}
    	else if((a==2)||(a==1)||(a>3)||(a<1)){
    		super.a=this.a;
    		super.area();
    	}
    	
    	
	}
}
