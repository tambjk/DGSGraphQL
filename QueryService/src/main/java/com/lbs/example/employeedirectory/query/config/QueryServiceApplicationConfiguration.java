package com.lbs.example.employeedirectory.query.config;

import com.lbs.example.employeedirectory.business.EnableBusinessService;
import com.lbs.example.employeedirectory.dao.repository.employee.EmployeeRepository;
import com.lbs.example.employeedirectory.entity.employee.Employee;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

/**
 * Created by Erman.Kaygusuzer on 22/06/2022
 */
@Configuration
@EnableBusinessService
@ComponentScan(basePackages = "com.lbs.example.employeedirectory.query")
public class QueryServiceApplicationConfiguration {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void mocking() {
		Employee emp1 = Employee.builder()
				.id("emp1")
				.name("Erman")
				.surname("Kaygusuzer")
				.identityCode("1")
				.birthDate(LocalDate.now())
				.build();

		Employee emp2 = Employee.builder()
				.id("emp2")
				.name("Gamze")
				.surname("Özçelik")
				.identityCode("2")
				.birthDate(LocalDate.now())
				.parentId("emp1")
				.build();

		Mockito.when(employeeRepository.findAll()).thenReturn(Arrays.asList(emp1, emp2));

		Mockito.when(employeeRepository.findById("emp1")).thenReturn(Optional.of(emp1));
		Mockito.when(employeeRepository.findById("emp2")).thenReturn(Optional.of(emp2));
	}
}
