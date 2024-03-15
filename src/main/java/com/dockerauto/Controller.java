package com.dockerauto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value="getName")
	public String getName() {
		return "VALVAE MAAYAM";
	}
	
	
	@GetMapping(value="getPetName")
	public String getPetName() {
		return "hello mr kaipulla ";
	}
	
	

}
