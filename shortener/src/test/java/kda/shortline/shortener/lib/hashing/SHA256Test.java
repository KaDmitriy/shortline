package kda.shortline.shortener.lib.hashing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kda.shortline.shortener.lib.сonverter.SHA256;

class SHA256Test {

	@Test
	void testGenerate() {
		SHA256 sha256 = new SHA256();
		assertEquals("A665A45920422F9D417E4867EFDC4FB8A04A1F3FFF1FA07E998E86F7F7A27AE3", sha256.generate("123"));
	}

}
