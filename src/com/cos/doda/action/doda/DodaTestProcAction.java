package com.cos.doda.action.doda;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.cos.doda.Action;
import com.cos.doda.model.DodaTensu;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;



public class DodaTestProcAction implements Action{
	static int ok=0;
	static int sum=0;
	static int page=0;
	static int prs=0;
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		 ok = Integer.parseInt(request.getParameter("ok"));
		 sum = Integer.parseInt(request.getParameter("sum"));
		page = Integer.parseInt(request.getParameter("page"));
		prs=Integer.parseInt(request.getParameter("prs"));
		if(prs==1) {

			page+=1;
			UsersRepository usersRepository = UsersRepository.getInstance();
			DodaTensu tensu = usersRepository.tensu(sum,page);
			HttpSession session = request.getSession();
			session.setAttribute("tensu", tensu);
			System.out.println(tensu);

			Script.href("/test/test1.jsp", response);

			System.out.println(ok);



		}else {
		UsersRepository usersRepository = UsersRepository.getInstance();
		ok+=10;
		sum+=10;
		page+=1;




		DodaTensu tensu = usersRepository.tensu(ok,sum,page);
		HttpSession session = request.getSession();
		session.setAttribute("tensu", tensu);
		System.out.println(tensu);

		Script.href("/test/test1.jsp", response);

		System.out.println(ok);



		}
	}

}
