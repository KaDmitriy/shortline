package kda.shortline.shortener.dto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kda.shortline.shortener.dto.LongLinkDTO;
import kda.shortline.shortener.dto.ShortLinkDTO;

@Component
public class GenerateURL {

	@Autowired
	private ShortLinkDTO shortLinkDTO;
	
	@Autowired
	private CodeURL codeUrl;
	
	public ShortLinkDTO generator(LongLinkDTO longLinkDTO) {
		shortLinkDTO.setLink(codeUrl.createUrl(longLinkDTO.getLink()));
		return shortLinkDTO;
	}

}
