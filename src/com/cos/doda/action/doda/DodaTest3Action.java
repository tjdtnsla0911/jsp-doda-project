package com.cos.doda.action.doda;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaTensu;
import com.cos.doda.model.DodaUserSodan;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaTest3Action implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsersRepository usersRepository = UsersRepository.getInstance();
		List<DodaUserSodan> dodaUserSodans = usersRepository.findAll();
		HttpSession session= request.getSession();
		session.setAttribute("dodaUserSodans", dodaUserSodans);
		Script.href("kanrisha/dodasodan.jsp", response);


	}

}
