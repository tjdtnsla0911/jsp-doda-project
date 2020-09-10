package com.cos.doda.action.doda;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaUser;
import com.cos.doda.model.DodaUserSodan;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaSodanAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id= Integer.parseInt(request.getParameter("id"));
		UsersRepository usersRepository = UsersRepository.getInstance();
		List<DodaUserSodan> dodaUserSodans = usersRepository.findAll();
		DodaUser dodaUser =usersRepository.findByUsernameAndPassword(id);
		System.out.println("상담내역 다뽑기 ="+dodaUserSodans);
		System.out.println("상담내역 하러오기전 dodaUser" + dodaUser);
		HttpSession session= request.getSession();
		session.setAttribute("dodaUserSodans", dodaUserSodans);
		HttpSession session2= request.getSession();
		session.setAttribute("dodausersonasnumber", dodaUser);
		Script.href("kanrisha/dodasodan.jsp", response);

	}

}
