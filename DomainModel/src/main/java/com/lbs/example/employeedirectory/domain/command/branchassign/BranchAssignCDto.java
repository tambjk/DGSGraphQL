package com.lbs.example.employeedirectory.domain.command.branchassign;

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
public class BranchAssignCDto extends BaseDto {

	private String employeeId;
	private String branchId;
	private LocalDate startDate;
	private LocalDate endDate;
}
