package com.example.demo.dto;

import java.io.Serializable;

public class UniversityDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6394716436594139044L;

	private int universityNumber;
	private int regionId;
	private String description;
	private Boolean active;
	private String modifDate;
	private Long modifuserId;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Long getModifuserId() {
		return modifuserId;
	}

	public void setModifuserId(Long modifuserId) {
		this.modifuserId = modifuserId;
	}

}
