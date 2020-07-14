package com.example.EmployeeDetails.EmployeeDetailsDto;

public class AdharInfoDto {
	
	 private String NameOnAdhar;
	 private int Mobile;
	 private EmployeeDto employee;
	 
	public AdharInfoDto() {
		
	}
	public EmployeeDto getEmployee() {
		return employee;
	}


	public void setEmployee(EmployeeDto employee) {
		this.employee = employee;
	}
	public String getNameOnAdhar() {
		return NameOnAdhar;
	}
	public void setNameOnAdhar(String nameOnAdhar) {
		NameOnAdhar = nameOnAdhar;
	}
	public int getMobile() {
		return Mobile;
	}
	public void setMobile(int mobile) {
		Mobile = mobile;
	}
	 
	 

}
