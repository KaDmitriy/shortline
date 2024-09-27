package kda.shortline.shortener.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kda.shortline.shortener.dto.LongLinkDTO;
import kda.shortline.shortener.dto.ShortLinkDTO;
import kda.shortline.shortener.dto.service.GenerateURL;

/**
 * Converting long links to short links
 */

@RestController()
@RequestMapping("/converter")
public class Converter {

	private final Logger log = LoggerFactory.getLogger(Converter.class);

	@Autowired
	private GenerateURL generateURL;

	@PostMapping("/reduce")
	public ShortLinkDTO reduce(@RequestBody LongLinkDTO longLink) {
		log.info("link:reduce");
		return generateURL.generator(longLink);
	}
}
