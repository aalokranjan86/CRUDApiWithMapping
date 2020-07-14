package com.example.EmployeeDetails.EmployeeModel;

import java.util.List;

import javax.persistence.*;




@Entity
@Table(name="adressbook")
public class AdressBook {
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   @Column(name="id")
	   private int adressId;
	   
	   @Column(name="plotno")
	   private int HouseNo;
	   
	   @Column(name="adress_street")
	   private String street;
	   
	   @Column(name="city")
	   private String City;
	   
	   @Column(name="district")
	   private String District;
	   
	   @Column(name="state")
	   private String State;
	   
	   @Column(name="pincode")
	   private int PinCode;
	   
	   @Column(name="country")
	   private String Country;
	   
	
	  @ManyToOne(cascade = CascadeType.ALL)
//	  @JoinColumn(name = "empid",referencedColumnName = "empid",insertable=false,updatable=false) 
	  private EmployeeBo employee;
	  
	  public EmployeeBo getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeBo employee) {
		this.employee = employee;
	}

	public AdressBook() {
		  
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
	  
	  

}
