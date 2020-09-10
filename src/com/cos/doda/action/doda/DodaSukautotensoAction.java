package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.doda.Action;
import com.cos.doda.model.Dodasukauto;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaSukautotensoAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		String wantpay = request.getParameter("wantpay");
		String nowjob = request.getParameter("nowjob");
		String nowpay = request.getParameter("nowpay");
		String keireki = request.getParameter("keireki");
		String area = request.getParameter("area");
		int id= Integer.parseInt(request.getParameter("id"));
		String name= request.getParameter("username");

		Dodasukauto dodasukauto = Dodasukauto.builder()
				.name(name)
				.age(age)
				.sex(sex)
				.wantpay(wantpay)
				.nowjob(nowjob)
				.nowpay(nowpay)
				.keireki(keireki)
				.area(area)
				.id(id)

				.build();

		UsersRepository usersRepository = UsersRepository.getInstance();
		int result = usersRepository.savesukauto(dodasukauto);
		if(result == 1) {
			Script.href("スカウト登録完了","index.jsp",response);
		}else {
			Script.back("スカウト登録失敗", response);
		}

	}

}
