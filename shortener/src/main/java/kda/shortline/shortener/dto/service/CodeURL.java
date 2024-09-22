package kda.shortline.shortener.dto.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CodeURL {

	@Value("${nameDomain}")
	String nameDomain;
	
	/**
	 * Generation unique string lenght 8 char
	 * String conteints leter a-z, A_Z, 0-9 
	 * @param url
	 * @return String
	 */
	public String coding(String url) {
		return Integer.toString( (int) (Math.random()*1000) );
	}
	
	/**
	 * Create short url
	 * @param url
	 * @return
	 */
	public String createUrl(String url) {
		return "http://"+nameDomain+"/"+coding(url);
	}
	
}
