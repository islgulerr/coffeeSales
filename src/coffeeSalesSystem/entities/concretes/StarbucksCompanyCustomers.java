package coffeeSalesSystem.entities.concretes;

import coffeeSalesSystem.entities.abstracts.Customer;

public class StarbucksCompanyCustomers extends Customer {
	private String tcNo;
	private int totalStar;

	public StarbucksCompanyCustomers(String tcNo, String name, String surname, String birthDate) {
		super(name, surname, birthDate);
		this.tcNo = tcNo;
		this.totalStar = 0;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public int getTotalStar() {
		return totalStar;
	}

	public void setTotalStar(int totalStar) {
		this.totalStar = totalStar;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTC: " + tcNo + "\nYildiz Sayisi: " + totalStar;
	}

}
