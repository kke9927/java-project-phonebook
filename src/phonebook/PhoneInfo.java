package phonebook;

class PhoneInfo {

	private String name;
	private String phoneNumber;
	
	
	public PhoneInfo(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;

	}


	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public void showPhoneInfo()
	{
		System.out.println("Name : " + name +  " \nPhone Number : " + phoneNumber);
	}
}

