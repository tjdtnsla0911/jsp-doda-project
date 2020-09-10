package com.cos.doda.action.doda;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.cos.doda.Action;
import com.cos.doda.model.Test;
import com.cos.doda.model.ipip;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

import oracle.net.aso.i;

public class DadoHomeAction implements Action{
	private HttpServletRequest req;

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String ip = request.getHeader("X-Forwarded-For");
		 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		     ip = request.getHeader("Proxy-Client-IP");
		     System.out.println(ip);
		 }
		 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		     ip = request.getHeader("WL-Proxy-Client-IP");
		     System.out.println(ip);
		 }
		 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		     ip = request.getHeader("HTTP_CLIENT_IP");
		     System.out.println(ip);
		 }
		 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		     ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		     System.out.println(ip);
		 }
		 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		     ip = request.getHeader("X-Real-IP");
		     System.out.println(ip);
		 }
		 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		     ip = request.getHeader("X-RealIP");
		     System.out.println(ip);
		 }
		 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
		     ip = request.getRemoteAddr();
		     System.out.println(ip);
		 }

		UsersRepository usersRepository = UsersRepository.getInstance();
		int id2= usersRepository.myupup(ip);
		System.out.println("현재 아이디2값 ="+id2);
		if(id2>=1) {
			Script.href("당신은 영구정지중입니다 들어오고싶으면 반성문을 제출하세요","https://search.naver.com/search.naver?where=image&sm=tab_jum&query=%EA%B0%90%EC%98%A5", response);
		}else {








		RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
		dis.forward(request, response);
	}
	}
}
