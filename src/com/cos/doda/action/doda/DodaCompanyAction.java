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

public class DodaCompanyAction implements Action {
	@Override

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ok1 = request.getParameter("se1");
		String ok2 = request.getParameter("se2");
		String ok3 = request.getParameter("se3");
		int userid =Integer.parseInt(request.getParameter("useridss"));

		System.out.println("1의 값 =" + ok1);
		System.out.println("1의 값 =" + ok2);
		System.out.println("1의 값 =" + ok3);
		System.out.println("userid의 값 ="+userid);
		String pay = null;
		String area = null;
		String job = null;

		if (ok1.equals("1")) {
			job = "職業";
		} else if (ok1.equals("2")) {
			job = "営業職";
		} else if (ok1.equals("3")) {
			job = "企画、管理";
		} else if (ok1.equals("4")) {
			job = "事務";
		} else if (ok1.equals("5")) {
			job = "販売、サービス";
		} else if (ok1.equals("6")) {
			job = "専門職";
		} else if (ok1.equals("7")) {
			job = "技術(IT,Web)";
		}else if (ok1.equals("28")) {
			job = "奴隷";
		}
		else {
			return;
		}
		// --------------------------------------------------여기서부턴 area
		if (ok2.equals("8")) {
			area = "勤務地";
		} else if (ok2.equals("9")) {
			area = "北海道";
		} else if (ok2.equals("10")) {
			area = "大阪府";
		} else if (ok2.equals("11")) {
			area = "東京都";
		} else if (ok2.equals("12")) {
			area = "九州";
		} else if (ok2.equals("13")) {
			area= "岩手県";
		} else if (ok2.equals("14")) {
			area = "新潟県)";
		} else if (ok2.equals("15")) {
			area = "群馬県";
		} else if (ok2.equals("16")) {
			area = "三重県";
		} else if (ok2.equals("17")) {
			area = "沖縄県";
		} else if (ok2.equals("29")) {
			area = "北朝鮮";
		}else {
			return;
		}

		//-------------------------------여기서부턴 pay
		if (ok3.equals("18")) {
			pay = "年給";
		} else if (ok3.equals("19")) {
			pay = "200万円から~";
		} else if (ok3.equals("20")) {
			pay = "250万円から~";
		} else if (ok3.equals("21")) {
			pay = "300万円から~";
		} else if (ok3.equals("22")) {
			pay = "350万円から~";
		} else if (ok3.equals("23")) {
			pay = "400万円から~";
		} else if (ok3.equals("24")) {
			pay = "450万円から~";
		} else if (ok3.equals("25")) {
			pay = "500万円から~";
		} else if (ok3.equals("26")) {
			pay = "550万円から~";
		} else if (ok3.equals("27")) {
			pay = "600万円以上";
		} else if (ok3.equals("30")) {
			pay = "年給なし";
		} else {
			return;
		}
		System.out.println("pay? = "+pay);
		System.out.println("job? = "+job);
		System.out.println("area? = "+area);
		if(pay=="年給" && job=="職業" && area=="勤務地") {
			UsersRepository repository = UsersRepository.getInstance();
			List<DodaKasha> dodaKaisha2 = repository.findByKaisha();
			DodaUser dodaUser2 =repository.findByUsernameAndPasswordid(userid);
			HttpSession session = request.getSession();
			request.setAttribute("dodaKaisha", dodaKaisha2);
			HttpSession session2 = request.getSession();
			request.setAttribute("prinsipal", dodaUser2);
			System.out.println(dodaKaisha2);

			RequestDispatcher dis =
					request.getRequestDispatcher("include/company.jsp");
			dis.forward(request, response);

		}else {
		System.out.println(pay);
		System.out.println(area);
		System.out.println(job);
		//sessionScope.prinsipal.style

		UsersRepository repository = UsersRepository.getInstance();
		List<DodaKasha> dodaKaisha = repository.findByKaisha(job, area, pay);
		DodaUser dodaUser =repository.findByUsernameAndPasswordid(userid);

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

}
