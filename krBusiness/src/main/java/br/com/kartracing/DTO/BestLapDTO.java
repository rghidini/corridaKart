package br.com.kartracing.DTO;

import java.io.Serializable;
import java.time.LocalTime;

public class BestLapDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String pilotName;
	private LocalTime bestLap;
	
	public BestLapDTO() {}
	
	public BestLapDTO(String pilotName, LocalTime bestLap) {
		super();
		this.pilotName = pilotName;
		this.bestLap = bestLap;
	}
	/**
	 * @return the pilotName
	 */
	public String getPilotName() {
		return pilotName;
	}
	/**
	 * @param pilotName the pilotName to set
	 */
	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}
	/**
	 * @return the bestLap
	 */
	public LocalTime getBestLap() {
		return bestLap;
	}
	/**
	 * @param bestLap the bestLap to set
	 */
	public void setBestLap(LocalTime bestLap) {
		this.bestLap = bestLap;
	}
	
	

}
