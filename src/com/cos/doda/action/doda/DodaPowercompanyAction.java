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

public class DodaPowercompanyAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String job = request.getParameter("job");
		String pay = request.getParameter("pay");
		String area = request.getParameter("area");
		int id = Integer.parseInt(request.getParameter("id"));

		System.out.println(pay);
		System.out.println(area);
		System.out.println(job);
		//sessionScope.prinsipal.style

		UsersRepository repository = UsersRepository.getInstance();
		List<DodaKasha> dodaKaisha = repository.findByKaisha(job, area, pay);
		DodaUser dodaUser =repository.findByUsernameAndPasswordid(id);

		System.out.println("dodakasha의 값 =" + dodaKaisha);
		if (dodaKaisha != null) {
			HttpSession session = request.getSession();
			request.setAttribute("dodaKaisha", dodaKaisha);
			HttpSession session2 = request.getSession();
			request.setAttribute("prinsipal", dodaUser);

			RequestDispatcher dis =
					request.getRequestDispatcher("include/company.jsp");
			dis.forward(request, response);
		}

	}

}
