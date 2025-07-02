package com.nt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("BillingMs")
public interface IFetchBillingMs {
	@GetMapping("billing-api/bill")
	public String fetchBillings();
}
