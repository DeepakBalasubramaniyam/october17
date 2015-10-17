package seventeenth;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistLinkedListTimecomparrison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList in Iterator");
		System.out.println();
		ArrayList al=new ArrayList();
		long s_=System.currentTimeMillis();
		for(int i=1;i<=500000;i++){
			
		for(Object abc:al){
			//System.out.println(abc);
			
		}
		}
		long e_=System.currentTimeMillis();
		System.out.println("Arraylist is much faster in iterator");
		System.out.println("Here it took"+" "+(e_-s_)+" "+"ms");
		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		System.out.println("LinkedList in Iterator");
		System.out.println();
		LinkedList ll=new LinkedList();
		long s=System.currentTimeMillis();
		for(int i=1;i<=500000;i++){
		for(Object abc:ll){
			//System.out.println(abc);
			
		}
		}
		long e=System.currentTimeMillis();
		System.out.println("Linkedlist is not much faster in iterator");
		System.out.println("Here it took"+" "+(e-s)+" "+"ms");
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println();
		
		System.out.println("ArrayList in adding and removing operations");
		System.out.println();
		
		
		ArrayList al2=new ArrayList();
		long s2=System.currentTimeMillis();
		
		for(int i=1;i<=5000;i++){
		al2.add(1);
		al2.add(2);
		al2.add(2);
		al2.add(4);
		al2.remove(1);
		}
		long e2=System.currentTimeMillis();
		System.out.println("Arraylist is not much faster in adding and removing operations");
		System.out.println("Here it took"+" "+(e2-s2)+" "+"ms");
		System.out.println("--------------------------------------------------------------------");
		
		System.out.println();
		
		
		LinkedList ll2=new LinkedList();
		long s3=System.currentTimeMillis();
		
		for(int i=1;i<=5000;i++){
		ll2.add(1);
		ll2.add(2);
		ll2.add(2);
		ll2.add(4);
		ll2.remove(1);
		}
		long e3=System.currentTimeMillis();
		System.out.println("Linkedlist is much faster in adding and removing operations");
		System.out.println("Here it took"+" "+(e3-s3)+" "+"ms");
		System.out.println();
		
		
		
		

		


	}

}
