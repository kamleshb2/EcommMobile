package com.ct.mobilemanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import com.ct.mobilemanagementsystem.dao.IMobileDAO;
import com.ct.mobilemanagementsystem.dao.MobileDAOImpl;
import com.ct.mobilemanagementsystem.ui.Mobile;

public class MobileServiceImpl implements IMobileService{
	static IMobileDAO iObj =  new MobileDAOImpl();  //new MobileDAOImpl();

	@Override
	public void addMobile(Mobile m) {
		// TODO Auto-generated method stub
		List stringList = new ArrayList();
		stringList.add("Nokia");
		stringList.add("Samsung");
		stringList.add("Oppo");
		stringList.add("Vivo");
		stringList.add("HTC");
		stringList.add("Honor");
		stringList.add("Apple");
		stringList.add("Huawei");
		stringList.add("LG");
		boolean idCheck = false;
		boolean nameCheck = false;
		int mobId = m.getMobId();
		String bName = m.getBrandName();
		String id = "" + mobId;
		
		boolean retValue = iObj.containsId(mobId);
		
		if((id.length()==8) ) {
			idCheck = true;
		}
		if(stringList.contains(bName)) {
			nameCheck = true;
		}
		
		if(idCheck && nameCheck && retValue == false) {
			iObj.addMobile(m);
		}
		else {
			if(idCheck == false) {
			System.out.println("ID is invalid");
		}
			if(nameCheck == false) {
				System.out.println("Brand Name is invalid");
			}
			if(retValue) {
				System.out.println("Given ID already exists!!");
			}
		}
		
		
	}

	@Override
	public void deleteMobile(int mId) {
		// TODO Auto-generated method stub
		try {
		boolean result = iObj.deleteMobile(mId);
		if(result) {
			System.out.println("Mobile successfully removed from the database");
		}
		else {
			System.out.println("Given mobile ID doesn't exist!!!");
		}
		}
		catch(NullPointerException e) {
			System.out.println("Given ID doesn't exists!!!");
		}
		
	}

	@Override
	public void displayAllMobiles() {
		// TODO Auto-generated method stub
		iObj.displayAllMobiles();
		
	}

	@Override
	public void searchMobileById(int mId) {
		// TODO Auto-generated method stub
		
		try {
		Mobile m = iObj.searchMobileById(mId);
		System.out.println("" + m.getMobId() + " " + m.getBrandName() + " " + m.getDescription() + " " + m.getPrice());
		}
		catch(Exception e) {
			System.out.println("Given ID doesn't exists!!!");
		}
		
	}
	
}
