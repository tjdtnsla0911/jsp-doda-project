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
public class DodaKaitou {
private String name;
private String title;
private String hensin;
private int id;
private Timestamp createdate;
private int kaitounumber;
private int kanrinumber;
}
