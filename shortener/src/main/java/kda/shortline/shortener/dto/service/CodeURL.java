package kda.shortline.shortener.dto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import kda.shortline.shortener.lib.сonverter.Converter;

/**
 * Performing encoding procedure and creating a URL
 * Сhoice of coding algorithm
 * 
 * @author KDA
 */

@Component
public class CodeURL {

	@Value("${nameDomain}")
	String nameDomain;
	
	@Autowired
	private Converter SHA256;
	
	/**
	 * Generation unique string lenght 8 char
	 * String conteints leter a-z, A_Z, 0-9
	 * @param url
	 * @return String
	 */
	public String coding(String url) {
		//return Integer.toString( (int) (Math.random()*1000) );
		return SHA256.encode(1L);
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
