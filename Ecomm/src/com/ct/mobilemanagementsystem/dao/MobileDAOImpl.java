package com.ct.mobilemanagementsystem.dao;

import java.util.ArrayList;

import com.ct.mobilemanagementsystem.ui.Mobile;

public class MobileDAOImpl implements IMobileDAO {
	
	ArrayList<Mobile> objectList = new ArrayList<Mobile>();

	@Override
	public void addMobile(Mobile m) {
		// TODO Auto-generated method stub
		objectList.add(m);
		System.out.println(m.getBrandName() + " " + m.getMobId());
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
