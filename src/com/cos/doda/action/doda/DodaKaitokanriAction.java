package com.cos.doda.action.doda;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaKaitou;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaKaitokanriAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		UsersRepository usersRepository = UsersRepository.getInstance();
		System.out.println("id값 = "+id);
		List<DodaKaitou> dodaKaitou = usersRepository.seleteDodaKaitou(id);
		System.out.println("dodaKaitou의 결과 ="+dodaKaitou);

		if(dodaKaitou!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("dodaKaitou", dodaKaitou);
			Script.href("include/myhenji.jsp", response);
		}else {
			Script.back("返信がございません", response);
		}


	}

}
