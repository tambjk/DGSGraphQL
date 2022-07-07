package com.lbs.example.employeedirectory.dao.repository.employee;

import com.lbs.example.employeedirectory.entity.employee.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Erman.Kaygusuzer on 22/06/2022
 */

public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
