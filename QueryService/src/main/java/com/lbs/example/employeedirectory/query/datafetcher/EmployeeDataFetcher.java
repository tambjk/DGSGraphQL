package com.lbs.example.employeedirectory.query.datafetcher;

import com.lbs.example.employeedirectory.business.query.EmployeeQueryService;
import com.lbs.example.employeedirectory.domain.query.branchassign.BranchAssignQDto;
import com.lbs.example.employeedirectory.domain.query.employee.CustomFieldQDto;
import com.lbs.example.employeedirectory.domain.query.employee.EmployeeQDto;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Erman.Kaygusuzer on 22/06/2022
 */

@DgsComponent
public class EmployeeDataFetcher {

	@Autowired
	private EmployeeQueryService employeeQueryService;

	@DgsData(parentType = "Query", field = "employees")
	public List<EmployeeQDto> employees() {
		List<EmployeeQDto> customerList = employeeQueryService.getEmployeeList();
		return customerList;
	}

	@DgsData(parentType = "Employee", field = "branchAssign")
	public List<BranchAssignQDto> branchAssign(DgsDataFetchingEnvironment dgsDataFetchingEnvironment) {
		EmployeeQDto employee = dgsDataFetchingEnvironment.getSource();
		List<BranchAssignQDto> branchAssignList = employeeQueryService.getBranchAssignList(employee.getId());
		return branchAssignList;
	}

	@DgsData(parentType = "Employee", field = "customFields")
	public List<CustomFieldQDto> customFields(DgsDataFetchingEnvironment dgsDataFetchingEnvironment) {
		EmployeeQDto employee = dgsDataFetchingEnvironment.getSource();
		return employee.getCustomFields().entrySet().stream().flatMap(x -> Stream.of(x.getValue())).collect(Collectors.toList());
	}
}
