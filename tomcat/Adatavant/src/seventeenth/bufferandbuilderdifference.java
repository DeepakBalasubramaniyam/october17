package seventeenth;

public class bufferandbuilderdifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String();
		long s_=System.currentTimeMillis();
		for(int i=1;i<100000;i++){
			s.concat("String taken id");
			s.concat("Time");
			s.concat("taken");
			
		}
		long e_=System.currentTimeMillis();
		System.out.println("string objects used"+" "+((s_)-(e_))+" "+"ms");
		
		
		
		
		
		StringBuffer sbuff=new StringBuffer();
		long s_buff=System.currentTimeMillis();
		for(int i=1;i<100000;i++){
			sbuff.append("String buffer taken id");
			sbuff.append("Time");
			sbuff.append("taken");
			
		}
		long e_buff=System.currentTimeMillis();
		System.out.println("stringbuffer objects used"+" "+((s_buff)-(e_buff))+" "+"ms");
		
		
		
		
		StringBuilder sbuil=new StringBuilder();
		long s_buil=System.currentTimeMillis();
		for(int i=1;i<100000;i++){
			sbuil.append("String builder taken id");
			sbuil.append("Time");
			sbuil.append("taken");
			
		}
		long e_buil=System.currentTimeMillis();
		System.out.println("stringbuilder objects used"+" "+((s_buil)-(e_buil))+" "+"ms");
		
		

	}

}
