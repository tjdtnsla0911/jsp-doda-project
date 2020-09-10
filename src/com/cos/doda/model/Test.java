package com.cos.doda.model;

import javax.servlet.http.HttpServletRequest;

public class Test{
public void testMethod(HttpServletRequest request){
String clientIP = request.getRemoteAddr();
}
}