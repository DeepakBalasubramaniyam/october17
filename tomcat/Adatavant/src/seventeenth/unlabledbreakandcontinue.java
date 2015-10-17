package seventeenth;

public class unlabledbreakandcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//unlabled break and continue
		for(int i=1;i<=10;i++){
			System.out.println("In loop"+" "+i);
			System.out.println();
			if(i==5){
				continue;				
			}			
			System.out.println("continue loop is running");	
			
			if(i==7){
				break;				
			}
			System.out.println("Break loop is running");	
			System.out.println();
			
			}
		
			System.out.println("loop gets stopped before the either the end of for loop or because of break statement");
			}
		
		

	}


