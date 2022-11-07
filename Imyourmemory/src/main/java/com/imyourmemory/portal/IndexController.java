package com.imyourmemory.portal;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
	
	private final Logger log = LoggerFactory.getLogger(getClass());
	
	//@GetMapping("index")
	@RequestMapping("index")
	public String index(Model model) {
		
		log.info("index Controller");
		
		//ViewResolver : "/WEB-INF/views/" + 경로 + ".jsp"
		//최종경로: /WEB-INF/views/home.jsp
		
		
		return "awards";
	}
	
	@ResponseBody
	@RequestMapping("hello")
	public String hello() {
		
		log.info("index Controller");
		return "hello";
	}
	
	

}
