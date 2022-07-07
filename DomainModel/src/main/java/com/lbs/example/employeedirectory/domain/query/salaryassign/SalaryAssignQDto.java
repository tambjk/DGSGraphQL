package com.lbs.example.employeedirectory.domain.query.salaryassign;

import com.lbs.example.employeedirectory.domain.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Erman.Kaygusuzer on 23/06/2022
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SalaryAssignQDto extends BaseDto {

	private String employeeId;
	private BigDecimal salaryAmount;
	private LocalDate startDate;
	private LocalDate endDate;
}
