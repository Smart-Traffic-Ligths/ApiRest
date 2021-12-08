package edu.eci.apirest.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import edu.eci.apirest.controller.dto.DataDto;

@Service
public class DataService {
	
	private RestTemplate restTemplate;
	
	@Autowired
	public DataService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public void analyzeData(DataDto dataDto) {
		System.out.println("Analizando datos...");
	}

	public void dataLog(DataDto dataDto) {
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <DataDto> entity = new HttpEntity<DataDto>(dataDto,headers);
	    restTemplate.exchange("http://localhost:8082/v1/logs", HttpMethod.POST, entity, Void.class);
	}
}
