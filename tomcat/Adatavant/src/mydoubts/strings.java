package mydoubts;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "madam"; 
		String s2 = ""; // new String(s1); 
		System.out.println(s1 + " equals " + s2 + " -> " + s1.equals(s2)); 
		System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
		for(int i=s1.length()-1;i>=0;i--){
			s2=s2+s1.charAt(i);
			
		}
		System.out.println(s2);
		System.out.println(s1==s2);
		int ascii=s1.codePointAt(4);
		System.out.println(ascii);

	}

}
