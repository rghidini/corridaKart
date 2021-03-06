package br.com.kartracing.service.interfaces;

import java.util.List;

import br.com.kartracing.DTO.RaceRecordDTO;

@FunctionalInterface
public interface IReadLogFile {
	
	List<RaceRecordDTO> readLogFile(String path);

}
