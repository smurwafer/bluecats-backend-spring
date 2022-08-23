package com.dtu.bluecats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dtu.bluecats.entity.Otp;
import com.dtu.bluecats.entity.OtpDto;
import com.dtu.bluecats.service.OtpService;

@RestController
public class OtpController {
	@Autowired
	private OtpService otpService;

	@PostMapping("/auth/otp/create")
	public Boolean saveOtp(@RequestBody OtpDto mobile) {
		return otpService.createOtp(mobile);
	}

	@PostMapping("/auth/otp/verify")
	public Boolean verifyOtp(@RequestBody Otp otp) {
		return otpService.verifyOtp(otp);
	}
	
	@GetMapping
	public List <Otp> findAll() {
		return otpService.findAll();
	}
}
