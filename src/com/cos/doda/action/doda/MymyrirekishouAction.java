package com.cos.doda.action.doda;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaRirekishou;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class MymyrirekishouAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("받아온 id = "+id);
		UsersRepository usersRepository=UsersRepository.getInstance();
		List<DodaRirekishou> dodaRirekishou = usersRepository.seleteRirekishou(id);
		HttpSession session = request.getSession();
		System.out.println(dodaRirekishou);
		session.setAttribute("rirekishou", dodaRirekishou);
		Script.href("include/Myrirekishou.jsp", response);

	}

}
