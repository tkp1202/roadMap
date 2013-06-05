package spring.base;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 * FileName : HelloServlet.java
 * 1. Servlet Directory (ǥ��ȭ�� ��������) / Web Application / Servlet Context ����
 * 2. ���� URL / URI / Servlet Mapping :: web.xml ���� ����  
 * 2. Servlet Life Cycle ����
 */
public class HelloServlet extends HttpServlet{
	///Field
	int initCount;
	int serviceCount;
	int destroyCount;

	///Method
	//init() Method Overriding
	public void init(){
		System.out.println("init() Method call : "+ ++initCount);
	}

	//service() Method Overriding
	public void service(HttpServletRequest req,HttpServletResponse res)
															throws ServletException,IOException{

		System.out.println("service() Method call : "+ ++serviceCount);
		
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("client���� ��û�Ͻ�");
		out.println("/001edu/HelloServlet�Դϴ�.<br/>");
		out.println("java class �̸�<br/>");
		out.println("���� Java web programming ����Դϴ�.<br/>");
		out.println("</body>");
		out.println("</html>");

	}//end of service

	//destroy() Method Overriding
	public void destroy(){
		System.out.println("destroy() Method call : "+ ++destroyCount);
	}

}//end of class

/* 
	browser �ּ�ǥ���ٿ� �Ʒ��� URL�Է�(Request)
	http://127.0.0.1:8080/001edu/HelloServlet
*/