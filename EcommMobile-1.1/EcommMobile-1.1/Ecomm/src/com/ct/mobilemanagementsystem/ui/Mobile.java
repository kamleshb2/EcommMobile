package com.ct.mobilemanagementsystem.ui;
import java.util.ArrayList;
import java.util.HashSet;
import com.ct.mobilemanagementsystem.service.*;

public class Mobile {
	
	private int mobId;
	private String brandName;
	private String description;
	private float price;
	static IMobileService intObj = new MobileServiceImpl();
	
	public Mobile(int id, String name, String des, float pric){
		mobId = id;
		brandName = name;
		description = des;
		price = pric;
		
	}
	
	public Mobile(){
		
		}
	
	
	
	public int getMobId() {
		return mobId;
	}



	public void setMobId(int mobId) {
		this.mobId = mobId;
	}



	public String getBrandName() {
		return brandName;
	}



	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}
	

	
	public ArrayList<String> addMobile(int id, String name, String des, int price) {

		Mobile newMob = new Mobile(id, name, des, price);
		ArrayList<String> l = intObj.addMobile(newMob);
		return l; // to print status messages

	}
	
	public Mobile searchMobile(int id) throws NullPointerException {
		Mobile m = intObj.searchMobileById(id);
		return m;

	}
	
	public HashSet<Mobile> displayMobile() {
		HashSet<Mobile> l= intObj.displayAllMobiles();
		return l;
	}
	
	public boolean deleteMobile(int mId) {
		boolean result = intObj.deleteMobile(mId);
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandName == null) ? 0 : brandName.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + mobId;
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (mobId != other.mobId)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}

}
