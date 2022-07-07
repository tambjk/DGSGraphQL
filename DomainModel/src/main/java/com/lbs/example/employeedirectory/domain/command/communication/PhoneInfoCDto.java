package com.lbs.example.employeedirectory.domain.command.communication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Erman.Kaygusuzer on 23/06/2022
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhoneInfoCDto implements Serializable {

	private String phoneNumber;
	private Boolean active;
}
