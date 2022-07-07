package com.lbs.example.employeedirectory.dao.repository.branchassign;

import com.lbs.example.employeedirectory.entity.branchassign.BranchAssign;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Erman.Kaygusuzer on 22/06/2022
 */

public interface BranchAssignRepository extends MongoRepository<BranchAssign, String> {

}
