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

import br.com.kartracing.DTO.RaceRecordDTO;
import br.com.kartracing.DTO.RaceResultDTO;
import br.com.kartracing.service.RaceResultService;
import br.com.kartracing.service.interfaces.IReadLogFile;

@RunWith(MockitoJUnitRunner.class)
public class RaceResultServiceTest {

	@InjectMocks
	private RaceResultService service;

	@Mock
	private IReadLogFile log;

	@Before
	public void init() {}

	@Test
	public void getRaceResult() {
		String path = "C:\tt.log";

		List<RaceResultDTO> expectedResponse = service.getRaceResult(path);
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

}
