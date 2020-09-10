package com.cos.doda.action.doda;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaSaveMyKaisha;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaHozonAction implements Action{
	@Override

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("id")==null||
				request.getParameter("id").equals("")) {
			Script.href("ログインしてください", "index.jsp", response);
			return;
		}
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("받아온 id= "+id);

		UsersRepository usersRepository = UsersRepository.getInstance();
		List<DodaSaveMyKaisha> dodaSaveMyKaishas = usersRepository.seleteMyKaisha(id);
		System.out.println("dodaSaveMyKaishas = "+dodaSaveMyKaishas);

		HttpSession session =request.getSession();
		session.setAttribute("dodasavemykaishas",dodaSaveMyKaishas);
		Script.href("include/realsavemykaisha.jsp", response);

	}

}
