package com.cos.doda.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DodaUserHensin {
	private String title;
	private String hensin;
	private int id;
	private int kaitounumber;
	private int kanrinumber;
	private String kanrititle;

}
