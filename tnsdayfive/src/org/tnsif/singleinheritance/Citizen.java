package org.tnsif.singleinheritance;

public class Citizen {
	private String city;
	private int pincode;
	private String Area;
	private long aadharNo;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", Area=" + Area + ", aadharNo=" + aadharNo
				+ ", getCity()=" + getCity() + ", getPincode()=" + getPincode() + ", getArea()=" + getArea()
				+ ", getAadharNo()=" + getAadharNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Citizen(String city, int pincode, String area, long aadharNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		Area = area;
		this.aadharNo = aadharNo;
	}
	
	
}
