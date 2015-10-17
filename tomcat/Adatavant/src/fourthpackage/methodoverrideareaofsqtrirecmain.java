package fourthpackage;
import java.util.*;
public class methodoverrideareaofsqtrirecmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		third three=new third();
		Scanner input=new Scanner(System.in);
		System.out.println("enter 1 for Area of square");
		System.out.println("enter 2 for Area of rectangle");
		System.out.println("enter 3 for Area of triangle");
		int a=input.nextInt();
		three.a=a;
		three.area();
		





	}

}
