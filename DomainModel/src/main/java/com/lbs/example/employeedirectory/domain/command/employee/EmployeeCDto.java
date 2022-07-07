package com.lbs.example.employeedirectory.domain.command.employee;

import com.lbs.example.employeedirectory.domain.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Created by Erman.Kaygusuzer on 24/06/2022
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeCDto extends BaseDto {

	private String name;
	private String surname;
	private LocalDate birthDate;
	private String identityCode;
}
