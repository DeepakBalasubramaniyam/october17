package listsetmap;
import java.util.ArrayList;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(4);
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.add(2,3);
		System.out.println(al);
		for(Object abc:al){
			System.out.println(abc);
			
		}



	}

}
