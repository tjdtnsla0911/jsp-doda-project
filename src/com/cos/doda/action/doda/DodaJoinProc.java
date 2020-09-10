package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.startup.HomesUserDatabase;

import com.cos.doda.Action;
import com.cos.doda.model.DodaUser;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class DodaJoinProc implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String style = request.getParameter("style");
		String okok = request.getParameter("okok");
		String emailok2= request.getParameter("emailok2");

		System.out.println("okok = "+okok);
		System.out.println("emailok2 = "+emailok2);

		if(!okok.equals(emailok2)) {
			Script.href("이메일 인증을 안하였으므로 메인페이지로 돌아갑니다","index.jsp",response);
			return;

		}

		if (request.getParameter("name") == null||
				request.getParameter("name").equals("")||
				request.getParameter("userid") == null||
				request.getParameter("userid").equals("")||
				request.getParameter("password") == null||
				request.getParameter("password").equals("")||
				request.getParameter("emailsk") == null||
				request.getParameter("emailsk").equals("")||
				request.getParameter("address") == null||
				request.getParameter("address").equals("")||
				request.getParameter("tell") == null||
				request.getParameter("tell").equals("")||
				request.getParameter("style").equals("")) {
			System.out.println("여기서 리턴됫니?");
			return;
		}

		if(style.equals("1")) {
			style="個人会員";
		}else if(style.equals("2")) {
			style="法人社員";

		}else if(style.equals("3")) {
			style="管理者";
			if(style=="管理者" && request.getParameter("pass").equals("私は管理者です")) {

			}else{
				Script.href("管理者暗証番号が違います","user/join.jsp", response);
				return;

			}
		}else {
			return;
		}

		System.out.println("아니면 리턴안됫니?");
		String name= request.getParameter("name");
		String userid= request.getParameter("userid");
		String password= request.getParameter("password");
		String email= request.getParameter("emailsk");
		String address = request.getParameter("address");
		String tell= request.getParameter("tell");

		DodaUser doda = DodaUser.builder()
				.userid(userid)
				.name(name)
				.password(password)
				.email(email)
				.address(address)
				.tell(tell)
				.style(style)
				.build();

System.out.println("style의 값 = "+ style);
		UsersRepository usersRepository = UsersRepository.getInstance();
		int result = usersRepository.save(doda);
		System.out.println(result);
		if(result==1) {
			Script.href("会員登録を完了しました。","home.jsp", response);
//			Script.href("会員登録を完了しました。", "/doda/doda?cmd=login",response);
		}else {
			Script.back("회원가입에 실패하였습니다.", response);
		}



	}
//	private String name;
//	private String userid;
//	private String password;
//	private String email;
//	private String address;
//	private String tell;
//	private int id;


}
