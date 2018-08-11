package br.com.kartracing.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.stream.Stream;

import org.apache.commons.lang3.math.NumberUtils;

import br.com.kartracing.DTO.RaceRecordDTO;
import br.com.kartracing.service.interfaces.IReadLogFile;

public class ReadLogFileService implements IReadLogFile{
	
	private static final String PATH = "C:\\tt.log";
	private static final Integer FIRST = NumberUtils.INTEGER_ONE;

	public void readLogFile() {

		Path path = Paths.get(PATH);

		try {
			
			Stream<RaceRecordDTO> map = Files.lines(path)
			.skip(FIRST)
			.map(line -> line.replaceAll("–", ""))
			.map(line -> line.split("\\s+"))
			.map(value -> new RaceRecordDTO(LocalTime.parse(value[0]), Long.parseLong(value[1]), 
					value[2], Integer.parseInt(value[3]), 
					LocalTime.parse(Integer.parseInt(value[4].substring(0, 1)) < 10 ? "00:0"+value[4] : "00:"+value[4]),
					Double.parseDouble(value[5].replaceAll(",", "."))))
			.sorted((a,b) -> Integer.compare(a.getLapTime().getNano(), b.getLapTime().getNano()))
			.sorted((a,b) -> Integer.compare(a.getLapTime().getSecond(), b.getLapTime().getSecond()))
			.sorted((a,b) -> Integer.compare(a.getLapTime().getMinute(), b.getLapTime().getMinute()))
			.sorted((a,b) -> Integer.compare(a.getLaps(), b.getLaps()));
			
			map
			.forEach(System.out::println);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
