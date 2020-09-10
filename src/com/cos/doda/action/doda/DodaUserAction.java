package com.cos.doda.action.doda;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaUserHensin;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaUserAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("id는 = "+id);
		UsersRepository usersRepository = UsersRepository.getInstance();
		List<DodaUserHensin> dodaUserHensins = usersRepository.findDodaUserHensin(id);
		HttpSession session = request.getSession();
		System.out.println("리스트뽑은값 =" + dodaUserHensins);
		session.setAttribute("henji", dodaUserHensins);
		Script.href("kanrisha/henji.jsp", response);

	}

}
