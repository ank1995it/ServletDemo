package com.ank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Name extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
{
	
	String s=req.getParameter("name");
	String s1=req.getParameter("pass");
	PrintWriter out=res.getWriter();
	out.println("USername is:"+" "+s);
	out.println("Password is:"+" "+s1);
	req.setAttribute("k", s);
	RequestDispatcher rd=req.getRequestDispatcher("sq");
	rd.forward(req, res);
}
}
