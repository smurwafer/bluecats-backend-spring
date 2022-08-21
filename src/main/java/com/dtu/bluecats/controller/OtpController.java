package com.dtu.bluecats.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dtu.bluecats.entity.Otp;
import com.dtu.bluecats.repository.OtpRepository;

@RestController
public class OtpController {
	@Autowired
	private OtpRepository repository;
	@PostMapping
	public Otp saveOtp(@RequestBody Otp otp) {
		return repository.save(otp);
	}
	@GetMapping
	public List <Otp> findAll() {
		List <Otp> otps = new ArrayList<>();
		repository.findAll().forEach(otps::add);
		return otps;
	}
}
