package com.lbs.example.employeedirectory.query.test;

import com.lbs.example.employeedirectory.dao.repository.employee.EmployeeRepository;
import com.lbs.example.employeedirectory.entity.employee.Employee;
import com.lbs.example.employeedirectory.query.config.QueryServiceApplicationConfiguration;
import com.lbs.example.employeedirectory.query.datafetcher.EmployeeDataFetcher;
import com.netflix.graphql.dgs.DgsQueryExecutor;
import com.netflix.graphql.dgs.autoconfig.DgsAutoConfiguration;
import graphql.ExecutionResult;
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
import java.util.Optional;

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

	@Test
	public void employees() {
		StringBuilder query = new StringBuilder();
		query.append("query Employee {");
		query.append("  employees {");
		query.append("      id");
		query.append("      name");
		//		query.append("      parent {");
		//		query.append("          id");
		//		query.append("          name");
		//		query.append("          surname");
		//		query.append("          }");
		//		query.append("      branchAssigns {");
		//		query.append("          branchId");
		//		query.append("          }");
		//		query.append("      customFields {");
		//		query.append("          name");
		//		query.append("          }");
		query.append("      }");
		query.append("}");
		ExecutionResult execute = dgsQueryExecutor.execute(query.toString());
		//		EmployeeQDto[] employees = dgsQueryExecutor.executeAndExtractJsonPathAsObject(query.toString(), "data.employees", EmployeeQDto[].class);

		System.out.println(execute.toString());
	}
}
