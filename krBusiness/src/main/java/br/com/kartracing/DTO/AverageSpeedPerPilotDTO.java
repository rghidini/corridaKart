package br.com.kartracing.DTO;

import java.io.Serializable;

public class AverageSpeedPerPilotDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String pilotName;
	private Double averageSpeed;
	
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
	 * @return the averageSpeed
	 */
	public Double getAverageSpeed() {
		return averageSpeed;
	}
	/**
	 * @param averageSpeed the averageSpeed to set
	 */
	public void setAverageSpeed(Double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}
	
	

}
