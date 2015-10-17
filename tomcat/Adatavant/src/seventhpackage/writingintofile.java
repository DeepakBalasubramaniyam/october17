package seventhpackage;

import java.util.Formatter;
public class writingintofile {
	Formatter fr;
	public void open(){
		try{
		fr=new Formatter("c:\\deepak\\deepak.txt");
		System.out.println("written");
		}
		catch(Exception error){
			System.out.println("cannot find file");
		}
	}
    public void write(){
		fr.format("DR MGR UNIVERSITY");
	}
    public void close(){
		fr.close();
	}
    
    public static void main(String args[]){
    	writingintofile w=new writingintofile();
    	w.open();
    	w.write();
    	w.close();
    }

}
