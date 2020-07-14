package com.example.EmployeeDetails.EmployeeService;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeDetails.EmployeeDao.EmployeeDaoImp;
import com.example.EmployeeDetails.EmployeeDetailsDto.EmployeeDto;
import com.example.EmployeeDetails.EmployeeModel.EmployeeBo;

@Service
@Transactional
public class EmployeeServiceImp implements  EmployeeService{
	
	@Autowired
    private ModelMapper modelMapper;
	
   EmployeeDaoImp employee;
	
	@Autowired
	public EmployeeServiceImp(EmployeeDaoImp dao) {
		employee=dao;
	}

	@Override
	public List<EmployeeDto> getList() {
		List<EmployeeDto> abc = new ArrayList();
		  List<EmployeeBo> a = employee.getList();
		 for(EmployeeBo eb:a) {
			 EmployeeDto emp = convertToEmployeeDto(eb);
			 abc.add(emp);
		 }

		  return abc;	
	}

	@Override
	public EmployeeBo find(int id) {
		return employee.find(id);
	}

	@Override
	public EmployeeDto saveDetail(EmployeeDto emp) {
		EmployeeBo ab=convertToEmployeeBo(emp);
		EmployeeBo abc=employee.saveDetail(ab);
		return convertToEmployeeDto(abc);
	}

	@Override
	public void deleteDetail(int empId) {
		EmployeeBo ab=employee.find(empId);
		modelMapper.map(ab,EmployeeDto.class);
		employee.deleteDetail(empId);
	}
	
	
			public EmployeeDto convertToEmployeeDto(EmployeeBo model) {
				EmployeeDto data= modelMapper.map(model, EmployeeDto.class);
				 return data;
			  	}
			 
			 public EmployeeBo convertToEmployeeBo(EmployeeDto postDto) {
				 EmployeeBo post = modelMapper.map(postDto, EmployeeBo.class);
			     return post;
			 }
			 
			
//			  AdressBookDto qwe = new AdressBookDto();
//			  for(EmployeeBo eb:a ) {
//		  EmployeeDto efdi = new EmployeeDto();
//		  efdi.setEmpId(eb.getEmpId());
//		  efdi.setEmpName(eb.getEmpName());
//		  efdi.setEmpFatherName(eb.getEmpFatherName());
//		  efdi.setEmailId(eb.getEmailId());
//		  efdi.setContactNo(eb.getContactNo());
//		  efdi.setEmpAddress(eb.getEmpAddress());
//		  efdi.setDOB(eb.getDOB());
//		  efdi.setAdharCard(eb.getAdharCard());
//		  efdi.setEmpDepartment(eb.getEmpDepartment());
//		  efdi.setEmpDesignation(eb.getEmpDesignation());
//		  efdi.setMaritalStatus(eb.getMaritalStatus());
//		  efdi.setBankDetail(eb.getBankDetail());
//		  abc.add(efdi);
//		  }
					
}
