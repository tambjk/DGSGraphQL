package com.lbs.example.employeedirectory.domain.query.employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Erman.Kaygusuzer on 25/10/2022
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomFieldQDto {

	private String name;
	private Object value;
}
