<%@ page contentType="text/html;charset=euc-kr" %>
<%@page import="java.util.Date" %>

<%--
		1. JSP : JSP Container �� ���� Servlet code �� ��ȯ
	    2. Servlet Container  ���� ���� �� 
 --%>

<HTML>
<HEAD><TITLE> HelloJSP</TITLE></HEAD>
<BODY>
		<%= "�ȳ缼��. HelloJSP �Դϴ�." %><br/><hr/>
		client ���� ��û�Ͻ� /001edu/HelloJSP.jsp �Դϴ�.<br/>
		JSP�� Java web programming ����Դϴ�.<br/>
		���� �ð��� : <%= new Date() %><br/>
<hr>
</BODY>
</HTML>

<!-- 
		browser �ּ�ǥ���ٿ� �Ʒ��� URL�Է�(Request)
		http://127.0.0.1:8080/001edu/HelloJSP.jsp
-->