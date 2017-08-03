package phonebook;

class PhoneInfo {

	private String name;
	private String phoneNumber;
	private String birthday;
	
	
	public PhoneInfo(String name, String phoneNumber, String birthday) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	void showPhoneInfo()
	{
		System.out.println("\nShow phone info..");
		System.out.println("Name : " + name +  " \nPhone Number : " + phoneNumber + " \nbirthday : " + birthday);
		System.out.println();
	}
}

