
public class hashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashcode h=new hashcode();
		System.out.println(h.hashCode());
		String a="hai";
		String b="hai";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a==b);
		String c=new String("hai");
		System.out.println(c.hashCode());
		System.out.println(a==c);
		
	}

}
