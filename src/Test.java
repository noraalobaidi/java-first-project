import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		Test user = new Test();
//		user.createFile();
		user.sortByName();
	}
	
	public void createFile() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter file name :");
		String filename = input.next();
		 File theFile = new File("../java-first-project/files/"+filename+".txt"); //This wouldn't create a file
	        System.out.println();
	        if (theFile.exists())
	        {
	        	System.out.println("The file "+theFile.getName()+" already exists");
	        }
	        else 
	        {
	        	try {
		            theFile.createNewFile();//Actually creates it
		            System.out.println("The file "+theFile.getName()+" created Successfully !");
		        } catch (IOException e) {
		            throw new RuntimeException(e);
		        }
	        }
	        
		
	}
	
	public void sortByName () {
		File directoryPath = new File("../java-first-project/files/");
		String [] arr=directoryPath.list();
		ArrayList<String> array = new ArrayList();

		for(String file:arr) {array.add(file);}

		for(String file :array) {System.out.println(file);}
		Collections.sort(array);
		System.out.println("list sorted");
		for(String file :array) {System.out.println(file);}
		 
	}
}
