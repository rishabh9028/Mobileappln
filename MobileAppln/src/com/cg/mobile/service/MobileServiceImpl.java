package com.cg.mobile.service;

import java.util.regex.Pattern;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.dao.MobileDaoImpl;
import com.cg.mobile.exception.MobileApplnException;
public class MobileServiceImpl implements IMobileService{
	IMobileDAO dao=null;
	@Override
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplnException {
		dao=new MobileDaoImpl();
		return dao.addPurchaseDetails(p);
		
	}

	public boolean validatename(String name)
	{
		String ptn="[A-Z]{1}[a-z]{2,19}";
		if(Pattern.matches(ptn,name))
		{
			return true;
		}
		else
		{
			
			System.out.println("Please enter valide details");
			return false;
		}
	}
		public boolean validateEmail(String email)
		{
			String emailPattern="[A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]{2,6}$";
			if(Pattern.matches(emailPattern,email))
			{
				return true;
			}
			else
			{
				
				System.out.println("Please enter valide email");
				return false;
			}
		}
		public boolean validatePhoneNo(String phone)
		{
			String phonePattern="[0-9]{10}";
			if(Pattern.matches(phonePattern,phone))
			{
				return true;
			}
			else
			{
				
				System.out.println("Please enter valide phoneNo");
				return false;
			}
		}
}
