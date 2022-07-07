package com.lbs.example.employeedirectory.query.test;

import com.lbs.example.employeedirectory.dao.repository.employee.EmployeeRepository;
import com.lbs.example.employeedirectory.entity.employee.Employee;
import com.lbs.example.employeedirectory.query.config.QueryServiceApplicationConfiguration;
import com.lbs.example.employeedirectory.query.datafetcher.EmployeeDataFetcher;
import com.netflix.graphql.dgs.DgsQueryExecutor;
import com.netflix.graphql.dgs.autoconfig.DgsAutoConfiguration;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Erman.Kaygusuzer on 24/06/2022
 */
@SpringBootTest(classes = {DgsAutoConfiguration.class, EmployeeDataFetcher.class})
@RunWith(SpringRunner.class)
@Import(QueryServiceApplicationConfiguration.class)
public class EmployeeFetcherTest {

	@Autowired
	private DgsQueryExecutor dgsQueryExecutor;

	@MockBean
	private EmployeeRepository employeeRepository;

	@Before
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
				.name("Arya")
				.surname("Kaygusuzer")
				.identityCode("2")
				.birthDate(LocalDate.now())
				.build();

		Mockito.when(employeeRepository.findAll()).thenReturn(Arrays.asList(emp1, emp2));
	}

	@Test
	public void employees() {
		List<String> employees = dgsQueryExecutor.executeAndExtractJsonPath("query Employee {\n" +
				"\temployees {\n" +
				"\t  id\n" +
				"\t  x\n" +
				"\t}\n" +
				"}", "data.employees");

		System.out.println(employees.toString());
	}
}
