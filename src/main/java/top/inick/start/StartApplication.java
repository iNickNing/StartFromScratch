package top.inick.start;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;
import top.inick.start.common.filters.CustomFilter;
import top.inick.start.common.filters.CustomFilter2;
import top.inick.start.domain.Demo;

@SpringBootApplication
@ServletComponentScan
@Slf4j
public class StartApplication {

	
	public static void main(String[] args) {
		log.info("开始运行");
		SpringApplication.run(StartApplication.class, args);
		log.info("启动成功 ");
	}
	
	@Bean
	public FilterRegistrationBean filterRegistrationBean() {
		//实例化一个过滤器注册bean
		FilterRegistrationBean registration = new FilterRegistrationBean();
		//设置一个过滤器
		registration.setFilter(customFilter());
		//设置过滤器名称
		registration.setName("customFilter");
		//设置拦截路径
		registration.addUrlPatterns("/*");
		//设置顺序
		registration.setOrder(10);

		return registration;
	}
	
	@Bean
	public FilterRegistrationBean filterRegistrationBean2() {
		//实例化一个过滤器注册bean
		FilterRegistrationBean registration = new FilterRegistrationBean();
		//设置一个过滤器
		registration.setFilter(customFilter2());
		//设置过滤器名称
		registration.setName("customFilter2");
		//设置拦截路径
		registration.addUrlPatterns("/*");
		//设置顺序
		registration.setOrder(11);

		return registration;
	}
	
	@Bean //注册为工厂bean
	public Filter customFilter2() {
		return new CustomFilter2();
	}
	
	@Bean //注册为工厂bean
	public Filter customFilter() {
		return new CustomFilter();
	}
	
	
}
