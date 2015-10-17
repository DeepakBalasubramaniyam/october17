
public class hashcodeandequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patient p1=new patient();
		patient p2=new patient();
		p1.id=1;
		p2.id=5;
		patient p3=new patient();
		patient p4=new patient();
		p3.id=5;
		p4.id=5;
		//System.out.println(p3==p4);
		
		System.out.println("Is p1 equals to p2"+" "+p2.equals(p1));
		System.out.println();
		System.out.println("Is p3 equals to p4"+" "+p3.equals(p4));
		System.out.println();
		
		System.out.println("Hashcode of p1 is"+" "+p1.hashCode());
		System.out.println("OriginalHashcode of p1 is"+" "+System.identityHashCode(p1));
		System.out.println();
		
		System.out.println("Hashcode of p2 is"+" "+p2.hashCode());
		System.out.println("OriginalHashcode of p2 is"+" "+System.identityHashCode(p2));
		System.out.println();
		
		System.out.println("Hashcode of p3 is"+" "+p3.hashCode());
		System.out.println("OriginalHashcode of p3 is"+" "+System.identityHashCode(p3));
		System.out.println();
		
		System.out.println("Hashcode of p4 is"+" "+p4.hashCode());
		System.out.println("OriginalHashcode of p4 is"+" "+System.identityHashCode(p4));
		


		/*patient p3=new patient();
		patient p4=new patient();
		p3.id=1;
		p4.id=5;
		System.out.println(p3.equals(p4));
		*/


	}

}

class patient{
	int id;
	public boolean equals(Object obj){
		if(obj instanceof patient){
			//System.out.println("1");
			patient patient=(patient)obj;
			//System.out.println("It takes the first object of patient from the main method"+" "+patient.id);
			//System.out.println("It takes the last object of patient from the main method"+" "+this.id);
			if(patient.id==this.id){
				System.out.println("2");
				//System.out.println(patient.id);
				//System.out.println(this.id);
				
				return true;
				
			}
			
			
		}
			return false;
		
	}
	public int hashCode(){
		return id;
	}
	
}