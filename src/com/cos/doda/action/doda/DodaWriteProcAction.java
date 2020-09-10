package com.cos.doda.action.doda;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cos.doda.Action;
import com.cos.doda.model.DodaUserSodan;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;

public class DodaWriteProcAction implements Action{
	static int comid=1;
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String userid=request.getParameter("userid");
		String email=request.getParameter("email");
		String tell=request.getParameter("tell");
		int id=Integer.parseInt(request.getParameter("id"));
		String title=request.getParameter("title");
		String content=request.getParameter("content");
		int comidX=Integer.parseInt(request.getParameter("comid"));

		System.out.println("콘텐트내용이뭐길래 부적절하노 ㅅㅂ ="+content);
		DodaUserSodan dodaUserSodan = DodaUserSodan.builder()
				.name(name)
				.userid(userid)
				.email(email)
				.tell(tell)
				.id(id)
				.title(title)
				.content(content)
				.comid(comid)
				.build();
		comid=comid+1;
		UsersRepository usersRepository =UsersRepository.getInstance();
		int result = usersRepository.savedodausersodan(dodaUserSodan);
System.out.println("상담 result = "+result);
		if(result==1) {
			Script.href("エージェントサービス相談作成に成功しました","index.jsp", response);
		}


	}



}
