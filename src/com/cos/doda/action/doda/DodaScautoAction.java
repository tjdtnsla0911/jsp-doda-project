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

public class DodaScautoAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("id")==null||
			request.getParameter("id").equals("")) {
			Script.href("ログインしてください","index.jsp", response);
		}else {
		int id=Integer.parseInt(request.getParameter("id"));

		UsersRepository usersRepository =UsersRepository.getInstance();
		DodaUser dodaUser = usersRepository.findByUsernameAndPassword(id);
		HttpSession session = request.getSession();
		session.setAttribute("prinsipal", dodaUser);
		System.out.println("도다유저의 값 ="+dodaUser);
		Script.href("include/sukasuto.jsp", response);
		}

	}

}
