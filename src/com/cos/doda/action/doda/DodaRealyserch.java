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
import com.cos.doda.repository.UsersRepository;

public class DodaRealyserch implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String day = request.getParameter("day");
		String school = request.getParameter("school");
		String company = request.getParameter("company");
		String sigoto = request.getParameter("sigoto");
		String area = request.getParameter("area");
		String money = request.getParameter("money");
		String time =request.getParameter("time");
		if(time.equals("1")) {
			time = "8時間以下勤務";
		}else if(time.equals("2")) {
			time = "8時間勤務";
		}else if(time.equals("3")) {
			time = "8~10時間勤務";
		}else if(time.equals("4")) {
			time = "10~12時間勤務";
		}else if(time.equals("5")) {
			time = "12時間勤務";
		}else if(time.equals("6")) {
			time = "24時間勤務";}
		if(day.equals("7")) {
			day="週1日";
		}else if(day.equals("8")) {
			day="週2日";
		}else if(day.equals("9")) {
			day="週3日以上";
		}else if(day.equals("10")) {
			day="休日なし";}
		if(school.equals("11")) {
			school = "小学校卒業";
		}else if(school.equals("12")) {
			school = "中学校卒業";
		}else if(school.equals("13")) {
			school = "高等学校卒業";
		}else if(school.equals("14")) {
			school = "大学卒業";
		}else if(school.equals("15")) {
			school = "大学院卒業";
		}else if(school.equals("16")) {
			school = "学校に行ったことなし";
		}if(company.equals("17")) {
			company="小企業";
		}else if(company.equals("18")) {
			company="中小企業";
		}else if(company.equals("19")) {
			company="大手企業";
		}else if(company.equals("20")) {
			company="スーパー凄い大手企業";
		}if(sigoto.equals("21")) {
			sigoto="営業職";
		}else if(sigoto.equals("22")) {
			sigoto="企画、管理";
		}else if(sigoto.equals("23")) {
			sigoto="事務";
		}else if(sigoto.equals("24")) {
			sigoto="企画、管理";
		}else if(sigoto.equals("25")) {
			sigoto="専門職";
		}else if(sigoto.equals("26")) {
			sigoto="技術(IT,Web)";
		}else if(sigoto.equals("27")) {
			sigoto="奴隷";
		}if(area.equals("28")) {
			area="北海道";
		}else if(area.equals("29")) {
			area="大阪府";
		}else if(area.equals("30")) {
			area="東京都";
		}else if(area.equals("31")) {
			area="九州";
		}else if(area.equals("32")) {
			area="岩手県";
		}else if(area.equals("33")) {
			area="新潟県";
		}else if(area.equals("34")) {
			area="群馬県";
		}else if(area.equals("35")) {
			area="三重県";
		}else if(area.equals("36")) {
			area="沖縄県";
		}else if(area.equals("37")) {
			area="北朝鮮";
		}if(money.equals("38")) {
			money = "200万円から~";
		}else if(money.equals("39")) {
			money = "250万円から~";
		}else if(money.equals("40")) {
			money = "300万円から~~";
		}
		else if(money.equals("41")) {
			money = "350万円から~";
		}
		else if(money.equals("42")) {
			money = "400万円から~";
		}
		else if(money.equals("43")) {
			money = "450万円から~";
		}
		else if(money.equals("44")) {
			money = "500万円から~";
		}
		else if(money.equals("45")) {
			money = "550万円から~";
		}
		else if(money.equals("46")) {
			money = "600万円以上";
		}
		else if(money.equals("47")) {
			money = "年給なし";
		}

		System.out.println(day);
		System.out.println(school);
		System.out.println(company);
		System.out.println(sigoto);
		System.out.println(area);
		System.out.println(money);
		System.out.println(time);

		UsersRepository reqRepository = UsersRepository.getInstance();
		List<DodaKasha> dodaKasha = reqRepository.findByKaisha(day,school,company,sigoto,area,money,time);

		System.out.println("dodakasha의 값 ="+dodaKasha);
		if(dodaKasha != null) {
			HttpSession session= request.getSession();
			request.setAttribute("dodaKaisha", dodaKasha);

			RequestDispatcher dis =
					request.getRequestDispatcher("include/company.jsp");
			dis.forward(request, response);
		}


	}

}
