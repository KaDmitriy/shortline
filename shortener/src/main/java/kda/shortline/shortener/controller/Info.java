package kda.shortline.shortener.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
public class Info {

	@GetMapping("/info/help")
	public String getHelp() {
		return "Shortline / Shortener - info : helps";
	}
	
}
