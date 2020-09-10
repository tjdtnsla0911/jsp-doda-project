package com.cos.doda.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DodaTensu {
private int ok;
private int no;
private int sum;
private int page;
private int prs;
}
