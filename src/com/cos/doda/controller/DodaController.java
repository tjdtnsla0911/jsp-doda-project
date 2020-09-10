package com.cos.doda.controller;



import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;

import com.cos.doda.action.doda.DadoHomeAction;
import com.cos.doda.action.doda.DodaAjactAction;
import com.cos.doda.action.doda.DodaAjactProc;
import com.cos.doda.action.doda.DodaCompanyAction;
import com.cos.doda.action.doda.DodaCompanyAction2;
import com.cos.doda.action.doda.DodaCompanyTorokuAction;
import com.cos.doda.action.doda.DodaConditionAction;
import com.cos.doda.action.doda.DodaDeleteAction;
import com.cos.doda.action.doda.DodaEmailOkAction;
import com.cos.doda.action.doda.DodaEventAction;
import com.cos.doda.action.doda.DodaGoGoAction;
import com.cos.doda.action.doda.DodaHensinByidAction;
import com.cos.doda.action.doda.DodaHoanAction;
import com.cos.doda.action.doda.DodaHopeAction;
import com.cos.doda.action.doda.DodaHozonAction;
import com.cos.doda.action.doda.DodaJoinAction;
import com.cos.doda.action.doda.DodaJoinProc;
import com.cos.doda.action.doda.DodaKaihoAction;
import com.cos.doda.action.doda.DodaKaishaToroku;
import com.cos.doda.action.doda.DodaKaitokanriAction;
import com.cos.doda.action.doda.DodaKaitouAction;
import com.cos.doda.action.doda.DodaKanrenAction;
import com.cos.doda.action.doda.DodaKanrihensinAction;
import com.cos.doda.action.doda.DodaLoginAction;
import com.cos.doda.action.doda.DodaLougouAction;
import com.cos.doda.action.doda.DodaMachingAction;
import com.cos.doda.action.doda.DodaOkinihailiAction;
import com.cos.doda.action.doda.DodaPowercompanyAction;
import com.cos.doda.action.doda.DodaPrAction;
import com.cos.doda.action.doda.DodaQaAction;
import com.cos.doda.action.doda.DodaRandomAction;
import com.cos.doda.action.doda.DodaRealyserch;
import com.cos.doda.action.doda.DodaRirekishouAction;
import com.cos.doda.action.doda.DodaScautoAction;
import com.cos.doda.action.doda.DodaScautoStoryAction;
import com.cos.doda.action.doda.DodaSen1Action;
import com.cos.doda.action.doda.DodaSen2Action;
import com.cos.doda.action.doda.DodaSen3Action;
import com.cos.doda.action.doda.DodaSen4Action;
import com.cos.doda.action.doda.DodaSibouAction;
import com.cos.doda.action.doda.DodaSodanAction;
import com.cos.doda.action.doda.DodaSukautotensoAction;
import com.cos.doda.action.doda.DodaTegamiAction;
import com.cos.doda.action.doda.DodaTestProcAction;
import com.cos.doda.action.doda.DodaUserAction;
import com.cos.doda.action.doda.DodaUsersusernameCheckAction;
import com.cos.doda.action.doda.DodaWriteProcAction;
import com.cos.doda.action.doda.DodadeletetegamiAction;
import com.cos.doda.action.doda.DodakaishasuisenAction;
import com.cos.doda.action.doda.DodamyKaishasAction;
import com.cos.doda.action.doda.DodarirekishouProcAction;
import com.cos.doda.action.doda.MymyrirekishouAction;
import com.cos.doda.model.DodaUser;

import oracle.security.o5logon.d;




@WebServlet("/doda")
public class DodaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DodaController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doDada(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doDada(request, response);
	}

	protected void doDada(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("path", request.getContextPath());
		String cmd = request.getParameter("cmd");
		Action action = router(cmd);
		action.execute(request, response);

	}

	public Action router(String cmd) {
		if (cmd.equals("home")) {
			System.out.println("인덱스 시작");
			return new DadoHomeAction();
		} else if (cmd.equals("hope")) {
			System.out.println("여기는왔니?");
			return new DodaHopeAction();
		} else if (cmd.equals("condition")) {
			System.out.println("여기는왔니?");
			return new DodaConditionAction();
		} else if (cmd.equals("join")) {
			System.out.println("여기는왔니?");
			return new DodaJoinAction();
		} else if (cmd.equals("usernameCheck")) {
			System.out.println("여긴왓습니까?");
			return new DodaUsersusernameCheckAction();
		} else if (cmd.equals("joinProc")) {
			return new DodaJoinProc();
		} else if (cmd.equals("event")) {
			return new DodaEventAction();
		} else if (cmd.equals("login")) {
			System.out.println("액션들어가기전");
			return new DodaLoginAction();
		} else if (cmd.equals("maching")) {
			return new DodaMachingAction();
		} else if (cmd.equals("ajact")) {
			return new DodaAjactAction();
		} else if (cmd.equals("ajactProc")) {
			return new DodaAjactProc();
		} else if (cmd.equals("logout")) {
			System.out.println("로그아웃에는 왔니? ");
			return new DodaLougouAction();
		} else if (cmd.equals("company")) {
			System.out.println("여긴왓눈가?");
			return new DodaCompanyAction();
		} else if (cmd.equals("kaishatoroku")) {
			System.out.println("회사등록에 왓습니다");
			return new DodaKaishaToroku();
		} else if (cmd.equals("companytoroku")) {
			System.out.println("컴파니 토로쿠 왓는가?");
			return new DodaCompanyTorokuAction();
		} else if (cmd.equals("pr")) {
			return new DodaPrAction();
		} else if (cmd.equals("sen1")) {
			return new DodaSen1Action();
		} else if (cmd.equals("sen2")) {
			return new DodaSen2Action();
		} else if (cmd.equals("sen3")) {
			return new DodaSen3Action();
		} else if (cmd.equals("sen4")) {
			return new DodaSen4Action();
		}else if(cmd.equals("skauto")) {
			return new DodaScautoAction();
		}else if(cmd.equals("sukautostory")) {
			System.out.println("스카웃스토리로 들어왓당");
			return new DodaScautoStoryAction();
		}else if(cmd.equals("rirekishou")) {
			System.out.println("이력서 쓰러 왓쪙!");
			return new DodaRirekishouAction();
		}else if(cmd.equals("test1")) {
			System.out.println("테스트1에 들어갑니데이!");
			return new DodaTestProcAction();
		}else if(cmd.equals("writeProc")) {
			System.out.println("writeProc에 들어왓습니다");
			return new DodaWriteProcAction();
		}else if(cmd.equals("sodan")) {
			return new DodaSodanAction();
		}else if(cmd.equals("delete")) {
			System.out.println("델레트진입성공");
			return new DodaDeleteAction();
		}else if(cmd.equals("hensinByid")) {
			return new DodaHensinByidAction();
		}else if(cmd.equals("kaitou")) {
		return new DodaKaitouAction();
		}else if(cmd.equals("kaitokanri")) {
			return new DodaKaitokanriAction();
		}else if(cmd.equals("realyserch")) {
			return new DodaRealyserch();
		}else if(cmd.equals("random")) {
			return new DodaRandomAction();
		}else if(cmd.equals("QA")) {
			return new DodaQaAction();
		}else if(cmd.equals("kanren")) {
			return new DodaKanrenAction();
		}else if(cmd.equals("emailok")) {
			System.out.println("이메일타러옴");
			return new DodaEmailOkAction();
		}else if(cmd.equals("myKaisha")) {
			System.out.println("회사 찜 하러왓니?");
			return new DodamyKaishasAction();
		}else if(cmd.equals("okinihaili")){
			return new DodaOkinihailiAction();

		}else if(cmd.equals("tegami")) {
			System.out.println("테가미에왓음");
			return new DodaTegamiAction();
		}else if(cmd.equals("kanrihensin")) {
			return new DodaKanrihensinAction();
		}else if(cmd.equals("usersodenhensin")) {
			return new DodaUserAction();
		}else if(cmd.equals("hozon")) {
			return new DodaHozonAction();
		}else if(cmd.equals("powercompany")) {
			return new DodaPowercompanyAction();

		}else if(cmd.equals("sukautotenso")) {
			return new DodaSukautotensoAction();
		}else if(cmd.equals("kaishasuisen")) {
			return new DodakaishasuisenAction();
		}else if(cmd.equals("gogostart")) {
			return new DodaGoGoAction();
		}else if(cmd.equals("company2")) {
			return new DodaCompanyAction2();
		}else if(cmd.equals("deletetegami")) {
			return new DodadeletetegamiAction();
		}else if(cmd.equals("rirekishouProc")) {
			System.out.println("이력서등록에왓음");
			return new DodarirekishouProcAction();
		}else if(cmd.equals("myrirekishou")) {
		System.out.println("이력서확인하러옴");
			return new MymyrirekishouAction();

		}else if(cmd.equals("hoan")) {
			return new DodaHoanAction();
		}else if(cmd.equals("kaiho")) {
			return new DodaKaihoAction();
		}else if(cmd.equals("sibou")) {
			return new DodaSibouAction();
		}
		return null;
	}

}
