package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.model.DodaUser;
import com.cos.doda.model.ipip;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaLoginAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String kensa=request.getParameter("userid");
		String kensa2 = request.getParameter("password");
		System.out.println("kensa " + kensa);
		System.out.println("kensa " + kensa2);
		UsersRepository usersRepository2 = UsersRepository.getInstance();
		if(kensa.startsWith("&lt;scr")||kensa2.startsWith("&lt;scr")) {
			String ip = request.getHeader("X-Forwarded-For");
			 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			     ip = request.getHeader("Proxy-Client-IP");
			     System.out.println("1번 "+ip);
			 }
			 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			     ip = request.getHeader("WL-Proxy-Client-IP");
			     System.out.println("2번 "+ip);
			 }
			 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			     ip = request.getHeader("HTTP_CLIENT_IP");
			     System.out.println("3번 "+ip);
			 }
			 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			     ip = request.getHeader("HTTP_X_FORWARDED_FOR");
			     System.out.println("4번 "+ip);
			 }
			 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			     ip = request.getHeader("X-Real-IP");
			     System.out.println("5번 "+ip);
			 }
			 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			     ip = request.getHeader("X-RealIP");
			     System.out.println("6번 "+ip);
			 }
			 if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			     ip = request.getRemoteAddr();
			     ipip ip2= new ipip();
			     int result = usersRepository2.saveipip(ip);
			     if(result==1) {
			    	 Script.href("불법적인 공격을 수행한걸로 간주되어 현시간부로 영구정지당합니다. 문의사항 - 없음","https://www.youtube.com/watch?v=ts0owmAjVew", response);
			    	 return;
			     }

			     System.out.println("7번 "+ip);
			 }


		}
		if (request.getParameter("userid") == null || request.getParameter("userid").equals("")
				|| request.getParameter("password") == null || request.getParameter("password").equals("")) {
			return;
		}
		System.out.println("리턴당햇으면 이거안나옴");
		String userid =request.getParameter("userid");
		String password = request.getParameter("password");

		UsersRepository usersRepository = UsersRepository.getInstance();
		System.out.println("userid = "+userid);
		System.out.println("password ="+password);
		DodaUser dodaUser = usersRepository.findByUsernameAndPassword(userid, password);
		System.out.println("이것이 dodaUser의 값입니다 ="+dodaUser);
		if(dodaUser!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("prinsipal", dodaUser);
			System.out.println("이것이 세션의 값입니다 ="+session);

//			if(request.getParameter("remember")!=null) {
//				Cookie cookie = new Cookie("remember", dodaUser.getUserid());
//				response.addCookie(cookie);
//			}else {
//				Cookie cookie = new Cookie("remember", "");
//				cookie.setMaxAge(0);
//				response.addCookie(cookie);
//			}
			Script.href("ログインを成功しました！","index.jsp", response);
		}else {
			Script.back("로그인 실패", response);
		}


	}

}
