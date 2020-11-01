package com.editique.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class ProfilesFilter implements Filter {
  

   @Override
   public void doFilter
      (ServletRequest request, ServletResponse response, FilterChain filterchain) 
      throws IOException, ServletException {
	   
	   HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		System.out.println("==>Request URI is: " + req.getRequestURI());
		if (true) {
			((HttpServletResponse) response).sendError(HttpStatus.FORBIDDEN.value(), "Forbidden – You don’t have permission to access this resource");
	        return;
	    }
	 
		filterchain.doFilter(request, response);
   }
   
   
   @Bean
	public FilterRegistrationBean<ProfilesFilter> filter() {
		FilterRegistrationBean<ProfilesFilter> bean = new FilterRegistrationBean<>();

		bean.setFilter(new ProfilesFilter());
		bean.addUrlPatterns("/test/*");  
		return bean;
	}
   
   @Override
   public void init(FilterConfig filterconfig) throws ServletException {}
   
   @Override
   public void destroy() {}
   
}
