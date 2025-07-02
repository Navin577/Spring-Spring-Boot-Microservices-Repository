package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Whatsapp {
	
	private Integer userId;
	private String  userName;
	private Long phoneNumber;
	private String Location;

}
