package br.com.kartracing.DTO;

import java.io.Serializable;
import java.time.LocalTime;

public class RaceResultDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer finalPosition;
	private Long pilotId;
	private String pilotName;
	private Integer lapsCompleted;
	private LocalTime totalRaceTime;

	
	public RaceResultDTO(Integer finalPosition, Long pilotId, String pilotName, Integer lapsCompleted,
			LocalTime totalRaceTime) {
		super();
		this.finalPosition = finalPosition;
		this.pilotId = pilotId;
		this.pilotName = pilotName;
		this.lapsCompleted = lapsCompleted;
		this.totalRaceTime = totalRaceTime;
	}
	
	/**
	 * @return the finalPosition
	 */
	public Integer getFinalPosition() {
		return finalPosition;
	}
	/**
	 * @param finalPosition the finalPosition to set
	 */
	public void setFinalPosition(Integer finalPosition) {
		this.finalPosition = finalPosition;
	}
	/**
	 * @return the pilotId
	 */
	public Long getPilotId() {
		return pilotId;
	}
	/**
	 * @param pilotId the pilotId to set
	 */
	public void setPilotId(Long pilotId) {
		this.pilotId = pilotId;
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
	 * @return the lapsCompleted
	 */
	public Integer getLapsCompleted() {
		return lapsCompleted;
	}
	/**
	 * @param lapsCompleted the lapsCompleted to set
	 */
	public void setLapsCompleted(Integer lapsCompleted) {
		this.lapsCompleted = lapsCompleted;
	}
	/**
	 * @return the totalRaceTime
	 */
	public LocalTime getTotalRaceTime() {
		return totalRaceTime;
	}
	/**
	 * @param totalRaceTime the totalRaceTime to set
	 */
	public void setTotalRaceTime(LocalTime totalRaceTime) {
		this.totalRaceTime = totalRaceTime;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RaceResultDTO [finalPosition=" + finalPosition + ", pilotId=" + pilotId + ", pilotName=" + pilotName
				+ ", lapsCompleted=" + lapsCompleted + ", totalRaceTime=" + totalRaceTime + "]";
	}
	
	

}
