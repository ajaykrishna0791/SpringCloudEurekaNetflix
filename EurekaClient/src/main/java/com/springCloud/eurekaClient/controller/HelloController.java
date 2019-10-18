package com.springCloud.eurekaClient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface HelloController {
	
	@RequestMapping("/greeting")
    String greeting();

}
