package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaTensu;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

import sun.security.util.DisabledAlgorithmConstraints;

public class DodaSen1Action implements Action{
	static int ok=5;
	static int sum=5;
	static int page=1;
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsersRepository usersRepository = UsersRepository.getInstance();
		int ok=0;

		DodaTensu tensu = usersRepository.tensu(ok);
		System.out.println("현재 텐수값 = "+tensu);
		if(tensu !=null) {
			HttpSession session = request.getSession();
			session.setAttribute("tensu", tensu);
			Script.href("test/test1.jsp", response);
		}else {
			Script.back("クソ", response);
		}
	}

}
