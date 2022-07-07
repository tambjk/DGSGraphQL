package com.lbs.example.employeedirectory.domain.query.codeassign;

import com.lbs.example.employeedirectory.domain.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Created by Erman.Kaygusuzer on 23/06/2022
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CodeAssignQDto extends BaseDto {

	private String employeeId;
	private String code;
	private LocalDate startDate;
	private LocalDate endDate;
}
