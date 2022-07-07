package com.lbs.example.employeedirectory.dao.repository.codeassign;

import com.lbs.example.employeedirectory.entity.codeassign.CodeAssign;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Erman.Kaygusuzer on 22/06/2022
 */

public interface CodeAssignRepository extends MongoRepository<CodeAssign, String> {

}
