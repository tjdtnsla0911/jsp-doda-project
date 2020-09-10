package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.doda.Action;
import com.cos.doda.model.DodaKaitou;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodadeletetegamiAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int number = Integer.parseInt(request.getParameter("number"));
		System.out.println("넘버 = "+number);
		UsersRepository usersRepository = UsersRepository.getInstance();
		int result = usersRepository.deletekaitou(number);

		System.out.println("리절트값 = "+result);

		Script.outText(result, response);

	}

}
