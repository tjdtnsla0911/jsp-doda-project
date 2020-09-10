package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.doda.Action;
import com.cos.doda.util.Script;

public class DodaKaishaToroku implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("style"));
		if(request.getParameter("style").equals("法人社員")) {
		RequestDispatcher dis= request.getRequestDispatcher("include/companytoroku.jsp");
		dis.forward(request, response);
		}else {
			Script.href("法人社員以外の方はこの機能が使えません","index.jsp", response);
		}
	}

}
