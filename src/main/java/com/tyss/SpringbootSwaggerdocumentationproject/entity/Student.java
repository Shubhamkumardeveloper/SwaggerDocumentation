package com.tyss.SpringbootSwaggerdocumentationproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(unique = true)
	private String email;
	@Column(unique = true)
	private long phoneNumber;
	private String password;
	private double mark;
}
