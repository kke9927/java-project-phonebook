package phonebook;

import java.util.Scanner;

public class PhoneBookManager {

	Scanner in = new Scanner(System.in);
	PhoneInfo[] person = new PhoneInfo[100]; // Data can be stored only 100
	int count = 0;

	public void addData() {
		System.out.print("Name : ");
		String name = in.next();
		System.out.print("PhoneNumber : ");
		String pNumber = in.next();
		System.out.print("Birthday : ");
		String birthday = in.next();
		System.out.println("Data has been updated successfully");
		person[count] = new PhoneInfo(name, pNumber, birthday); // Important..
		count++;

	}

	public void searchData() {
		System.out.println("Let's start to find data...");
		System.out.print("Name : ");
		String name = in.next();

		for (int i = 0; person[i] != null; i++) {
			if (person[i].getName().equals(name)) {
				System.out.println("Name : " + person[i].getName());
				System.out.println("PhoneNumber : " + person[i].getPhoneNumber());
				System.out.println("Birthday : " + person[i].getBirthday());

				System.out.println("I find! yay");
			} else
				System.out.println("Cannot find data...");
			System.out.println(" ");
		}
	}
	
	public void deleteData()
	{
		System.out.println("Let's start to delete data...");
		System.out.print("Name : ");
		String name = in.next();
		
		for(int i = 0; person[i] != null; i++)
		{
			if(person[i].getName().equals(name))
			{
				person[i] = null;
				person[i] = person[i+1];
			}
		}
	}

}
