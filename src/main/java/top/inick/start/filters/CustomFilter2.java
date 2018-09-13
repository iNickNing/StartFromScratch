package top.inick.start.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.springframework.core.annotation.Order;

import lombok.extern.slf4j.Slf4j;

//注册名称为customFilter的拦截器,拦截所有的请求
//@WebFilter(filterName="customFilter2", urlPatterns= {"/*"})
@Slf4j
public class CustomFilter2 implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("filter2 初始化");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.info("doFilter2 处理请求");
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		log.info("filter2 销毁");
	}

}
