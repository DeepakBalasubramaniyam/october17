package seventeenth;

public class labeledbreakandcontinueusinbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop1:
			for(int i=1;i<=10;i++){
				loop2:
				for(int j=1;j<=10;j++){
					System.out.println(i+"-"+j);
					
					if(j==5){
						break loop1;
						}
					
				}
				
			}


	}

}
