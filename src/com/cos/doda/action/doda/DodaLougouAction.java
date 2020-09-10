package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.cos.doda.Action;
import com.cos.doda.util.Script;

public class DodaLougouAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("현재 session + ="+session);
		session.invalidate();

		// session.removeAttribute("principal");
		Script.href("ログアウトを成功しました!", "index.jsp", response);
	}

}
