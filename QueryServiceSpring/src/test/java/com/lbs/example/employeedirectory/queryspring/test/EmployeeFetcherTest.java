package com.lbs.example.employeedirectory.queryspring.test;

import com.lbs.example.employeedirectory.dao.repository.employee.EmployeeRepository;
import com.lbs.example.employeedirectory.entity.employee.Employee;
import com.lbs.example.employeedirectory.queryspring.app.QueryServiceApplication;
import com.lbs.example.employeedirectory.queryspring.config.QueryServiceApplicationConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Erman.Kaygusuzer on 24/06/2022
 */
@SpringBootTest(classes = {QueryServiceApplication.class})
@Import(QueryServiceApplicationConfiguration.class)
public class EmployeeFetcherTest {

	@Autowired
	private ApplicationContext applicationContext;

	@MockBean
	private EmployeeRepository employeeRepository;

	@BeforeEach
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
				.build();

		Mockito.when(employeeRepository.findAll()).thenReturn(Arrays.asList(emp1, emp2));
	}

	@Test
	public void employees() {
		StringBuilder query = new StringBuilder();
		query.append("query Employee {");
		query.append("  employees {");
		query.append("      id");
		query.append("      name");
		//		query.append("      branchAssigns {");
		//		query.append("          branchId");
		//		query.append("          }");
		//		query.append("      customFields {");
		//		query.append("          name");
		//		query.append("          }");
		query.append("      }");
		query.append("}");

		System.out.println("done");
	}
}
