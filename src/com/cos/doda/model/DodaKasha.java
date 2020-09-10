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
public class DodaKasha {
String kaishaname;
String pay;
String peoples;
String since;
String introduction;
String img;
String job;
String area;
String people;
String school;
String time;
String day;
String company;
Timestamp createdate;
int random;
}
//	System.out.println(day);
//System.out.println(school);
//System.out.println(company);
//System.out.println(sigoto);
//System.out.println(area);
//System.out.println(money);
//System.out.println(time);
