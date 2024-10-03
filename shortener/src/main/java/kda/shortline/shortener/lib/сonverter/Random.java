package kda.shortline.shortener.lib.сonverter;

import org.springframework.stereotype.Component;

@Component
public class Random  implements Converter {

	@Override
	public String encode(Long number) {
		return (int)(Math.random()*1000) + "_" + number ;
	}

	@Override
	public Long decode(String code) {
		return Long.parseLong( code.split("_")[1] );
	}

}
