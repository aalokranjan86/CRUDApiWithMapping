package com.example.EmployeeDetails.EmployeeDao;

import java.util.List;

import com.example.EmployeeDetails.EmployeeModel.EmployeeBo;

public interface EmployeeDao {
	
	public List<EmployeeBo> getList();
	public EmployeeBo find(int id);
	public EmployeeBo saveDetail(EmployeeBo emp);
	public void deleteDetail(int empId);
	 
}
