package br.com.kartracing.service.test;

import static org.junit.Assert.assertNotNull;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.com.kartracing.DTO.AverageSpeedPerPilotDTO;
import br.com.kartracing.DTO.RaceRecordDTO;
import br.com.kartracing.DTO.RaceResultDTO;
import br.com.kartracing.service.RaceStatisticsService;
import br.com.kartracing.service.interfaces.IRaceResult;
import br.com.kartracing.service.interfaces.IReadLogFile;

@RunWith(MockitoJUnitRunner.class)
public class RaceStatisticsServiceTest {

	@InjectMocks
	private RaceStatisticsService service;

	@Mock
	private IRaceResult result;

	@Mock
	private IReadLogFile log;

	@Before
	public void init() {}

	@Test
	public void getAverageSpeedPerPilot() {
		String path = "C:\tt.log";

		List<AverageSpeedPerPilotDTO> expectedResponse = service.getAverageSpeedPerPilot(path);
		Mockito.when(result.getRaceResult(path)).thenReturn(Arrays.asList(getRaceResult()));
		Mockito.when(log.readLogFile(path)).thenReturn(Arrays.asList(getRaceRecord()));
		assertNotNull(expectedResponse);

	}

	@Test
	public void getBestLapOfTheRace() {
		String path = "C:\tt.log";

		List<AverageSpeedPerPilotDTO> expectedResponse = service.getAverageSpeedPerPilot(path);
		Mockito.when(result.getRaceResult(path)).thenReturn(Arrays.asList(getRaceResult()));
		Mockito.when(log.readLogFile(path)).thenReturn(Arrays.asList(getRaceRecord()));
		assertNotNull(expectedResponse);

	}

	@Test
	public void getBestLapByRider() {
		String path = "C:\tt.log";

		List<AverageSpeedPerPilotDTO> expectedResponse = service.getAverageSpeedPerPilot(path);
		Mockito.when(result.getRaceResult(path)).thenReturn(Arrays.asList(getRaceResult()));
		Mockito.when(log.readLogFile(path)).thenReturn(Arrays.asList(getRaceRecord()));
		assertNotNull(expectedResponse);

	}

	@Test
	public void getTimeAfterWinner() {
		String path = "C:\tt.log";

		List<AverageSpeedPerPilotDTO> expectedResponse = service.getAverageSpeedPerPilot(path);
		Mockito.when(result.getRaceResult(path)).thenReturn(Arrays.asList(getRaceResult()));
		Mockito.when(log.readLogFile(path)).thenReturn(Arrays.asList(getRaceRecord()));
		assertNotNull(expectedResponse);

	}

	private RaceRecordDTO getRaceRecord() {
		RaceRecordDTO race = new RaceRecordDTO();
		race.setAverageLapSpeed(Double.valueOf(22.9));
		race.setHour(LocalTime.of(22, 30, 25, 456789));
		race.setLaps(1);
		race.setLapTime(LocalTime.of(00, 02, 31, 123456));
		race.setPilotId(NumberUtils.LONG_ONE);
		race.setPilotName("Rafael");
		return race;
	}

	private RaceResultDTO getRaceResult() {
		RaceResultDTO result = new RaceResultDTO();
		result.setFinalPosition(NumberUtils.INTEGER_ONE);
		result.setLapsCompleted(NumberUtils.INTEGER_ONE);
		result.setPilotId(NumberUtils.LONG_ONE);
		result.setPilotName("Rafael");
		result.setTotalRaceTime(LocalTime.of(22, 30, 25, 456789));
		return result;
	}


}
