package model;

public class Customer 
{
	String username;
	String password;
	String customerName;
	String gender;
	String mobileNo;
	String emailId;
	String address;
	
	public Customer() {}
	
	public Customer(String username,String password,String cName,String gender,String emailid,String mobileNo,String address)
	{
		this.username=username;
		this.password=password;
		this.customerName=cName;
		this.gender=gender;
		this.mobileNo=mobileNo;
		this.emailId=emailid;
		this.address=address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
