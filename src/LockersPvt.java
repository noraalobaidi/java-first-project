import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LockersPvt {

	
	public static void main(String[] args) {
		LockersPvt user = new LockersPvt();
		MainMenu menu = new MainMenu();
		int opt;
		
		do {
			menu.displayMenu();
			opt = menu.getOpt();
			menu.switchOpt(opt);
			}
		while(opt!=3);
//		System.out.println("end");
		

		
		

	}
	
	public void createFile() {
		Scanner input = new Scanner(System.in);
		System.out.print("    Enter file name :");
		String filename = input.next();
		 File theFile = new File("../java-first-project/files/"+filename); //This wouldn't create a file
	        System.out.println();
	        if (theFile.exists())
	        {
	        	System.out.println("    The file "+theFile.getName()+" already exists");
	        }
	        else 
	        {
	        	try {
		            theFile.createNewFile();//Actually creates it
		            System.out.println("    The file "+theFile.getName()+" was created Successfully !");
		        } catch (IOException e) {
		            throw new RuntimeException(e);
		        }
	        }
	        
		
	}
	
	public String[] getAllFiles(){
		
		File directoryPath = new File("../java-first-project/files/");
		String [] arr=directoryPath.list();
		
		return arr;
		
		
		
	}
	
	public void sortByName () {
		String [] arr=getAllFiles();
		ArrayList<String> array = new ArrayList();

		for(String file:arr) {array.add(file);}

		Collections.sort(array, new Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        return s1.compareToIgnoreCase(s2);
		    }
		});
		System.out.println("    Files list sorted in ascending order:");
		System.out.println("    ****************************************");
		for(String file :array) {System.out.println("  "+file);}
		
		 
	}
	
	public void searchFile() {
		Scanner input = new Scanner(System.in);
		
		String [] arrOfAllFiles=getAllFiles();
		ArrayList<String> array = new ArrayList();
		for(String f:arrOfAllFiles) {array.add(f);}
		
		System.out.print("    Enter the name of the file:");
		String searchfile= input.nextLine();
		System.out.println("    ****************************");
		
		for (String f:array) {
			
			if (searchfile.toLowerCase().equals(f.toLowerCase()))
			{
				System.out.println("   File "+f+" was found");
//				System.out.println("  *********************");
				return;
			}
		}
		System.out.println("    File "+searchfile+" was not found");
//		System.out.println("  ***********************************");
		
		
		
	}
	
	public void deleteFile () {
		
		Scanner input = new Scanner(System.in);
		
		String [] arrOfAllFiles=getAllFiles();
		ArrayList<String> array = new ArrayList();
		for(String f:arrOfAllFiles) {array.add(f);}
		
		System.out.print("    Enter the name of the file you want to delete:");
		String searchfile= input.nextLine();
		System.out.println("    **********************************************");
		
		
		for (String f:array) {
			
			if (searchfile.toLowerCase().equals(f.toLowerCase()))
			{
				File fileToDelete= new File("../java-first-project/files/"+f);
				if (fileToDelete.delete())
				{
					System.out.println("    File "+f+" was deleted successfully");
					}
				else 
				{
					System.out.println("    Failed to delete the file ");  
		  
				}
				return;
			}
		}
		System.out.println("    File "+searchfile+" was not found");
		
	}
	
}
