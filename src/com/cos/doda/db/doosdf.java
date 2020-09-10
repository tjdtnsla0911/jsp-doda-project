package com.cos.doda.db;

public class doosdf {
	public static void main(String[] args) {
	int a,b,c,sum;
	a = b = 1;
	sum = a+b;
	for(int i =3; i<=5;i++) {
		c = a+b;
		sum +=c;
		a =b;
		b=c;
		System.out.println("포문안의 섬 ="+sum);
	}
	System.out.println(sum);
	}
}
