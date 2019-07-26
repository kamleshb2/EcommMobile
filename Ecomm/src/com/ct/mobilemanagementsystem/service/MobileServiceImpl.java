package com.ct.mobilemanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import com.ct.mobilemanagementsystem.dao.IMobileDAO;
import com.ct.mobilemanagementsystem.dao.MobileDAOImpl;
import com.ct.mobilemanagementsystem.ui.Mobile;

public class MobileServiceImpl implements IMobileService{

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
		boolean idCheck = true;
		boolean nameCheck = false;
		int mobId = m.getMobId();
		String bName = m.getBrandName();
		String id = "" + mobId;
		if(id.length() <7 && id.length() > 9 ) {
			idCheck = true;
		}
		if(stringList.contains(bName)) {
			nameCheck = true;
		}
		
		if(idCheck && nameCheck) {
			IMobileDAO iObj = null;
			iObj = new MobileDAOImpl();
			iObj.addMobile(m);
		}
		else {
			System.out.println("Either ID or Brand Name is invalid");
		}
		
		
	}

	@Override
	public void deleteMobile(int mId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMobileDetails(int mId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchMobileById(int mId) {
		// TODO Auto-generated method stub
		
	}
	
}
