package com.cg.mobile.UI;

import java.util.Scanner;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplnException;
import com.cg.mobile.service.IMobileService;
import com.cg.mobile.service.MobileServiceImpl;

public class MobileUI {
	 static Scanner sc=new Scanner(System.in);
	 static int choice;
	  static PurchaseDetails details=null;
	  static IMobileService service=null;
public static void main(String[] args) throws MobileApplnException {
	
	
	System.out.println("Mobile Appln");
	System.out.println("*************");
	while(true)
	{
		System.out.println("1.Enter Purchase Details");
		System.out.println("2.Get Mobile Details");
		System.out.println("3.Exit");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:addPurchaseDetails();
		break;
		case 2:getMobileDetails();
		break;
		case 3:
			System.exit(0);
			break;
			}
	}
}
	
	private static void addPurchaseDetails() throws MobileApplnException {
		try{
		service=new MobileServiceImpl();
	
	System.out.println("Enter customer name");
	String cName=sc.next();
	if(service.validatename(cName))
	{
	System.out.println("Enter mailid");
	String mailId=sc.next();
	if(service.validateEmail(mailId))
	{
	System.out.println("Enter Phone no");
	String phoneNo=sc.next();
	String num=String.valueOf(phoneNo);
	if(service.validatePhoneNo(phoneNo))
	{
	System.out.println("Enter mobile id");
	int mobileId=sc.nextInt();
	details=new PurchaseDetails(cName,mailId,phoneNo,mobileId);
	
	int res=service.addPurchaseDetails(details);
	System.out.println(res+"  inserted");
	if(res==1)
	{
		System.out.println("Values added in databse");
	}
	else
	{
		System.out.println("values not added");
	}

	}}}}
	catch(MobileApplnException e)
	{
		throw new MobileApplnException("Exception occured"+e.getMessage());
	}
	

	}
private static void getMobileDetails() {
	
	
}

}
