package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Student", uniqueConstraints = {
		@UniqueConstraint(name = "UniqueUsernameAndActive", columnNames = { "username", "active" }) })
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@Column(unique = true, nullable = false)
	private String username;
	@ManyToOne
	@JoinColumns({ @JoinColumn(name = "universityNumber", referencedColumnName = "universityNumber"),
			@JoinColumn(name = "regionId", referencedColumnName = "regionId") })
	private University university;

	@Column(nullable = false)
	private Boolean active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false, nullable = false)
	private Date createDate;

	@Column(updatable = false, nullable = false)
	private Long createUserId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifDate;
	private Long modifUserId;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Date getModifDate() {
		return modifDate;
	}

	public void setModifDate(Date modifDate) {
		this.modifDate = modifDate;
	}

	public Long getModifUserId() {
		return modifUserId;
	}

	public void setModifUserId(Long modifUserId) {
		this.modifUserId = modifUserId;
	}

	@PrePersist
	private void createDate() {
		this.createDate = new Date();
	}

	@PreUpdate
	private void modifDate() {
		this.modifDate = new Date();
	}

}
