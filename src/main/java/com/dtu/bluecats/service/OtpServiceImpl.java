package com.dtu.bluecats.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dtu.bluecats.entity.Otp;
import com.dtu.bluecats.entity.OtpDto;
import com.dtu.bluecats.repository.OtpRepository;

@Service
public class OtpServiceImpl implements OtpService {
	@Autowired
	private OtpRepository repository;
	
	public Boolean createOtp(OtpDto otpDto) {
		String mobile = otpDto.getMobile();
		System.out.println(mobile);
		int max = 9999, min = 1000;
		max++;
		int otp = (int)(Math.random()*(max-min+1)+min);
		System.out.println(otp);
		Otp finalOtp = new Otp();
		finalOtp.setId(mobile);
		finalOtp.setValue(otp);
		Otp getOtp = repository.save(finalOtp);
		System.out.println(getOtp);
		if(getOtp == null)
			return false;
		return getOtp.getValue() == otp;
	}

	@Override
	public Boolean verifyOtp(Otp otp) {
		System.out.println(otp);
		Optional<Otp> getOtp = repository.findById(otp.getId());
		System.out.println(getOtp);
		if(!getOtp.isPresent())
			return false;
		System.out.println(getOtp.get());
		return getOtp.get().getValue() == otp.getValue();
	}
	
	@Override
	public List <Otp> findAll() {
		List <Otp> otps = new ArrayList<>();
		repository.findAll().forEach(otps::add);
		return otps;
	}
}
