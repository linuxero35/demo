package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "University")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UniversityPK universityId;
	@Column(unique = true)
	private String description;

	@Column(nullable = false)
	private Boolean active;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date createDate;
	@Column(nullable = false)
	private Long createUserId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date modifDate;
	private Long modifUserDate;

	@OneToMany(mappedBy = "university")
	private List<Student> students;

	public UniversityPK getUniversityId() {
		return universityId;
	}

	public void setUniversityId(UniversityPK universityId) {
		this.universityId = universityId;
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

	public Long getModifUserDate() {
		return modifUserDate;
	}

	public void setModifUserDate(Long modifUserDate) {
		this.modifUserDate = modifUserDate;
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
