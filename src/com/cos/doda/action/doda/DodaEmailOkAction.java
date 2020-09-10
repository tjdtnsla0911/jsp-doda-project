package com.cos.doda.action.doda;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.activation.CommandMap;
import javax.activation.MailcapCommandMap;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.Message.RecipientType;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cos.doda.Action;
import com.cos.doda.util.Script;

public class DodaEmailOkAction implements Action{


	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String html=null;
		String email=request.getParameter("emailok");
		System.out.println("email = "+email);
			    // 메일 인코딩
			    final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
			    int result=1;
			    int i =0;

			    String subject = "메일 발송 테스트";
			    String fromEmail = "tjdtnsla911@naver.com";
			    String fromUsername = "SYSTEM MANAGER";
			    String toEmail = email; // 콤마(,)로 여러개 나열

			    final String username = "tjdtnsla911";
			    final String password = "tjdtn7687!";

			    // 메일에 출력할 텍스트
			    StringBuffer sb = new StringBuffer();
			    int nansu1 = (int)(Math.random()*10)+1;
			    String nansuyo1;
			    if(nansu1==1) {
			    	 nansuyo1="مسرور بلقائك" ;
			    }else if(nansu1==2) {
			    	nansuyo1="大家好";
			    }else if(nansu1==3) {
			    	nansuyo1=" asd123";
			    }else if(nansu1==4) {
			    	nansuyo1="878dsf";
			    }else if(nansu1==5) {
			    	nansuyo1="Chào chị";
			    }else if(nansu1==6) {
			    	nansuyo1="hương trình";
			    }else if(nansu1==7) {
			    	nansuyo1="すごい！";
			    }else if(nansu1==8) {
			    	nansuyo1="!**@";
			    }else if(nansu1==9) {
			    	nansuyo1="098765432";
			    }else{
			    	nansuyo1="뀨우우우";

			    }
			    int nansu2 = (int)(Math.random()*10)+1;
			    String nansuyo2;
			    if(nansu2==1) {
			    	 nansuyo2="مسرور بلقائك" ;


			    }else if(nansu2==2) {
			    	nansuyo2="박치기";
			    }else if(nansu2==3) {
			    	nansuyo2="★☆★★";
			    }else if(nansu2==4) {
			    	nansuyo2="878dsf";
			    }else if(nansu1==5) {
			    	nansuyo2="สวัสดีครับ ยินดีที่ได้รู้จักค";
			    }else if(nansu1==6) {
			    	nansuyo2="رور";
			    }else if(nansu1==7) {
			    	nansuyo2="ยู่ที่ไหนครับ";
			    }else if(nansu1==8) {
			    	nansuyo2="^^^^^^^";
			    }else if(nansu2==9) {
			    	nansuyo2="ㅠ_ㅠ";
			    }else{
			    	nansuyo2="開発";

			    }

			    int nansu3 = (int)(Math.random()*10)+1;
			    String nansuyo3 = null;
			    if(nansu2==3) {
			    	 nansuyo2="مسرور بلقائك" ;


			    }else if(nansu2==3) {
			    	nansuyo3="Happy Christmas";
			    }else if(nansu2==3) {
			    	nansuyo3="Türkçe";
			    }else if(nansu3==4) {
			    	nansuyo3="中国";
			    }else if(nansu3==5) {
			    	nansuyo3="※♥▒♧▧♧○";
			    }else if(nansu3==6) {
			    	nansuyo3="▶♥♣☏○♨";
			    }else if(nansu3==7) {
			    	nansuyo3="부산만세";
			    }else if(nansu3==8) {
			    	nansuyo3="харь улсын хэл.";
			    }else if(nansu3==9) {
			    	nansuyo3="ភាសាបរទេស\r\n";
			    }else{
			    	nansuyo3="ξενόγλωσση/φωτ";

			    }

			    int nansu4 = (int)(Math.random()*10)+1;
			    String nansuyo4 = null;
			    if(nansu4==1) {
			    	 nansuyo4="مسرdfور ب12لقائك" ;


			    }else if(nansu4==2) {
			    	nansuyo4="如果你去";
			    }else if(nansu4==3) {
			    	nansuyo4="ONürㅇㅂkçe";
			    }else if(nansu4==4) {
			    	nansuyo4="台湾";
			    }else if(nansu4==5) {
			    	nansuyo4="※호♥▒♧ㅋㅌㅊㅍ▧♧○";
			    }else if(nansu4==6) {
			    	nansuyo4="호로로로로로로로1";
			    }else if(nansu4==7) {
			    	nansuyo4="789654";
			    }else if(nansu4==8) {
			    	nansuyo4="wdw的dwd这";
			    }else if(nansu4==9) {
			    	nansuyo4="ភាសាបរទេស";
			    }else{
			    	nansuyo4="爬上发Ðενόγ###";

			    }




			    // 메일 옵션 설정
			    Properties props = new Properties();
			    props.put("mail.transport.protocol", "smtp");
			    props.put("mail.smtp.host", "smtp.naver.com");
			    props.put("mail.smtp.port", "465");
			    props.put("mail.smtp.auth", "true");

			    props.put("mail.smtp.quitwait", "false");
			    props.put("mail.smtp.socketFactory.port", "465");
			    props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			    props.put("mail.smtp.socketFactory.fallback", "false");
			    html = nansuyo1+nansuyo2+nansuyo3+nansuyo4;//내용인듯
			    try {
			      // 메일 서버  인증 계정 설정
			      Authenticator auth = new Authenticator() {
			        protected PasswordAuthentication getPasswordAuthentication() {
			          return new PasswordAuthentication(username, password);
			        }
			      };

			      // 메일 세션 생성
			      Session session = Session.getInstance(props, auth);

			      // 메일 송/수신 옵션 설정
			      Message message = new MimeMessage(session);
			      message.setFrom(new InternetAddress(fromEmail, fromUsername));
			      message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
			      message.setSubject(subject);
			      message.setSentDate(new Date());

			      // 메일 콘텐츠 설정
			      Multipart mParts = new MimeMultipart();
			      MimeBodyPart mTextPart = new MimeBodyPart();
			      MimeBodyPart mFilePart = null;

			      // 메일 콘텐츠 - 내용
			      mTextPart.setText(html, bodyEncoding);//제목인듯
			      mParts.addBodyPart(mTextPart);
			      // 메일 콘텐츠 설정
			      message.setContent(mParts);

			      // MIME 타입 설정
			      MailcapCommandMap MailcapCmdMap = (MailcapCommandMap) CommandMap.getDefaultCommandMap();
			      MailcapCmdMap.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
			      MailcapCmdMap.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
			      MailcapCmdMap.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
			      MailcapCmdMap.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
			      MailcapCmdMap.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
			      CommandMap.setDefaultCommandMap(MailcapCmdMap);


			      // 메일 발송
			      Transport.send( message );
			      HttpSession session2 = request.getSession();
			      session2.setAttribute("emailok", html);

			      System.out.println("세션  = " +session);
			      Script.outText2(html, response);




			    } catch ( Exception e ) {
			      e.printStackTrace();
			    }finally {
			    	System.out.println("html =" +html);

			    	System.out.println(result);
			    	     System.out.println("html은 = "+html);
			    }


			      // 메일 콘텐츠 설정

			    }
}