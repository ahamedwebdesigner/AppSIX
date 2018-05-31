package com.ssn.appsix.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class InterceptorEG implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("********************************************");
		System.out.println("From preHandle method of InterceptorEG class");
		System.out.println("********************************************");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("********************************************");
		System.out.println("From postHandle method of InterceptorEG class");
		System.out.println("********************************************");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("********************************************");
		System.out.println("From afterCompletion method of InterceptorEG class");
		System.out.println("********************************************");

	}

}
