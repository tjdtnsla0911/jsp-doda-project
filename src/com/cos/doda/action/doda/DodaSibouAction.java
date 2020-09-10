package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaKasha;
import com.cos.doda.model.DodaUser;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaSibouAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id= Integer.parseInt(request.getParameter("dodauserid"));
		int random = Integer.parseInt(request.getParameter("saveKaishas"));
		String kaishaname = request.getParameter("kaishaname");
		System.out.println("받아온 아이디 ="+id);
		System.out.println("랜덤번호 ="+random);
		System.out.println("받아온 회사이름 ="+kaishaname);
		UsersRepository usersRepository = UsersRepository.getInstance();
		DodaUser dodaUser = usersRepository.findByUsernameAndPassword(id);

		DodaKasha dodaKasha= usersRepository.findByKaisha(random);
		HttpSession session = request.getSession();
		session.setAttribute("prinsipal", dodaUser);
		HttpSession session2 = request.getSession();
		session2.setAttribute("kaisha", dodaKasha);

		System.out.println("유저정보 출력된거 "+dodaUser);
		System.out.println("회사정보 출려된거 "+dodaKasha);
		Script.href("include/sibou.jsp", response);


	}

}
