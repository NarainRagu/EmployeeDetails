package org.company;

public class CompanyInfo {
	private void companyName() {
	 System.out.println("Company name is Grt");

	}
	private void companyId() {
	System.out.println("Company Id is 567");

	}
	private void companyAddress() {
	System.out.println("Company Address is hijk");

	}
	public static void main(String[] args) {
		CompanyInfo company = new  CompanyInfo();
		company.companyName();
		company.companyId();
		company.companyAddress();
		
	
	}
}
