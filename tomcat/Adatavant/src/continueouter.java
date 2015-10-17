
public class continueouter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:
		for(int i=1;i<=10;i++){
			inner:
			for(int j=1;j<=10;j++){
				if(i>=j){
					System.out.print(i+" "+j+"\t");
					
				}
				else{
					System.out.println();
					continue outer;
				}
				
			}
		}

	}

}
