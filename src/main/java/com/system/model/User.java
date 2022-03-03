package com.system.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "iqid")
  private int userId;
  @Column(name="identifier")
  private String identifier;
  @Column(name="password")
  private String password;
  @Column(name="first_name")
  private String firstName;
  @Column(name="last_name")
  private String lastName;
  @Column(name="user_type")
  private String userType;
  @Column(name="start_date")
  private LocalDate startDate;
  @Column(name="email")
  private String email;
  @Column(name="status")
  private String status;
  @Column(name="pin")
  private String pin;
  
  @JsonIgnore
  @OneToMany(cascade= CascadeType.PERSIST )
  private List<Complaint> raisedComplaints;
  
  @JsonIgnore
  @OneToMany(cascade= CascadeType.PERSIST)
  private List<Complaint> assignedComplaints;
    
  public int getUserId() {
    return userId;
  }
  public void setUserId(int userId) {
    this.userId = userId;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getUserType() {
    return userType;
  }
  public void setUserType(String userType) {
    this.userType = userType;
  }
  public LocalDate getStartDate() {
    return startDate;
  }
  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }
   public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public List<Complaint> getRaisedComplaints() {
		return raisedComplaints;
	}
	public void setRaisedComplaints(List<Complaint> raisedComplaints) {
		this.raisedComplaints = raisedComplaints;
	}
	public List<Complaint> getAssignedComplaints() {
		return assignedComplaints;
	}
	public void setAssignedComplaints(List<Complaint> assignedComplaints) {
		this.assignedComplaints = assignedComplaints;
	}
@Override
  public String toString() {
    return "UserId= " + getUserId() + " First Name= " + 
        getFirstName() + " Last Name= " + getLastName() + 
        " Type= "+ getUserType() + 
        " StartDate= " + getStartDate();
  }
}