package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.cos.doda.Action;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaUsersusernameCheckAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String username=request.getParameter("userid");
	UsersRepository usersRepository =
			UsersRepository.getInstance();
	int result =usersRepository.findByUsername(username);
	Script.outText(result+"", response);


}
}
