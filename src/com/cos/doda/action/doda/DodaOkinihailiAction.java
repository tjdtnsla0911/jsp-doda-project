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

public class DodaOkinihailiAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("아이디 = "+id);
		UsersRepository usersRepository = UsersRepository.getInstance();
		List<DodaSaveMyKaisha> dodaSaveMyKaisha = usersRepository.seleteMyKaisha(id);
		System.out.println("찜목록 뽑으러온 dodaSaveMyKaisha의 값 = "+dodaSaveMyKaisha);

		HttpSession session = request.getSession();
		session.setAttribute("DodaSaveMyKaisha", dodaSaveMyKaisha);
		Script.href("include/saveMyKaisha.jsp", response);


	}

}
