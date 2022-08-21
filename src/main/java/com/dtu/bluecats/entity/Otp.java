package com.dtu.bluecats.entity;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RedisHash(timeToLive = 300)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Otp implements Serializable{
	private String id;
	private int value;
}
