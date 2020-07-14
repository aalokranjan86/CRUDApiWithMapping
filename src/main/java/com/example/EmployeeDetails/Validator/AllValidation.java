package com.example.EmployeeDetails.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.example.EmployeeDetails.EmployeeController.EmployeeControllerImp;
import com.example.EmployeeDetails.EmployeeDetailsDto.EmployeeDto;
import com.example.EmployeeDetails.EmployeeService.EmployeeServiceImp;


@Component
@ControllerAdvice(assignableTypes = EmployeeControllerImp.class)
public class AllValidation implements Validator{

	@Autowired
	private EmployeeServiceImp esi;
	private int ClassValidateCheck=0;
	@Override
	public boolean supports(Class<?> clazz) {
		ClassValidateCheck =0;
		return EmployeeDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if(ClassValidateCheck == 0) {
			EmployeeDto user = (EmployeeDto) target;
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empName", "correct");
			if(user.getEmpName() == null) {
				errors.rejectValue("empName", "Required");
			}
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empFatherName", "correct");
			if(user.getEmpFatherName() == null) {
				errors.rejectValue("empFatherName", "Required");
			}
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId", "correct");
			if(user.getEmailId() == null) {
				errors.rejectValue("emailId", "Required");
			}
	
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "empAddress", "correct");
			if(user.getEmpAddress() == null) {
				errors.rejectValue("empAddress", "Required");
			}
		}
	}
}
