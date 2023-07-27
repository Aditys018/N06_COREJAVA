package org.tnsif.hierarchicalinheritance;

public class Android {
	private String Brand;
	private String SlotType;
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getSlotType() {
		return SlotType;
	}
	public void setSlotType(String slotType) {
		SlotType = slotType;
	}
	@Override
	public String toString() {
		return "Android [Brand=" + Brand + ", SlotType=" + SlotType + ", toString()=" + super.toString() + "]";
	}
	public Android(String brand, String slotType) {
		super();
		Brand = brand;
		SlotType = slotType;
	}
	public Android() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
