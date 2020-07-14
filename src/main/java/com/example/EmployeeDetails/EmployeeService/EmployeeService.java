package com.example.EmployeeDetails.EmployeeService;

import java.util.List;

import com.example.EmployeeDetails.EmployeeDetailsDto.EmployeeDto;
import com.example.EmployeeDetails.EmployeeModel.EmployeeBo;

public interface EmployeeService {

	public List<EmployeeDto> getList();

	public EmployeeBo find(int id);

	public EmployeeDto saveDetail(EmployeeDto emp);

	public void deleteDetail(int empId);

}
