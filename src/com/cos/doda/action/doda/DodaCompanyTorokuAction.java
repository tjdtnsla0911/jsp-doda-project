package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.doda.Action;
import com.cos.doda.model.DodaKasha;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import com.sun.xml.internal.bind.v2.model.core.ID;

public class DodaCompanyTorokuAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String realPath = request.getServletContext().getRealPath("image");

		MultipartRequest multi = new MultipartRequest(request, realPath, 1024 * 1024 * 2, "UTF-8",
				new DefaultFileRenamePolicy());

		if (multi.getParameter("kaishaname") == null || multi.getParameter("kaishaname").equals("")
				|| multi.getParameter("pay") == null || multi.getParameter("pay").equals("")
				|| multi.getParameter("peoples") == null || multi.getParameter("peoples").equals("")
				|| multi.getParameter("since") == null || multi.getParameter("since").equals("")
				|| multi.getParameter("introduction") == null || multi.getParameter("introduction").equals("")
				|| multi.getParameter("job") == null || multi.getParameter("job").equals("")
				|| multi.getParameter("area") == null || multi.getParameter("area").equals("")
				|| multi.getParameter("people") == null || multi.getParameter("people").equals("")
				|| multi.getParameter("time") == null || multi.getParameter("time").equals("")
				|| multi.getParameter("school") == null || multi.getParameter("school").equals("")
				|| multi.getParameter("company") == null || multi.getParameter("company").equals("")
				|| multi.getParameter("day") == null || multi.getParameter("day").equals("")
				|| multi.getFilesystemName("img") == null || multi.getFilesystemName("img").equals("")

				)
		{
			Script.back("チェックしてない事、または作成してないものがあります", response);
			return;
		}
		String kaishaname = multi.getParameter("kaishaname");
		String pay = multi.getParameter("pay");
		String peoples = multi.getParameter("peoples");
		String since = multi.getParameter("since");
		String introduction = multi.getParameter("introduction");
		String job = multi.getParameter("job");
		String area = multi.getParameter("area");
		String people = multi.getParameter("people");
		String img = multi.getFilesystemName("img");
		String time = multi.getParameter("time");
		String school =multi.getParameter("school");
		String company = multi.getParameter("company");
		String day = multi.getParameter("day");


		System.out.println("kaishaname. =" + kaishaname);
		System.out.println("pay. =" + pay);
		System.out.println("peoples. =" + peoples);
		System.out.println("since. =" + since);
		System.out.println("introduction. =" + introduction);
		System.out.println("job. =" + job);
		System.out.println("area. =" + area);
		System.out.println("people. =" + people);
		System.out.println("img. =" + img);
		System.out.println("realPath. =" + realPath);
		System.out.println("time =" + time);
		System.out.println("school =" + school);
		System.out.println("company =" + company);
		System.out.println("day =" + day);

		String fileName = null;
		String contextPath = request.getServletContext().getContextPath();
		String userProfile = null;
		try {

			fileName = multi.getFilesystemName("img");

			userProfile = contextPath + "/image/" + fileName;

			System.out.println("userProfile의 현재 내용? " + userProfile);
			System.out.println("userProfile의 현재 내용? " + userProfile);
			System.out.println("userProfile의 현재 내용? " + userProfile);

			System.out.println(kaishaname);
			System.out.println(pay);
			System.out.println(peoples);
			System.out.println(since);
			System.out.println(introduction);
			System.out.println(job);
			System.out.println(area);
			System.out.println(people);
			System.out.println(realPath);
			System.out.println(img);

//			String time = multi.getParameter("time");
//			String school =multi.getParameter("school");
//			String company = multi.getParameter("company");
//			String day = multi.getParameter("day");

			DodaKasha dodaKasha = new DodaKasha();
			dodaKasha.setKaishaname(kaishaname);
			dodaKasha.setPay(pay);
			dodaKasha.setPeoples(peoples);
			dodaKasha.setSince(since);
			dodaKasha.setIntroduction(introduction);
			dodaKasha.setJob(job);
			dodaKasha.setArea(area);
			dodaKasha.setPeople(people);
			dodaKasha.setImg(userProfile);
			dodaKasha.setTime(time);
			dodaKasha.setSchool(school);
			dodaKasha.setCompany(company);
			dodaKasha.setDay(day);
			System.out.println("현재 경로 ? =" + dodaKasha.getImg());

			System.out.println("dodaKaisha의 값 =" + dodaKasha);
			UsersRepository usersRepository = UsersRepository.getInstance();
			int result = usersRepository.savekaisha(dodaKasha);
			System.out.println("이것이 리절트값입니다 = " + result);
			if (result == 1) {
				Script.href("社員募集登録に成功しました", "index.jsp", response);

			} else {
				Script.back("社員募集登録に失敗しました", response);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
