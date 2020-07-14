package com.example.EmployeeDetails.EmployeeDetailsDto;

public class AdressBookDto{
	
	 private int adressId;	
	 private int HouseNo;
	 private String street;
	 private String City;
	 private String District;
	 private String State;
	 private int PinCode;
	 private String Country;
     private EmployeeDto employee;
//	 
//	 public AdressBookDto(int adressId, int houseNo, String street, String city, String district, String state,
//			int pinCode, String country) {
//		super();
//		this.adressId = adressId;
//		HouseNo = houseNo;
//		this.street = street;
//		City = city;
//		District = district;
//		State = state;
//		PinCode = pinCode;
//		Country = country;
//	}

	public AdressBookDto() {
		 
	 }
	
	public int getAdressId() {
		return adressId;
	}

	public void setAdressId(int adressId) {
		this.adressId = adressId;
	}

	public int getHouseNo() {
		return HouseNo;
	}

	public void setHouseNo(int houseNo) {
		HouseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getDistrict() {
		return District;
	}

	public void setDistrict(String district) {
		District = district;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPinCode() {
		return PinCode;
	}

	public void setPinCode(int pinCode) {
		PinCode = pinCode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	
	public EmployeeDto getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeDto employee) {
		this.employee = employee;
	}
	//EmployeeDto xcv=new EmployeeDto();
	 
}
