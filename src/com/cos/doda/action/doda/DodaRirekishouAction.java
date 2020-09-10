package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaUser;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaRirekishouAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		UsersRepository usersRepository = UsersRepository.getInstance();
		DodaUser dodaUser = usersRepository.findByUsernameAndPassword(id);
		HttpSession session = request.getSession();
		session.setAttribute("prinsipal", dodaUser);
		Script.href("include/rirekishou.jsp", response);

	}

}
