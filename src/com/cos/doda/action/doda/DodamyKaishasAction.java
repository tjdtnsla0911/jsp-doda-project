package com.cos.doda.action.doda;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaKasha;
import com.cos.doda.model.DodaSaveMyKaisha;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodamyKaishasAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int saveKaishas = Integer.parseInt(request.getParameter("saveKaishas"));
		int dodauserid = Integer.parseInt(request.getParameter("dodauserid"));

		System.out.println("saveKaishas = "+saveKaishas);
		System.out.println("dodauserid = "+dodauserid);

		UsersRepository usersRepository = UsersRepository.getInstance();

		DodaKasha dodaKasha= usersRepository.seleteKaisha(saveKaishas);
		int random = dodaKasha.getRandom();
		System.out.println("random 값 = "+random);

		DodaSaveMyKaisha dodaSaveMyKaisha = DodaSaveMyKaisha.builder()
				.random(random)
				.userid(dodauserid)
				.pay(dodaKasha.getPay())
				.area(dodaKasha.getArea())
				.time(dodaKasha.getTime())
				.img(dodaKasha.getImg())
				.kaishaname(dodaKasha.getKaishaname())
				.job(dodaKasha.getJob())
				.build();

		System.out.println("dodaSavemyKaisha의 값" +dodaSaveMyKaisha);

		int result = usersRepository.saveMyKaisha(dodaSaveMyKaisha);
		System.out.println("result  = "+result);



		System.out.println("dodakaisha의 값(저장용) = "+dodaKasha);
		if(dodaKasha != null) {
			HttpSession session = request.getSession();
			request.setAttribute("dodaKaisha", dodaKasha);


		      Script.outText(dodaKasha+"", response);

		}



	}

}
