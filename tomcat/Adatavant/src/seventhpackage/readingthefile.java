package seventhpackage;
import java.util.*;
import java.io.File;
public class readingthefile {
	Formatter fr;
	Scanner input;
	public void open(){
		
		try{
			input=new Scanner(new File("c:\\deepak\\deepak.txt"));
			
		}
		catch(Exception error){
			System.out.println("file not found");
		}
		
	}
    public void read(){
    	while(input.hasNext()){
    		String content=input.next();
    		System.out.print(content+" ");
    		
    	}
		
	}
    public void close(){
    	input.close();
	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readingthefile r=new readingthefile();
		r.open();
		r.read();
		r.close();

	}

}
