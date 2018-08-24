package com.practice_jsp.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class SecondServlet extends HttpServlet{
	
	
	//get방식 요청!
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("SecondServlet!!");
		PrintWriter out = resp.getWriter();
		//out으로 객체를 생성하고 출력함
		out.print("<html><head><title>Test</title></head>");
		out.print("<body><h1>Have a nice day!</h1></body>");
		out.println("</html>");
		out.close();
	}
}
