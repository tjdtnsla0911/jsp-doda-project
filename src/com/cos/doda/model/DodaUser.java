package com.cos.doda.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class DodaUser {
private String name;
private String userid;
private String password;
private String email;
private String address;
private String tell;
private String style;

private int id;


}
