package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.doda.Action;
import com.cos.doda.model.DodaKaitou;
import com.cos.doda.model.DodaKasha;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaKaitouAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String title = request.getParameter("email");
		String hensin = request.getParameter("message");
		int kanriid=Integer.parseInt(request.getParameter("kanriid"));

		System.out.println("name =" + name);
		System.out.println("id= " + id);
		System.out.println("title " + title);
		System.out.println("hensin= " + hensin);

		DodaKaitou dodaKaitou = DodaKaitou.builder()
				.name(name)
				.title(title)
				.hensin(hensin)
				.id(id)
				.kanrinumber(kanriid)
				.build();
		UsersRepository usersRepository = UsersRepository.getInstance();
		int result= usersRepository.saveDodaKaitou(dodaKaitou);

		if(result==1) {
			Script.href("返信登録に成功しました","home.jsp", response);
		}else {
			Script.href("返信登録に失敗しました","home.jsp", response);
		}





	}

}
