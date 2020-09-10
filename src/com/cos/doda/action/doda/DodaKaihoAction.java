package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.doda.Action;
import com.cos.doda.model.ipip;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class DodaKaihoAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ip = request.getParameter("ip");
		System.out.println("ip는 > ="+ip);
		UsersRepository usersRepository = UsersRepository.getInstance();
		int result = usersRepository.deleteByIp(ip);
		System.out.println("result는 ? "+result);
		if(result==1) {
		Script.href("영구정지 해제에 성공하였습니다.","index.jsp", response);
		}

	}

}
