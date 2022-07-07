package com.lbs.example.employeedirectory.business.query;

import com.lbs.example.employeedirectory.dao.repository.branchassign.BranchAssignRepository;
import com.lbs.example.employeedirectory.dao.repository.codeassign.CodeAssignRepository;
import com.lbs.example.employeedirectory.dao.repository.communication.CommunicationRepository;
import com.lbs.example.employeedirectory.dao.repository.employee.EmployeeRepository;
import com.lbs.example.employeedirectory.dao.repository.salaryassign.SalaryAssignRepository;
import com.lbs.example.employeedirectory.domain.query.branchassign.BranchAssignQDto;
import com.lbs.example.employeedirectory.domain.query.employee.EmployeeQDto;
import com.lbs.example.employeedirectory.entity.branchassign.BranchAssign;
import com.lbs.example.employeedirectory.entity.employee.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Erman.Kaygusuzer on 23/06/2022
 */

@Service
public class EmployeeQueryService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private BranchAssignRepository branchAssignRepository;
	@Autowired
	private SalaryAssignRepository salaryAssignRepository;
	@Autowired
	private CodeAssignRepository codeAssignRepository;
	@Autowired
	private CommunicationRepository communicationRepository;

	private ModelMapper modelMapper = new ModelMapper();

	public List<EmployeeQDto> getEmployeeList() {
		List<Employee> employeeList = employeeRepository.findAll();
		EmployeeQDto[] employeeQDtoList = modelMapper.map(employeeList, EmployeeQDto[].class);
		return Arrays.asList(employeeQDtoList);
	}

	public List<BranchAssignQDto> getBranchAssignList(String employeeId) {
		BranchAssign tempBranchAssign = BranchAssign.builder().employeeId(employeeId).build();
		Example<BranchAssign> example = Example.of(tempBranchAssign);
		List<BranchAssign> branchAssignList = branchAssignRepository.findAll(example);
		BranchAssignQDto[] branchAssignQDtoList = modelMapper.map(branchAssignList, BranchAssignQDto[].class);
		return Arrays.asList(branchAssignQDtoList);
	}
}
