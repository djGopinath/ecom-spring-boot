package com.example.ecom.ecom.entity;

import com.example.ecom.ecom.enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Entity

@Data  // for implement getter and setter 


public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment ID when creating user 
	private Long id;
	
	private String email;
	private String password;
	private String username;
	private UserRole role;
	
	@Lob // to add a larger object in database
	@Column(columnDefinition = "longblob") // to change the column definition
	private byte[] img;
	

	

}
