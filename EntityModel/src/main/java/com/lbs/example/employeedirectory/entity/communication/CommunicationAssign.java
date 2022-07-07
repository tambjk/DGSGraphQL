package com.lbs.example.employeedirectory.entity.communication;

import com.lbs.example.employeedirectory.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Erman.Kaygusuzer on 23/06/2022
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("CommunicationAssign")
public class CommunicationAssign extends BaseEntity {

	private String employeeId;
	private List<PhoneInfo> phones;
}
