package phonebook;

import java.util.Scanner;

public class PhoneBookv4 {

	public static void showMenu() // Display main menu
	{
		System.out.println("Choose..");
		System.out.println("1. Add data");
		System.out.println("2. Search data");
		System.out.println("3. Delete data");
		System.out.println("4. Show data");	
		System.out.println("5. Exit");
		System.out.print("Enter : ");
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		PhoneBookManager manager = new PhoneBookManager();

		while (true) {
			showMenu();
			int n = in.nextInt(); // choose menu
			in.nextLine(); // White space "Enter"

			switch (n) {
			case 1:
				System.out.println("1. normal 2. University 3. Company");
				System.out.print("Enter : ");
				int c = in.nextInt();
				manager.addData(c); 
				break; // keyword "break" which means escape this switch method

			case 2:
				manager.searchData();
				break;

			case 3:
				manager.deleteData();
				break;

			case 4:
				manager.showData();
				break;
			case 5:
				System.out.println("Program is done");
				return;
			}
		}
	
	}

}
