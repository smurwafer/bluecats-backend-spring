package com.dtu.bluecats.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dtu.bluecats.entity.Otp;

@Repository
public interface OtpRepository extends CrudRepository<Otp, String>{

}
