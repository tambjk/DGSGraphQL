package com.lbs.example.employeedirectory.entity.employee;

import com.lbs.example.employeedirectory.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * Created by Erman.Kaygusuzer on 23/06/2022
 */

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Document("Employee")
public class Employee extends BaseEntity {

	private String name;
	private String surname;
	private LocalDate birthDate;
	private String identityCode;
}
