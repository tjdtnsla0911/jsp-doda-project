package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaTensu;
import com.cos.doda.model.DodaUser;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;


public class DodaHensinByidAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int kanriid=Integer.parseInt(request.getParameter("kanriid"));
System.out.println("고객 아이디 = "+id);
System.out.println("관리자 아이디 = "+kanriid);

		UsersRepository usersRepository = UsersRepository.getInstance();
		DodaUser dodaUser = usersRepository.findByUsernameAndPassword(id);
		DodaUser dodaUser2 = usersRepository.findByUsernameAndPassword(kanriid);

		System.out.println("dodaUser의 값 = "+dodaUser);

		if(dodaUser!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("hensin", dodaUser);
			HttpSession session2 = request.getSession();
			session.setAttribute("hensin2", dodaUser2);
			Script.href("kanrisha/hensin.jsp", response);
		}
		else {
			Script.back("クソ", response);
		}


	}
}

