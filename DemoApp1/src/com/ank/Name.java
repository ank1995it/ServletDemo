package com.ank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Name extends HttpServlet {
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
{
	String s=req.getParameter("name");
	String s1=req.getParameter("pass");
	PrintWriter out=res.getWriter();
	out.println(s+" "+s1);
}
}
