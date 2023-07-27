package org.tnsif.hierarchicalinheritance;

public class Tiramisu extends Android {
	
	private int version;
	

	
	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	//parameterized constructor
	public Tiramisu(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version = version;
	}


	//to string method
	
	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}
