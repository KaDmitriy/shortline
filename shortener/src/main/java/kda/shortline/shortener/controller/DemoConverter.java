package kda.shortline.shortener.controller;

import java.util.HashMap;
import java.util.Map;

import kda.shortline.shortener.lib.сonverter.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConverter {

	@Autowired
	Map<String, Converter> listConverter;
	
	@GetMapping("/democonverter")
	public Map<String, String> demo() {
		var data = new HashMap<String, String>();
//		data.put("key", Integer.toString(listConverter.size()) );
		for (var entry : listConverter.entrySet()) {
			String res = "123";
			data.put(entry.getKey(), res+"-"+entry.getValue().encode(123L));
		}

		return data;
	}
	
}
