package edu.eci.apirest.controller.dto;

import java.util.Date;

public class DataDto {
	
	private long trafficlight;
	private String lights_status;
	private long duration_ligths;
	private long traffic_volume;
	private int lane_occupancy;
	private long speed;
	private Date time_lights;
	
	public DataDto(long trafficlight, String lights_status, long duration_ligths, long traffic_volume, int lane_occupancy, long speed, Date time_lights) {
		this.trafficlight = trafficlight;
		this.lights_status = lights_status;
		this.duration_ligths = duration_ligths;
		this.traffic_volume = traffic_volume;
		this.lane_occupancy = lane_occupancy;
		this.speed = speed;
		this.time_lights = time_lights;
	}

	public long getTrafficlight() {
		return trafficlight;
	}

	public void setTrafficlight(long trafficlight) {
		this.trafficlight = trafficlight;
	}

	public String getLights_status() {
		return lights_status;
	}

	public void setLights_status(String lights_status) {
		this.lights_status = lights_status;
	}

	public long getDuration_ligths() {
		return duration_ligths;
	}

	public void setDuration_ligths(long duration_ligths) {
		this.duration_ligths = duration_ligths;
	}

	public long getTraffic_volume() {
		return traffic_volume;
	}

	public void setTraffic_volume(long traffic_volume) {
		this.traffic_volume = traffic_volume;
	}

	public int getLane_occupancy() {
		return lane_occupancy;
	}

	public void setLane_occupancy(int lane_occupancy) {
		this.lane_occupancy = lane_occupancy;
	}

	public long getSpeed() {
		return speed;
	}

	public void setSpeed(long speed) {
		this.speed = speed;
	}

	public Date getTime_lights() {
		return time_lights;
	}

	public void setTime_lights(Date time_lights) {
		this.time_lights = time_lights;
	}
	    
}
