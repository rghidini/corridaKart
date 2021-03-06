package br.com.kartracing.DTO;

import java.io.Serializable;
import java.time.LocalTime;

public class TimeAfterWinnerDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String pilotName;
	private LocalTime timeAfterWiner;
	
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
	 * @return the timeAfterWiner
	 */
	public LocalTime getTimeAfterWiner() {
		return timeAfterWiner;
	}
	/**
	 * @param timeAfterWiner the timeAfterWiner to set
	 */
	public void setTimeAfterWiner(LocalTime timeAfterWiner) {
		this.timeAfterWiner = timeAfterWiner;
	}

}
