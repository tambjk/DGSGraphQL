package com.lbs.example.employeedirectory.queryspring.controller;

import com.lbs.example.employeedirectory.business.query.EmployeeQueryService;
import com.lbs.example.employeedirectory.domain.query.employee.EmployeeQDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by Erman.Kaygusuzer on 26/10/2022
 */

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeQueryService employeeQueryService;

	@QueryMapping(value = "employees")
	public List<EmployeeQDto> employees() {
		List<EmployeeQDto> customerList = employeeQueryService.getEmployeeList();
		return customerList;
	}
}
