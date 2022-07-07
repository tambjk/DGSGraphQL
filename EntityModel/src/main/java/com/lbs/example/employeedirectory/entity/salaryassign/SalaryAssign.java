package com.lbs.example.employeedirectory.entity.salaryassign;

import com.lbs.example.employeedirectory.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by Erman.Kaygusuzer on 23/06/2022
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("SalaryAssign")
public class SalaryAssign extends BaseEntity {

	private String employeeId;
	private BigDecimal salaryAmount;
	private LocalDate startDate;
	private LocalDate endDate;
}
