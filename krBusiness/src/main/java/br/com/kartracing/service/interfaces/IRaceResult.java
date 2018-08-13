package br.com.kartracing.service.interfaces;

import java.util.List;

import br.com.kartracing.DTO.RaceResultDTO;

@FunctionalInterface
public interface IRaceResult {
	
	List<RaceResultDTO> getRaceResult(String path);

}
