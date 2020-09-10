package com.cos.doda.action.doda;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaKasha;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaGoGoAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String age = request.getParameter("age");
		String sex =request.getParameter("sex");
		String wantpay = request.getParameter("wantpay");
		String nowjob = request.getParameter("nowjob");
		String nowpay = request.getParameter("nowpay");
		String userkeireki =request.getParameter("userkeireki");
		String area = request.getParameter("area");
		int userid = Integer.parseInt(request.getParameter("userid"));

		String wantpay2;
		String nowpay2;
		String userkeireki2;
		String nowpay4;
		String wantpay4;

		System.out.println(username);
		System.out.println(age);
		System.out.println(sex);
		System.out.println(wantpay);
		System.out.println(nowjob);
		System.out.println(nowpay);
		System.out.println(userkeireki);
		System.out.println(area);
		System.out.println(userid);

		wantpay2= wantpay.replaceFirst("万円", "");
				int wantpay3 = Integer.parseInt(wantpay2);
		System.out.println("호환후 wantpay3 = " + wantpay3);

		nowpay2 = nowpay.replace("万円", "");
		int nowpay3=Integer.parseInt(nowpay2);
		System.out.println("호환후 현재월급 = "+nowpay3);
		userkeireki2 = userkeireki.replace("年目", "");
		int userkeireki3 = Integer.parseInt(userkeireki2);
		System.out.println("user케이레키  = "+userkeireki3);

		if(area=="東京都") {
			area="東京都";
		}else if(area =="北朝鮮") {
			area="北朝鮮";
		}else if(area=="大阪府") {
			area="大阪府";
		}
		System.out.println("호환후 아레아 = "+area);
		int sum = wantpay3-nowpay3;
		if(wantpay3 <250) {
			wantpay4="年給なし";
		}else if( wantpay3<=300) {
			wantpay4="250万円から~";
		}else if(wantpay3<350) {
			wantpay4="300万円から~";
		}else if(wantpay3<400) {
			wantpay4="350万円から~";
		}else if( wantpay3<450) {
			wantpay4="400万円から~";
		}else if(wantpay3<=500) {
			wantpay4="450万円から~";
		}else if(wantpay3<=550) {
			wantpay4="500万円から~";
		}
		else if(wantpay3<=600) {
			wantpay4="550万円から~";
		}else {
			wantpay4="600万円以上";
		}
		System.out.println("wantpay는 ? =" +wantpay4);



		//	String username = request.getParameter("username");
//		String age = request.getParameter("age");
//		String sex =request.getParameter("sex");
//		String wantpay = request.getParameter("wantpay");
//		String nowjob = request.getParameter("nowjob");
//		String nowpay = request.getParameter("nowpay");
//		String userkeireki =request.getParameter("userkeireki");
//		String area = request.getParameter("area");
//		int userid = Integer.parseInt(request.getParameter("userid"));

		UsersRepository usersRepository = UsersRepository.getInstance();
		List<DodaKasha> kaisha= usersRepository.findByKaisha(area, wantpay4);
		System.out.println(kaisha);

		HttpSession session = request.getSession();
		session.setAttribute("dodaKaisha", kaisha);

		Script.href("gogo1.jsp", response);







	}

}
