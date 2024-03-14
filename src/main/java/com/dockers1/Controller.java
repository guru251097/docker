package com.dockers1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/dockersController")
public class Controller {
	
	@GetMapping(value="/getDockerName")
	public String getDockerName() {
		return "this is docker 1 project";
	}

}
