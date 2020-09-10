package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaKaitou;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaTegamiAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number = Integer.parseInt(request.getParameter("number"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		System.out.println("넘버 ="+number);
		System.out.println("넘버2 ="+number2);

		UsersRepository usersRepository = UsersRepository.getInstance();
		DodaKaitou dodaKaitou = usersRepository.seleteDodaKaitou2(number);
		HttpSession session = request.getSession();
		session.setAttribute("kaitou", dodaKaitou);

		Script.href("include/saveMyKaisha.jsp", response);





	}

}
