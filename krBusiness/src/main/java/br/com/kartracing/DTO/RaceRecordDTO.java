package br.com.kartracing.DTO;

import java.io.Serializable;
import java.time.LocalTime;

public class RaceRecordDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private LocalTime hour;
	private Long pilotId;
	private String pilotName;
	private Integer laps;
	private LocalTime lapTime;
	private Double averageLapSpeed;

	public RaceRecordDTO(LocalTime hour, Long pilotId, String pilotName, Integer laps, LocalTime lapTime,
			Double averageLapSpeed) {
		super();
		this.hour = hour;
		this.pilotId = pilotId;
		this.pilotName = pilotName;
		this.laps = laps;
		this.lapTime = lapTime;
		this.averageLapSpeed = averageLapSpeed;
	}
	
	public RaceRecordDTO() {}
	/**
	 * @return the hour
	 */
	public LocalTime getHour() {
		return hour;
	}
	/**
	 * @param hour the hour to set
	 */
	public void setHour(LocalTime hour) {
		this.hour = hour;
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
	 * @return the laps
	 */
	public Integer getLaps() {
		return laps;
	}
	/**
	 * @param laps the laps to set
	 */
	public void setLaps(Integer laps) {
		this.laps = laps;
	}
	/**
	 * @return the lapTime
	 */
	public LocalTime getLapTime() {
		return lapTime;
	}
	/**
	 * @param lapTime the lapTime to set
	 */
	public void setLapTime(LocalTime lapTime) {
		this.lapTime = lapTime;
	}
	/**
	 * @return the averageLapSpeed
	 */
	public Double getAverageLapSpeed() {
		return averageLapSpeed;
	}
	/**
	 * @param averageLapSpeed the averageLapSpeed to set
	 */
	public void setAverageLapSpeed(Double averageLapSpeed) {
		this.averageLapSpeed = averageLapSpeed;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RaceRecord [hour=" + hour + ", pilotId=" + pilotId + ", pilotName=" + pilotName + ", laps=" + laps
				+ ", lapTime=" + lapTime + ", averageLapSpeed=" + averageLapSpeed + "]";
	}
	
	

}
