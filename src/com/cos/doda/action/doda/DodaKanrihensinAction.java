package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.doda.Action;
import com.cos.doda.model.DodaUserHensin;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaKanrihensinAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String hensin = request.getParameter("hensin");
		int id = Integer.parseInt(request.getParameter("id"));
		int kaitounumber = Integer.parseInt(request.getParameter("kaitounumber"));
		int kanrinumber = Integer.parseInt(request.getParameter("kanrinumber"));
		String kanrititle = request.getParameter("kanrititle");

		DodaUserHensin dodaUserHensin = DodaUserHensin.builder()
				.title(title)
				.hensin(hensin)
				.id(id)
				.kaitounumber(kaitounumber)
				.kanrinumber(kanrinumber)
				.kanrititle(kanrititle)
				.build();
		UsersRepository usersRepository = UsersRepository.getInstance();
		int result = usersRepository.save(dodaUserHensin);
		if(result==1) {
			Script.href("close.jsp", response);
		}else {
			Script.back("실패", response);
		}


	}

}
