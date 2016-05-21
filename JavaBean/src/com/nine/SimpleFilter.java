package com.nine;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SimpleFilter	implements Filter {

	public SimpleFilter() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("** 执行doFilter之前**");
		arg2.doFilter(arg0,arg1);
		System.out.println("** 执行doFilter之后**");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		String initParam  = arg0.getInitParameter("ref");
		System.out.println("**过滤器初始化，初始化参数="+ initParam);
	}

}
