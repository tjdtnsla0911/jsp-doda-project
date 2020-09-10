package com.cos.doda.action.doda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.coyote.RequestGroupInfo;

import com.cos.doda.Action;
import com.cos.doda.model.DodaRirekishou;
import com.cos.doda.repository.UsersRepository;
import com.cos.doda.util.Script;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class DodarirekishouProcAction implements Action{
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String realPath = request.getServletContext().getRealPath("image");

		MultipartRequest multi = new MultipartRequest(request, realPath, 1024 * 1024 * 2, "UTF-8",
				new DefaultFileRenamePolicy());

		String koreaname =multi.getParameter("koreaname");
		String birthday=multi.getParameter("birthday");
		String email = multi.getParameter("email");
		String kanjiname = multi.getParameter("kanjiname");
		String address = multi.getParameter("address");
		String tell = multi.getParameter("tell");
		String tell2 = multi.getParameter("tell2");
		String kauki1= multi.getParameter("kauki1");
		String kauki2 = multi.getParameter("kauki2");
		String kauki3 = multi.getParameter("kauki3");
		String kigen1 = multi.getParameter("kigen1");
		String kigen2 = multi.getParameter("kigen2");
		String kigen3 = multi.getParameter("kigen3");
		String gatko1 = multi.getParameter("gatko1");
		String gatko2 = multi.getParameter("gatko2");
		String gatko3 = multi.getParameter("gatko3");
		String sotugyou1 = multi.getParameter("sotugyou1");
		String sotugyou2 = multi.getParameter("sotugyou2");
		String sotugyou3 = multi.getParameter("sotugyou3");
		String senko1 = multi.getParameter("senko1");
		String senko2 = multi.getParameter("senko2");
		String senko3 = multi.getParameter("senko3");
		String bigo1 = multi.getParameter("bigo1");
		String bigo2 = multi.getParameter("bigo2");
		String bigo3 = multi.getParameter("bigo3");
		String keireki1 = multi.getParameter("keireki1");
		String keireki2 = multi.getParameter("keireki2");
		String keireki3 = multi.getParameter("keireki3");
		String keirekikigen1 =multi.getParameter("keirekikigen1");
		String keirekikigen2 =multi.getParameter("keirekikigen2");
		String keirekikigen3 =multi.getParameter("keirekikigen3");
		String sanko= multi.getParameter("sanko");
		String day = multi.getParameter("day");
		int id= Integer.parseInt(multi.getParameter("userid"));
		String img = multi.getFilesystemName("img");
		String kinmu1 = multi.getParameter("kinmu1");
		String kinmu2 = multi.getParameter("kinmu2");
		String kinmu3 = multi.getParameter("kinmu3");
		String level1 = multi.getParameter("level1");
		String level2 = multi.getParameter("level2");
		String level3 = multi.getParameter("level3");
		String sikaku1 = multi.getParameter("sikaku1");
		String sikaku2 = multi.getParameter("sikaku2");
		String sikaku3 = multi.getParameter("sikaku3");
		System.out.println("킨무1" +kinmu1);
		System.out.println("킨무1" +kinmu1);
		System.out.println("킨무1" +kinmu1);
		System.out.println("img값 = " + img);
//input_img // img
		System.out.println("받아온아이디값 "+id);

		String fileName = null;
		String contextPath = request.getServletContext().getContextPath();
		String userProfile = null;

		try {


			fileName = multi.getFilesystemName("img");

			userProfile = contextPath + "/image/" + fileName;

			DodaRirekishou dodaRirekishou = new DodaRirekishou();
			dodaRirekishou.setKoreaname(koreaname);
			dodaRirekishou.setBirthday(birthday);
			dodaRirekishou.setEmail(email);
			dodaRirekishou.setKanjiname(kanjiname);
			dodaRirekishou.setAddress(address);
			dodaRirekishou.setTell(tell);
			dodaRirekishou.setTell2(tell2);
			dodaRirekishou.setKauki1(kauki1);
			dodaRirekishou.setKauki2(kauki2);
			dodaRirekishou.setKauki3(kauki3);
			dodaRirekishou.setKigen1(kigen1);
			dodaRirekishou.setKigen2(kigen2);
			dodaRirekishou.setKigen3(kigen3);
			dodaRirekishou.setGatko1(gatko1);
			dodaRirekishou.setGatko2(gatko2);
			dodaRirekishou.setGatko3(gatko3);
			dodaRirekishou.setSotugyou1(sotugyou1);
			dodaRirekishou.setSotugyou2(sotugyou2);
			dodaRirekishou.setSotugyou3(sotugyou3);
			dodaRirekishou.setSenko1(senko1);
			dodaRirekishou.setSenko2(senko2);
			dodaRirekishou.setSenko3(senko3);
			dodaRirekishou.setBigo1(bigo1);
			dodaRirekishou.setBigo2(bigo2);
			dodaRirekishou.setBigo3(bigo3);
			dodaRirekishou.setKeireki1(keireki1);
			dodaRirekishou.setKeireki2(keireki2);
			dodaRirekishou.setKeireki3(keireki3);
			dodaRirekishou.setKeirekikigen1(keirekikigen1);
			dodaRirekishou.setKeirekikigen2(keirekikigen2);
			dodaRirekishou.setKeirekikigen3(keirekikigen3);
			dodaRirekishou.setSanko(sanko);
			dodaRirekishou.setDay(day);
			dodaRirekishou.setId(id);
			dodaRirekishou.setImg(userProfile);
			dodaRirekishou.setKinmu1(kinmu1);
			dodaRirekishou.setKinmu2(kinmu2);
			dodaRirekishou.setKinmu3(kinmu3);
			dodaRirekishou.setLevel1(level1);
			dodaRirekishou.setLevel2(level2);
			dodaRirekishou.setLevel3(level3);
			dodaRirekishou.setSikaku1(sikaku1);
			dodaRirekishou.setSikaku2(sikaku2);
			dodaRirekishou.setSikaku3(sikaku3);



			System.out.println("현재 경로 ? =" + dodaRirekishou.getImg());

			UsersRepository usersRepository= UsersRepository.getInstance();
			int result = usersRepository.saveRirekishou(dodaRirekishou);

			if(result==1) {
				Script.href("이력서 작성완료","index.jsp",response);
			}else {
				Script.back("이력서작성실패", response);

			}



		} catch (Exception e) {
			e.printStackTrace();
		}




	}

}
