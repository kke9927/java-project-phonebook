package phonebook;

public class PhoneCompanyInfo extends PhoneInfo {

	String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}
	

	public void showPhoneInfo()
	{
		super.showPhoneInfo();
		System.out.print("Company : " + company + "\n");
	}

}
