package com.lbs.example.employeedirectory.entity.branchassign;

import com.lbs.example.employeedirectory.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * Created by Erman.Kaygusuzer on 23/06/2022
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document("BranchAssign")
public class BranchAssign extends BaseEntity {

	private String employeeId;
	private String branchId;
	private LocalDate startDate;
	private LocalDate endDate;
}
