package com.cg.mobile.DTO;

import java.time.LocalDate;

public class PurchaseDetails {
		private int purchaseid;
		private String cName;
		private String mailId;
		private String phoneNo;
		private LocalDate purchaseDate;
		private int mobileId;
		
		public PurchaseDetails()
		{
			
		}
		
		
		public PurchaseDetails(String cName, String mailId, String phoneNo, int mobileId) {
			super();
			this.cName = cName;
			this.mailId = mailId;
			this.phoneNo = phoneNo;
			this.mobileId = mobileId;
		}


		public int getPurchaseid() {
			return purchaseid;
		}
		public void setPurchaseid(int purchaseid) {
			this.purchaseid = purchaseid;
		}
		public String getcName() {
			return cName;
		}
		public void setcName(String cName) {
			this.cName = cName;
		}
		public String getMailId() {
			return mailId;
		}
		public void setMailId(String mailId) {
			this.mailId = mailId;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public LocalDate getPurchaseDate() {
			return purchaseDate;
		}
		public void setPurchaseDate(LocalDate purchaseDate) {
			this.purchaseDate = purchaseDate;
		}
		public int getMobileId() {
			return mobileId;
		}
		public void setMobileId(int mobileId) {
			this.mobileId = mobileId;
		}

		@Override
		public String toString() {
			return "PurchaseDetails [purchaseid=" + purchaseid + ", cName=" + cName + ", mailId=" + mailId
					+ ", phoneNo=" + phoneNo + ", purchaseDate=" + purchaseDate + ", mobileId=" + mobileId + "]";
		}

	
		
		
		
		
}
