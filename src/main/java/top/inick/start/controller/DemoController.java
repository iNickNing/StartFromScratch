package top.inick.start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController = @Controller + @ResponseBody 默认返回的是json
@RestController
public class DemoController {

	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String demo() {
		return "Hello SpringBoot Starter";
	}
}
