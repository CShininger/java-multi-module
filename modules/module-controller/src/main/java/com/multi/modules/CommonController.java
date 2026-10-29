package com.multi.modules;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
public class CommonController {
	
	private final CommonService commonService;

	public CommonController(CommonService commonService) {
		this.commonService = commonService;
	}

	@GetMapping("/hello")
	public String hello() {
		commonService.getHello();
		return "Hello, World!";
	}
}
