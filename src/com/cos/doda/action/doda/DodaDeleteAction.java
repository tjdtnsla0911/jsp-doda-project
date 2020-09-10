package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.doda.Action;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaDeleteAction implements Action{@Override
public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int comid=Integer.parseInt(request.getParameter("comid"));
	System.out.println("현재 id값은 ? ="+comid);
	UsersRepository usersRepository = UsersRepository.getInstance();
	int result = usersRepository.deleteById(comid);
	System.out.println("리절트 값 "+result);
	Script.outText(result, response);

}


}
