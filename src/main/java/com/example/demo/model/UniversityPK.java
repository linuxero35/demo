package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UniversityPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8196741709435721049L;

	private int universityNumber;
	private int regionId;

	public UniversityPK(int universityNumber, int regionId) {
		this.universityNumber = universityNumber;
		this.regionId = regionId;
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

}
