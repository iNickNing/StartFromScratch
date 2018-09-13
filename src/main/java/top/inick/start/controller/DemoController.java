package top.inick.start.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import top.inick.start.domain.Demo;
import top.inick.start.domain.DemoReq;

//@RestController = @Controller + @ResponseBody 默认返回的是json
@RestController
@Slf4j
public class DemoController {
	
//	@Value("${demo.name}")//好像只能在Bean里面用这个获取
//	private String name;
	
	@Autowired
	private Demo demo;

	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public Object demo() {
		log.info("处理请求啦 demo");
		return demo;
		//return "Hello SpringBoot Starter " + title;
	}
	
	@RequestMapping(value = "/testException")
	public Object testException() {
		return 1/0;
	}
	
	@RequestMapping(value = "/testValid")
	public String testValid(@Valid DemoReq req) {
		
		return req.getCode() + "," + req.getName();
	}
}
