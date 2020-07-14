package com.example.EmployeeDetails.EmployeeModel;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="adharinfo")
public class AdharInfo {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	   @Column(name="empid")
	   private int empId;
	   
//	   @Column(name="empid")
//	   private int empId;
	   
	   @Column(name="name_on_adhar")
	   private String NameOnAdhar;
	   
	   @Column(name="contact")
	   private int Mobile;
	   
  @OneToOne(cascade = CascadeType.ALL)
//	  
//	  @JoinColumn(name="empid") 
  private EmployeeBo employee;

  
  
//	public AdharInfo(int adharId, String nameOnAdhar, int mobile) {
//		super();
//		this.adharId = adharId;
//		NameOnAdhar = nameOnAdhar;
//		Mobile = mobile;
//	}
	   
	   public EmployeeBo getEmployee() {
	return employee;
}

public void setEmployee(EmployeeBo employee) {
	this.employee = employee;
}

	public AdharInfo() {
		   
	   }

//	public int getAdharId() {
//		return adharId;
//	}
//
//	public void setAdharId(int adharId) {
//		this.adharId = adharId;
//	}

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

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	   
	   

}
