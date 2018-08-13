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

import br.com.kartracing.DTO.AverageSpeedPerPilotDTO;
import br.com.kartracing.DTO.BestLapDTO;
import br.com.kartracing.DTO.RaceResultDTO;
import br.com.kartracing.DTO.TimeAfterWinnerDTO;
import br.com.kartracing.service.interfaces.IRaceStatistics;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin
@RequestMapping(value = "/statistic", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "Race Statistics", tags = { "RACE STATISTICS" })
public class RaceStatisticsController {
	
	private static final Logger logger = Logger.getLogger(RaceStatisticsController.class);

	@Autowired
	private IRaceStatistics service;
	
	@ApiOperation(value = "Get Best Lap Of The Race", response = RaceResultDTO.class)
	@PostMapping("/best/lap")
	public ResponseEntity<BestLapDTO> getBestLapOfTheRace(@RequestBody String path) {
		logger.info("Method getBestLapOfTheRace - init");
		BestLapDTO bestLapOfTheRace = service.getBestLapOfTheRace(path);
		logger.info("Method getBestLapOfTheRace - finished");
		return new ResponseEntity<BestLapDTO>(bestLapOfTheRace, Objects.isNull(bestLapOfTheRace) ? HttpStatus.NOT_FOUND : HttpStatus.OK);
	}
	
	@ApiOperation(value = "Get Best Lap By Rider", response = RaceResultDTO.class)
	@PostMapping("/best/lap/rider")
	public ResponseEntity<List<BestLapDTO>> getBestLapByRider(@RequestBody String path) {
		logger.info("Method getBestLapByRider - init");
		List<BestLapDTO> bestLapByRider = service.getBestLapByRider(path);
		logger.info("Method getBestLapByRider - finished");
		return new ResponseEntity<List<BestLapDTO>>(bestLapByRider, Objects.isNull(bestLapByRider) ? HttpStatus.NOT_FOUND : HttpStatus.OK);
	}
	
	@ApiOperation(value = "Get Time After Winner", response = RaceResultDTO.class)
	@PostMapping("/after/winner")
	public ResponseEntity<List<TimeAfterWinnerDTO>> getTimeAfterWinner(@RequestBody String path) {
		logger.info("Method getTimeAfterWinner - init");
		List<TimeAfterWinnerDTO> timeAfterWinner = service.getTimeAfterWinner(path);
		logger.info("Method getTimeAfterWinner - finished");
		return new ResponseEntity<List<TimeAfterWinnerDTO>>(timeAfterWinner, Objects.isNull(timeAfterWinner) ? HttpStatus.NOT_FOUND : HttpStatus.OK);
	}
	
	@ApiOperation(value = "Get Average Speed Per Pilot", response = RaceResultDTO.class)
	@PostMapping("/avg/speed")
	public ResponseEntity<List<AverageSpeedPerPilotDTO>> getAverageSpeedPerPilot(@RequestBody String path) {
		logger.info("Method getAverageSpeedPerPilot - init");
		List<AverageSpeedPerPilotDTO> averageSpeedPerPilot = service.getAverageSpeedPerPilot(path);
		logger.info("Method getAverageSpeedPerPilot - finished");
		return new ResponseEntity<List<AverageSpeedPerPilotDTO>>(averageSpeedPerPilot, Objects.isNull(averageSpeedPerPilot) ? HttpStatus.NOT_FOUND : HttpStatus.OK);
	}


}
