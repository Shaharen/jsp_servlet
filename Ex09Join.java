package com.smhrd.servlet1231;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Join")
public class Ex09Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();

		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String name = request.getParameter("NAME");
		String email = request.getParameter("EMAIL");
		String tel = request.getParameter("TEL");
		String gender = request.getParameter("GENDER");
		String[] hobby = request.getParameterValues("HOBBY");
		String birth = request.getParameter("BIRTHDAY");
		String color = request.getParameter("COLOR");
		String country = request.getParameter("COUNTRY");
		String talk = request.getParameter("TALK");
		
		out.print("<html><head><title>회원 정보</title></head>");
		out.print("<body>");
		out.print("ID : "+ id +"<br>");
		out.print("PW : "+ pw +"<br>");
		out.print("NAME : "+ name +"<br>");
		out.print("EMAIL : "+ email +"<br>");
		out.print("TEL : "+ tel +"<br>");
		out.print("GENDER : "+ gender +"<br>");
		out.print("HOBBY : "+ Arrays.toString(hobby) + "<br>");
		out.print("BIRTHDAY : "+ birth +"<br>");
		out.print("COLOR : "+ color +"<br>");
		out.print("COUNTRY : "+ country +"<br>");
		out.print("TALK : "+ talk +"<br>");
		out.print("</body></html>");
	}

}
