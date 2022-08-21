package com.dtu.bluecats.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class User {
	@Id
	private String id;
	private String userName;
	private String password;
	private String email;
	private String mobile;
	private String gender;
	private int age;
	private String image;
}
