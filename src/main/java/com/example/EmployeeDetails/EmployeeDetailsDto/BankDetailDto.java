package com.example.EmployeeDetails.EmployeeDetailsDto;

import java.util.List;

public class BankDetailDto {

	 private String CustomerName;
	 private int AcctNo;
	 private String BankName;
	 private String IFSC;
	 private String Branch;
	 //private List<EmployeeDto> employee;
	 public BankDetailDto() {
		 
	 }
//	public List<EmployeeDto> getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(List<EmployeeDto> employee) {
//		this.employee = employee;
//	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public int getAcctNo() {
		return AcctNo;
	}

	public void setAcctNo(int acctNo) {
		AcctNo = acctNo;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}
	 
	 
}
