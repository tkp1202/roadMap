<%@ page contentType="text/html;charset=euc-kr" %>
<%@page import="java.util.Date" %>

<%--
		1. JSP : JSP Container 에 의해 Servlet code 로 변환
	    2. Servlet Container  의해 실행 됨 
 --%>

<HTML>
<HEAD><TITLE> HelloJSP</TITLE></HEAD>
<BODY>
		<%= "안녕세요. HelloJSP 입니다." %><br/><hr/>
		client 에서 요청하신 /001edu/HelloJSP.jsp 입니다.<br/>
		JSP는 Java web programming 기술입니다.<br/>
		현재 시간은 : <%= new Date() %><br/>
<hr>
</BODY>
</HTML>

<!-- 
		browser 주소표시줄에 아래의 URL입력(Request)
		http://127.0.0.1:8080/001edu/HelloJSP.jsp
-->