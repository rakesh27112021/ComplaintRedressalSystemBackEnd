package com.system.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="complaint")
public class Complaint {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iqid")
	private int complaintId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "pin")
	private String pin;
	
	@Column(name = "mobile")
	private String mobile;
	
	@Column(name = "complaint_type")
	private String complaintType;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "feedback")
	private String feedback;
	
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="assigned_to")
	private User assignedTo;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="raised_by")
	private User raisedBy;
	
	public int getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(int complaintId) {
		this.complaintId = complaintId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public User getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(User assignedTo) {
		this.assignedTo = assignedTo;
	}

	public User getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(User raisedBy) {
		this.raisedBy = raisedBy;
	}

	@Override
	public String toString() {
		return "Complaint [complaintId=" + complaintId + ", title=" + title + ", address=" + address + ", pin=" + pin
				+ ", mobile=" + mobile + ", complaintType=" + complaintType + ", status=" + status + ", feedback="
				+ feedback + ", assignedTo=" + assignedTo + ", raisedBy=" + raisedBy + "]";
	}
	
	
	
	
}
