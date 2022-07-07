package com.lbs.example.employeedirectory.domain.query.communication;

import com.lbs.example.employeedirectory.domain.base.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by Erman.Kaygusuzer on 23/06/2022
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommunicationAssignQDto extends BaseDto {

	private String employeeId;
	private List<PhoneInfoQDto> phones;
}
