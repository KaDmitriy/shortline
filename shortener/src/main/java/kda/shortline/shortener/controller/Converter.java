package kda.shortline.shortener.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kda.shortline.shortener.dto.LongLink;
import kda.shortline.shortener.dto.ShortLink;

/**
 * Converting long links to short links
 */

@RestController()
public class Converter {
	
	private final Logger log = LoggerFactory.getLogger(Converter.class);
	
	String nameDomain = "mydomain"; 

	@PostMapping("/converter/reduce")
	public ShortLink reduce (@RequestBody LongLink longLink) {
		String link = nameDomain+longLink.getLink();
		log.info("link:{}", link);
		return new ShortLink(link);
	}
	
}
