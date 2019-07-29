package com.ct.mobilemanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import com.ct.mobilemanagementsystem.dao.IMobileDAO;
import com.ct.mobilemanagementsystem.dao.MobileDAOImpl;
import com.ct.mobilemanagementsystem.ui.Mobile;

public class MobileServiceImpl implements IMobileService {
	static IMobileDAO iObj = new MobileDAOImpl(); // new MobileDAOImpl();

	@Override
	public List addMobile(Mobile m) {
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
		
		//list to store status messages
		
		List<String> messageList = new ArrayList<String>();
		boolean idCheck = false;
		boolean nameCheck = false;
		int mobId = m.getMobId();
		String bName = m.getBrandName();
		String id = "" + mobId;

		boolean retValue = iObj.containsId(mobId);

		if ((id.length() == 8)) {
			idCheck = true;
		}
		if (stringList.contains(bName)) {
			nameCheck = true;
		}

		if (idCheck && nameCheck && retValue == false) {
			iObj.addMobile(m);
			messageList.add("Mobile is successfully added in database");
		} 
		else {
			if (idCheck == false) {
//				System.out.println("ID is invalid");
				messageList.add("ID is invalid");
			}
			if (nameCheck == false) {
//				System.out.println("Brand Name is invalid");
				messageList.add("Brand Name is invalid");
			}
			if (retValue) {
//				System.out.println("Given ID already exists!!");
				messageList.add("Given ID already exists");
			}
		}
		return messageList;
		

	}

	@Override
	public void deleteMobile(int mId) {
		// TODO Auto-generated method stub
		try {
			boolean result = iObj.deleteMobile(mId);
			if (result) {
				System.out.println("Mobile successfully removed from the database");
			} else {
				System.out.println("Given mobile ID doesn't exist!!!");
			}
		} catch (NullPointerException e) {
			System.out.println("Given ID doesn't exists!!!");
		}

	}

	@Override
	public void displayAllMobiles() {
		// TODO Auto-generated method stub
		iObj.displayAllMobiles();

	}

	@Override
	public Mobile searchMobileById(int mId) {
		// TODO Auto-generated method stub

			Mobile m = null;
			try {
			iObj.searchMobileById(mId);
			}catch(NullPointerException e) {
			}
			return m;

	}

}
