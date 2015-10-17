package seventeenth;

public class stringstringbufferandstringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="narayana";
		System.out.println("STRING OBJECTS");
		System.out.println();
		System.out.println(a.concat(" krishna"));
		System.out.println(a);
		System.out.println();
		
		System.out.println("STRINGBUFFER OBJECTS");
		System.out.println();
		StringBuffer sbuff=new StringBuffer("narayana");
		System.out.println(sbuff.append(" krishna"));
		System.out.println(sbuff);
		System.out.println();
		
		
		System.out.println("STRINGBUILDER OBJECTS");
		System.out.println();
		StringBuilder sbuil=new StringBuilder("narayana");
		System.out.println(sbuil.append(" krishna"));
		System.out.println(sbuil);
		System.out.println();
		
		
		
				

	}

}
