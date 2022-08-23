package com.dtu.bluecats.service;

import java.util.List;

import com.dtu.bluecats.entity.Otp;
import com.dtu.bluecats.entity.OtpDto;

public interface OtpService {
	Boolean createOtp(OtpDto mobile);
	Boolean verifyOtp(Otp otp);
	List <Otp> findAll();
}
