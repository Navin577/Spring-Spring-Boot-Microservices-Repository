package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data

@AllArgsConstructor
@RequiredArgsConstructor
public class IrctcDetails {
	
	private Integer iId;
	
	private String iName;
	
	private String iAddrs;
	
	private Double iWallet;
}
