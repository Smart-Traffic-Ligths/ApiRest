package edu.eci.apirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.eci.apirest.controller.dto.DataDto;
import edu.eci.apirest.service.DataService;

@RestController
@RequestMapping( "/v1" )
public class DataController {
	
	private final DataService dataService;

    public DataController( @Autowired DataService dataService ) {
        this.dataService = dataService;
    }

	@PostMapping("/analysis")
    public void analyzeData(@RequestBody DataDto dataDto) {
        dataService.analyzeData(dataDto);
    }
	
	@PostMapping("/logs")
    public void dataLog(@RequestBody DataDto dataDto) {
        dataService.dataLog(dataDto);
    }
}
