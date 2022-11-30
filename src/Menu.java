import java.util.Scanner;

public abstract class Menu {
 public abstract void displayMenu();

public int getOpt() {
	 Scanner input = new Scanner(System.in);
	 int opt = input.nextInt();
	 return opt;
 }
 
 public abstract void switchOpt(int opt);
 
	
}

 class MainMenu extends Menu{

	
	 @Override
		public void displayMenu() {
			System.out.println("\n  *************************************************");
			System.out.println("  *                  Main Menu                    *");
			System.out.println("  *************************************************");
			System.out.println("  * Please select an option from the list:        *");
			System.out.println("  *                                               *");
			System.out.println("  *       1- Sort files in ascending order        *");
			System.out.println("  *       2- Files Sub-menu                       *");
			System.out.println("  *       3- Exit                                 *");
			System.out.println("  *                                               *");
			System.out.println("  *************************************************");
			System.out.print("    Enter selection and then press ENTER :");
			
			
			
			
			
		}

	@Override
	public void switchOpt(int opt) {
		
//		SubMenu sub = new SubMenu();
		switch (opt){
		
		case 1:
			System.out.println("\n");
			new LockersPvt().sortByName();
			break;
		case 2:
			SubMenu sub = new SubMenu();
			int option;
			do {
				sub.displayMenu();
				option=sub.getOpt();
				sub.switchOpt(option);
			}
			while(option!=4);
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("");
			System.out.print("\n\n    --- Please enter a value between 1 to 3 ---\n\n");

		}
		
	}
	 
}
 
 class SubMenu extends Menu{

	 @Override
		public void displayMenu() {
			System.out.println("\n  *************************************************");
			System.out.println("  *                Files sub-menu                 *");
			System.out.println("  *************************************************");
			System.out.println("  * Please select an option from the list:        *");
			System.out.println("  *                                               *");
			System.out.println("  *       1- Add file                             *");
			System.out.println("  *       2- Delete file                          *");
			System.out.println("  *       3- Search for a file                    *");
			System.out.println("  *       4- Back                                 *");
			System.out.println("  *                                               *");
			System.out.println("  *************************************************");
			System.out.print("    Enter selection and then press ENTER :");
			
			
			
			
			
		}

	@Override
	public void switchOpt(int opt) {
		
		switch (opt){
		
		case 1:
			System.out.println("\n");
			new LockersPvt().createFile();
			break;
		case 2:
			System.out.println("\n");
			new LockersPvt().deleteFile();
			break;
		case 3:
			System.out.println("\n");
			new LockersPvt().searchFile();
			break;
		case 4:
//			System.out.println("\n");
//			new MainMenu().displayMenu();
			break;
		default:
			System.out.println("");
			System.out.print("\n\n    --- Please enter a value between 1 to 4 ---\n\n");

		}
		
	}
	 
	 
 }
 
