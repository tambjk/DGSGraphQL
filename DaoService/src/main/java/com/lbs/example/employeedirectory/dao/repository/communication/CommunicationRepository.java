package com.lbs.example.employeedirectory.dao.repository.communication;

import com.lbs.example.employeedirectory.entity.communication.CommunicationAssign;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Erman.Kaygusuzer on 22/06/2022
 */

public interface CommunicationRepository extends MongoRepository<CommunicationAssign, String> {

}
