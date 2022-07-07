package com.lbs.example.employeedirectory.dao.repository.salaryassign;

import com.lbs.example.employeedirectory.entity.salaryassign.SalaryAssign;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Erman.Kaygusuzer on 22/06/2022
 */

public interface SalaryAssignRepository extends MongoRepository<SalaryAssign, String> {

}
