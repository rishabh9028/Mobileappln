package com.cg.mobile.service;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplnException;

public interface IMobileService {
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplnException;
	public boolean validatename(String name);
	public boolean validateEmail(String email);
	public boolean validatePhoneNo(String phoneNo);
	
	
	
}
