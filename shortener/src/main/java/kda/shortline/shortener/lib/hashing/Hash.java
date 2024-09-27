package kda.shortline.shortener.lib.hashing;

import org.springframework.stereotype.Component;

/**
 * Create hash string
 */
@Component
public interface Hash {
	
	/**
	 * Generation hash 
	 * @param String input
	 * @return 
	 */
	public String generate(String input);
	
}
