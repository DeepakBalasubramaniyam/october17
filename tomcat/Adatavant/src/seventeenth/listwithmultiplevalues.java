package seventeenth;

import java.util.*;

public class listwithmultiplevalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		value value1=new value(1,"Krishna","India");
		LinkedList ll=new LinkedList();
		value value2=new value(2,"Mani","India");
		value value3=new value(3,"Yuvraj","Australia");
		value value4=new value(4,"Raju","America");
		ll.add(value1);
		ll.add(value2);
		ll.add(value3);
		ll.add(value4);
		System.out.println(ll);
		
		
		
		
		

	}

}
class value{
	String name,place;
	int a;
	public value(int a,String name,String place){
		this.a=a;
		this.name=name;
		this.place=place;
		System.out.println(this.a+","+this.name+","+this.place);
		
	}
}
