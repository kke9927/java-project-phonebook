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
		System.out.println("Data has been updated successfully\n");
		person[count++] = new PhoneInfo(name, pNumber, birthday); // Important..
		System.out.println(count);
	}

	public void searchData() {
		Boolean m = false;

		System.out.println("Let's start to find data...");
		System.out.print("Name : ");
		String name = in.next();

		for (int i = 0; person[i] != null; i++) {
			if (person[i].getName().equals(name)) {
				person[i].showPhoneInfo();
				m = true;
			}
		}
		if (!m)
			System.out.println("Cannot find Data..");
	}

	public int search(String name) {
		for (int idx = 0; idx < count; idx++) {
			if (person[idx].getName().equals(name))
				return idx;
		}
		return -1;
	}

	public void deleteData() {

		System.out.println("Let's start to delete data...");
		System.out.print("Name : ");
		String name = in.next();
		int dataIdx = search(name);
		if (dataIdx < 0) {
			System.out.println("Cannot find data...");
		} else {

			for (int idx = dataIdx; idx < count; idx++) {

				person[idx] = person[idx + 1];

				count--;
				System.out.println("Data has been deleted successfully\n");
			}
			person[count] = null;
		}

	}

	public void showData() {
		int quty = 0;

		if (person[0] != null)
			for (int i = 0; person[i] != null; i++) {
				person[i].showPhoneInfo();
				quty++;
			}
		if (quty > 0)
			System.out.println("You have " + quty + " info in phone book");
		else
			System.out.println("nothing to show you\n");
	}

}
