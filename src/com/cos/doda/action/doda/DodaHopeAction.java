package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.cos.doda.Action;
import com.cos.doda.util.Script;

public class DodaHopeAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("session은 ? ="+session);
		if(session.getAttribute("principal") == null) {
			Script.getMessage("로그인을 해주세요!.", response);
			return;
		}

	}

}
