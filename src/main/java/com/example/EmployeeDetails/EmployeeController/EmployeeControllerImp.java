package com.example.EmployeeDetails.EmployeeController;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeDetails.EmployeeDetailsDto.AdressBookDto;
import com.example.EmployeeDetails.EmployeeDetailsDto.EmployeeDto;
import com.example.EmployeeDetails.EmployeeModel.EmployeeBo;
import com.example.EmployeeDetails.EmployeeService.EmployeeServiceImp;
import com.example.EmployeeDetails.Validator.AllValidation;


@RestController
@RequestMapping(value = "/Employee")
@CrossOrigin(origins = "*")
public class EmployeeControllerImp {
	
	private EmployeeServiceImp EmpService;
	
	@Autowired
	public EmployeeControllerImp(EmployeeServiceImp ab) {
		EmpService=ab;
	}
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private AllValidation valid;
	
	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(valid);
	}
	
	
	 @GetMapping("/getlist")
	  public List<EmployeeDto> getlist(){
		  List<EmployeeDto> a =EmpService.getList();
		  return a;
	  }
	 @GetMapping("/find/{id}")
	 public EmployeeBo find(@PathVariable int id) {
		 return EmpService.find(id);
	 }
	 @PostMapping("/save")
	 public String save(@Valid @RequestBody EmployeeDto emp, Errors value) {
		 if(value.hasErrors()) {
			 return "Fill The Details";
		 }
		 EmployeeDto ed= EmpService.saveDetail(emp);
		 return  "Registered Sucessfully";
	 }
	 
	  @DeleteMapping("/deletelist/{empId}") 
	  public String deleteDetail(@PathVariable int empId) {
		  EmpService.deleteDetail(empId);
		  return "Deleted Sucessfull" +empId;
	  }

}
