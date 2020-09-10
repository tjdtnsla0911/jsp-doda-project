package com.cos.doda.action.doda;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.Dodasukauto;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodakaishasuisenAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsersRepository usersRepository = UsersRepository.getInstance();
		List<Dodasukauto> dodasukautos = usersRepository. seleteDodasukauto();
		HttpSession session = request.getSession();
		session.setAttribute("sukauto", dodasukautos);
		Script.href("include/suisen.jsp", response);

	}

}
