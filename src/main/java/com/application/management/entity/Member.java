package com.application.management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="member")
public class Member {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "member_id")
	private Long id;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "gender")
	private Character gender;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "email_address")
	private String emailAddress;
	
	@Column(name = "home_address")
	private String homeAddress;
	
	@Column(name = "remarks")
	private String remarks;
	
}