package top.inick.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import lombok.extern.slf4j.Slf4j;
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
}
