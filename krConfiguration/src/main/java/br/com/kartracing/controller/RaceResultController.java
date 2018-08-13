package br.com.kartracing.controller;

import java.util.List;
import java.util.Objects;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kartracing.DTO.RaceResultDTO;
import br.com.kartracing.service.interfaces.IRaceResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping(value = "/race", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "Race Result", tags = { "RACE RESULT" })
public class RaceResultController {
	
	private static final Logger logger = Logger.getLogger(RaceResultController.class);

	@Autowired
	private IRaceResult service;
	
	@ApiOperation(value = "Get race result", response = RaceResultDTO.class)
	@PostMapping("/result")
	public ResponseEntity<List<RaceResultDTO>> getRaceResult(@RequestBody String path) {
		logger.info("Method getRaceResult - init");
		List<RaceResultDTO> listResult = service.getRaceResult(path);
		logger.info("Method getRaceResult - finished");
		return new ResponseEntity<List<RaceResultDTO>>(listResult, Objects.isNull(listResult) ? HttpStatus.NOT_FOUND : HttpStatus.OK);
	}

}
