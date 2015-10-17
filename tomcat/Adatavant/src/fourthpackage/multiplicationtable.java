package fourthpackage;
import java.util.*;

public class multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Which table you want to show?");
		int a=input.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(a+" "+"x"+" "+i+" "+"="+" "+(a*i));
			
		}

	}

}
