package spring.base;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 * FileName : HelloServlet.java
 * 1. Servlet Directory (표준화된 폴더구조) / Web Application / Servlet Context 이해
 * 2. 접근 URL / URI / Servlet Mapping :: web.xml 설정 이해  
 * 2. Servlet Life Cycle 이해
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
		out.println("client에서 요청하신");
		out.println("/001edu/HelloServlet입니다.<br/>");
		out.println("java class 이며<br/>");
		out.println("물론 Java web programming 기술입니다.<br/>");
		out.println("</body>");
		out.println("</html>");

	}//end of service

	//destroy() Method Overriding
	public void destroy(){
		System.out.println("destroy() Method call : "+ ++destroyCount);
	}

}//end of class

/* 
	browser 주소표시줄에 아래의 URL입력(Request)
	http://127.0.0.1:8080/001edu/HelloServlet
*/