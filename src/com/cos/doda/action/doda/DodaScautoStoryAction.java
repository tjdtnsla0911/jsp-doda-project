package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaUser;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaScautoStoryAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("style"));
		if(request.getParameter("style").equals("個人会員")){
			System.out.println(request.getParameter("style"));
			int id= Integer.parseInt(request.getParameter("id"));


			UsersRepository usersRepository = UsersRepository.getInstance();
			DodaUser dodaUser = usersRepository.findByUsernameAndPassword(id);


			HttpSession session = request.getSession();
			session.setAttribute("prinsipal", dodaUser);
			Script.href("include/sukauotostart.jsp", response);

		}else {

			Script.back("恐れ入りますが、このシステムは個人だけ使えます。", response);
		}



	}

}
