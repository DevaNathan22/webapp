package com.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebappController {
	@GetMapping(path="deva")
	public String givemsg() {
		return "Hi Deva";
	}

}
