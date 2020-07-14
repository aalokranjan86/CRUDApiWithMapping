package com.example.EmployeeDetails.EmployeeModel;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="employee")
public class EmployeeBo {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="empid")
	  private int empId;
	 
	  @Column(name="name")
	  private String empName;
	  
	  @Column(name="fathername")
	  private String empFatherName;
	  
	  @Column(name="email")
	  private String emailId;
	  
	  @Column(name="contactdetail")
	  private int contactNo;
	  
	  @Column(name="adress")
	  private String empAddress;
	  
	  @Column(name="dob")
	  private String DOB;
	  
	  @Column(name="adharno")
	  private int adharCard;
	  
	  @Column(name="department")
	  private String empDepartment;
	  
	  @Column(name="designation")
	  private String empDesignation;
	  
	  @Column(name="maritalstatus")
	  private String maritalStatus;
	  
	  @Column(name="bank")
	  private String bankDetail;
	  
	  @OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name="empid", referencedColumnName = "empid", nullable = true) 
	  private  AdharInfo adharinfo;
	  
	  @OneToMany(cascade = CascadeType.ALL)
		@JoinColumn(name = "id", referencedColumnName = "empid", nullable = true)
		private List<AdressBook> AdressOfEmployee;
	   
	  @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
		@JoinTable(name = "employee_bank_details", joinColumns = { 
				@JoinColumn(name = "employees_empid", nullable = false, updatable = false) }, 
				inverseJoinColumns = { @JoinColumn(name = "bank_details_id", 
						nullable = false, updatable = false) })
	  private List<BankDetailBo> bankDetails;

	
	public List<BankDetailBo> getBankDetails() {
		return bankDetails;
	}

	public void setBankDetails(List<BankDetailBo> bankDetails) {
		this.bankDetails = bankDetails;
	}

	public AdharInfo getAdharinfo() {
		return adharinfo;
	}

	public void setAdharinfo(AdharInfo adharinfo) {
		this.adharinfo = adharinfo;
	}

public List<AdressBook> getAdressOfEmployee() {
		return AdressOfEmployee;
	}

	public void setAdressOfEmployee(List<AdressBook> adressOfEmployee) {
		AdressOfEmployee = adressOfEmployee;
	}

public EmployeeBo() {
		
	}
	
//	public EmployeeBo(int empId, String empName, String empFatherName, String emailId, int contactNo,
//			String empAddress, String dOB, int adharCard, String empDepartment, String empDesignation,
//			String maritalStatus, String bankDetail, List<AdressBook> adressBook) {
//		super();
//		this.empId = empId;
//		this.empName = empName;
//		this.empFatherName = empFatherName;
//		this.emailId = emailId;
//		this.contactNo = contactNo;
//		this.empAddress = empAddress;
//		DOB = dOB;
//		this.adharCard = adharCard;
//		this.empDepartment = empDepartment;
//		this.empDesignation = empDesignation;
//		this.maritalStatus = maritalStatus;
//		this.bankDetail = bankDetail;
//		this.adressBook = adressBook;
//	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

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

	
}
