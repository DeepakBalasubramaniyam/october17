package fourthpackage;

public class starpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=10;i++){
			for(int j=10;j>=1;j--){
				if(i>=j){
				System.out.print("*"+" ");
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println(" ");
		}*/
		int i=1;
		int j=10;
		while(i<=10){
			
			while(j>=1){
				if(i>=j){
					System.out.print("*"+" ");
				}else{
					System.out.print(" ");
				}
					j--;
					}
			i++;
			j=10;
			System.out.println();

	}

}
}
