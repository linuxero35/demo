package com.example.demo.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -81303303207028540L;

	private Long userId;
	private String username;
	private int universityNumber;
	private int regionId;
	private Boolean active;
	private String modifDate;
	private Long modifuserId;
	
	public Long getModifuserId() {
		return modifuserId;
	}

	public void setModifuserId(Long modifuserId) {
		this.modifuserId = modifuserId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUniversityNumber() {
		return universityNumber;
	}

	public void setUniversityNumber(int universityNumber) {
		this.universityNumber = universityNumber;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getModifDate() {
		return modifDate;
	}

	public void setModifDate(String modifDate) {
		this.modifDate = modifDate;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
