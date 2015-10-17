package fourthpackage;
import java.util.*;

public class Miletokmandcmtometerconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the centimeter to convert it into it's equivalent meter");
		double a=input.nextDouble();
		while(a>=0){
		double b=a/100;
		System.out.println(a+" "+"cm"+" "+"is equal to"+" "+b+" "+"m");
		a=-1;
		}
		
		System.out.println("enter the mile to convert it into it's equivalent kilometer");
		double c=input.nextDouble();
		double d=1.60934;
		while(c>=0){
			double e=c*d;
			System.out.println(c+" "+"miles"+" "+"is equal to"+" "+e+" "+"km");
			c=-1;
		}

		

	}

}
