package phonebook;

public class PhoneUnivInfo extends PhoneInfo {

	String major;
	int year;
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}
	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.println("Major : " + major);
		System.out.println("Year : " + year + "\n");
		
	}
}
