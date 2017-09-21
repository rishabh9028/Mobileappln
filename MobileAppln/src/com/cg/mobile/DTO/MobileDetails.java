package com.cg.mobile.DTO;

public class MobileDetails {
		private int mobileId;
		private String name;
		private int price;
		private String quanitiy;
		
		//DEFAULT CONSTRUCTOR
		public MobileDetails()
		{
			
		}
		//PARAMETERISE CONSTRUCTOR
		public MobileDetails(int mobileId, String name, int price, String quanitiy) {
			super();
			this.mobileId = mobileId;
			this.name = name;
			this.price = price;
			this.quanitiy = quanitiy;
		}
		//GETTER SETTER
		public int getMobileId() {
			return mobileId;
		}
		public void setMobileId(int mobileId) {
			this.mobileId = mobileId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getQuanitiy() {
			return quanitiy;
		}
		public void setQuanitiy(String quanitiy) {
			this.quanitiy = quanitiy;
		}
		
}
