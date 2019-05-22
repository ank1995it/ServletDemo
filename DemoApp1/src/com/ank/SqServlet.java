package com.ank;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String s=(String) req.getAttribute("k");
		PrintWriter out=res.getWriter();
		out.println("here i am"+" "+s);
	}
}
