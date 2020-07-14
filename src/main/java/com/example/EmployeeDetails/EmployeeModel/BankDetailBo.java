package com.example.EmployeeDetails.EmployeeModel;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="bankdetail")
public class BankDetailBo {
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  @Column(name="id")
	  private int Id;
	  
	  @Column(name="cstname")
	  private String CustomerName;
	  
	  @Column(name="accno")
	  private int AcctNo;
	  
	  @Column(name="bankname")
	  private String BankName;
	  
	  @Column(name="ifsc")
	  private String IFSC;
	  
	  @Column(name="branch")
	  private String Branch;
	  
//	  @ManyToMany(cascade = CascadeType.ALL)
//	  private List<EmployeeBo> employee;
//	  
//	  public List<EmployeeBo> getEmployee() {
//		return employee;
//	}
//
//	public void setEmployee(List<EmployeeBo> employee) {
//		this.employee = employee;
//	}
		@ManyToMany(fetch = FetchType.LAZY, mappedBy = "bankDetails")
		List <EmployeeBo> employees;
		
		


	public List<EmployeeBo> getEmployees() {
			return employees;
		}

		public void setEmployees(List<EmployeeBo> employees) {
			this.employees = employees;
		}

	public BankDetailBo() {
		  
	  }

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}

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
