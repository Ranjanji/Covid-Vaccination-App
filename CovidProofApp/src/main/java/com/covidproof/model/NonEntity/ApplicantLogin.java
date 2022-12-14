package com.covidproof.model.NonEntity;



import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class ApplicantLogin {
	private String mobile;
	private LocalDate dob;
}
