package com.example.EmployeeDetails.EmployeeDetailsDto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.EmployeeDetails.EmployeeDao.EmployeeDaoImp;


public class EmployeeDto {
	
	 private String empName;
	 private String empFatherName;
	 private String emailId;
	 private int contactNo;
	 private String empAddress;
	 private List<AdressBookDto> AdressOfEmployee;
	 private String DOB;
	 private int adharCard;
	 private AdharInfoDto adharinfo;
	 private String empDepartment;
	 private String empDesignation;
	 private String maritalStatus;
	 private String bankDetail;
	 private List<BankDetailDto> bankDetails;
	 public EmployeeDto() {
		 
	 }
	// List<AdressBookDto> empAddress,
	 //this.empAddress = empAddress;
//	public EmployeeDto(String empName, String empFatherName, String emailId, int contactNo,
//			  String dOB, int adharCard, String empDepartment, String empDesignation,
//			String maritalStatus, String bankDetail) {
//		super();
//		this.empName = empName;
//		this.empFatherName = empFatherName;
//		this.emailId = emailId;
//		this.contactNo = contactNo;
//		
//		DOB = dOB;
//		this.adharCard = adharCard;
//		this.empDepartment = empDepartment;
//		this.empDesignation = empDesignation;
//		this.maritalStatus = maritalStatus;
//		this.bankDetail = bankDetail;
//	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpFatherName() {
		return empFatherName;
	}

	public void setEmpFatherName(String empFatherName) {
		this.empFatherName = empFatherName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public List<AdressBookDto> getAdressOfEmployee() {
		return AdressOfEmployee;
	}

	public void setAdressOfEmployee(List<AdressBookDto> adressOfEmployee) {
		AdressOfEmployee = adressOfEmployee;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public int getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(int adharCard) {
		this.adharCard = adharCard;
	}
	
	public AdharInfoDto getAdharinfo() {
		return adharinfo;
	}

	public void setAdharinfo(AdharInfoDto adharinfo) {
		this.adharinfo = adharinfo;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getBankDetail() {
		return bankDetail;
	}

	public void setBankDetail(String bankDetail) {
		this.bankDetail = bankDetail;
	}

	public List<BankDetailDto> getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(List<BankDetailDto> bankDetails) {
		this.bankDetails = bankDetails;
	} 
	 
}	