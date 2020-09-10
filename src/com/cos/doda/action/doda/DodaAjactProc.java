package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaUser;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaAjactProc implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(
				request.getParameter("userid")==null||
				request.getParameter("userid").equals("")

				) {
			Script.href("ログインしなくてはこのページを使えません","index.jsp", response);
			return;

		}
		System.out.println("리턴당햇으면 이거안나옴");
		String userid =request.getParameter("userid");


		UsersRepository usersRepository = UsersRepository.getInstance();
		System.out.println("userid = "+userid);

		DodaUser dodaUser = usersRepository.findByUsernameAndPassword(userid);
		System.out.println("이것이 dodaUser의 값입니다 ="+dodaUser);
		if(dodaUser!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("prinsipal", dodaUser);
			System.out.println("이것이 세션의 값입니다 ="+session);


		}
		Script.href("/doda/include/ajact2.jsp", response);

	}

}
