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
public class DodaSaveMyKaisha {
int random;
int userid;
String pay;
String area;
String time;
Timestamp createdate;
String img;
int kaitonumber;
String kaishaname;
String job;

}
