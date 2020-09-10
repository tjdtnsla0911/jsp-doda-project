package com.cos.doda.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import sun.management.resources.agent;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dodasukauto {
	private String name;
	private String age;
	private String sex;
	private String wantpay;
	private String nowjob;
	private String keireki;
	private String nowpay;
	private String area;
	private Timestamp createdate;
	private int id;


}
