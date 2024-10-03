package kda.shortline.shortener.lib.сonverter;

import org.springframework.stereotype.Component;

/**
 * The converter creates data 
 * encoding based on the input data
 * decoding based on the generated code   
 */
@Component
public interface Converter {
	
	/**
	 * Generation hash 
	 * @param number input
	 * @return 
	 */
	public String encode(Long number);
	
	public Long decode(String code);
	
}
