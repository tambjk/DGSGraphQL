package com.lbs.example.employeedirectory.entity.employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Created by Erman.Kaygusuzer on 25/10/2022
 */
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CustomField {

	private String name;
	private Object value;
}
