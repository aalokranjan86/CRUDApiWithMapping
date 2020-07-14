package com.example.EmployeeDetails.EmployeeDao;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.EmployeeDetails.EmployeeModel.EmployeeBo;

@Repository
public class EmployeeDaoImp implements EmployeeDao {
	
	@PersistenceContext
	private EntityManager entity;
	
	@Autowired
	public EmployeeDaoImp(EntityManager en) {
		entity=en;
	}
	

	@Override
	public List<EmployeeBo> getList() {
		Query query=entity.createQuery("From EmployeeBo", EmployeeBo.class);
		 List<EmployeeBo> list=query.getResultList();
		return list;
	}

	@Override
	public EmployeeBo find(int id) {
		Session ses = entity.unwrap(Session.class);
		EmployeeBo emp = ses.get(EmployeeBo.class, id);
			return emp;
	}

	@Override
	public EmployeeBo saveDetail(EmployeeBo emp) {
		Session ses = entity.unwrap(Session.class);
//		Query query=ses.createQuery("SELECT u.empName,u.empFatherName.empName,u.emailId.empName,u.contactNo.empName,"
//				+ "u.empAddress.empName,u.DOB.empName,u.adharCard.empName,u.empDepartment.empName,u.empDesignation.empName,"
//				+ "u.maritalStatus.empName,"
//				+ "u.bankDetail.empName FROM EmployeeBo u INNER JOIN u.AdressBook a where a.empId =: adressId");
	    ses.saveOrUpdate(emp);
	    ses.persist(emp);
	    ses.flush();
	    return emp;
	}

	@Override
	public void deleteDetail(int empId) {
		Query query = entity.createQuery("delete from EmployeeBo where empId =: empId");
		query.setParameter("empId", empId);
		query.executeUpdate();
	}

}
	
	
