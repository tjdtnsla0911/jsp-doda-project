package com.cos.doda.action.doda;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaKasha;
import com.cos.doda.repository.UsersRepository;

public class DodaRandomAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int i = (int)(Math.random()*4)+1;

		UsersRepository reqRepository = UsersRepository.getInstance();
		DodaKasha dodaKasha = reqRepository.findByKaisha(i);

		System.out.println("dodakaisha의 값 ="+dodaKasha);

			HttpSession session= request.getSession();
			request.setAttribute("dodaKaisha", dodaKasha);

			RequestDispatcher dis =
					request.getRequestDispatcher("include/randomKaisha.jsp");
			dis.forward(request, response);


	}

}
