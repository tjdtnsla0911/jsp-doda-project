package com.cos.doda.action.doda;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaKasha;
import com.cos.doda.model.DodaUser;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaCompanyAction2 implements Action {
	@Override

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String ok1 = request.getParameter("se1");
		String ok2 = request.getParameter("se2");
		String ok3 = request.getParameter("se3");

		System.out.println("1의 값 =" + ok1);
		System.out.println("1의 값 =" + ok2);
		System.out.println("1의 값 =" + ok3);


		//sessionScope.prinsipal.style

		UsersRepository repository = UsersRepository.getInstance();
		List<DodaKasha> dodaKaisha = repository.findByKaisha(ok1, ok2, ok3);


		System.out.println("dodakasha의 값 =" + dodaKaisha);
		if (dodaKaisha != null) {
			HttpSession session = request.getSession();
			request.setAttribute("dodaKaisha", dodaKaisha);


			RequestDispatcher dis =
					request.getRequestDispatcher("include/company2.jsp");
			dis.forward(request, response);
		}
	}

}