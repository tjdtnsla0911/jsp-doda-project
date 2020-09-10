package com.cos.doda.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DodaUserSodan {
	private String name;
	private String userid;
	private String email;
	private String tell;
	private int id;
	private String title;
	private String content;
	private int comid;
	private Timestamp createdate;



}
