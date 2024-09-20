package kda.shortline.shortener.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class LongLink {

	private String link;
	
}
