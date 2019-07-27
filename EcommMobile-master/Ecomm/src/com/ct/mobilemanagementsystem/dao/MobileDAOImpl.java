package com.ct.mobilemanagementsystem.dao;

import java.util.ArrayList;

import com.ct.mobilemanagementsystem.ui.Mobile;

public class MobileDAOImpl implements IMobileDAO {
	
	static ArrayList<Mobile> objectList = new ArrayList<Mobile>();
	
	public void displayMobiles() {
		for(Mobile l: objectList) {
			System.out.println("" + l.getMobId() + " " + l.getBrandName() + " " + l.getDescription() + " " + l.getPrice());
		}
	}

	@Override
	public void addMobile(Mobile m) {
		// TODO Auto-generated method stub
		objectList.add(m);
		displayMobiles();
	}

	@Override
	public boolean deleteMobile(int mId) {
		// TODO Auto-generated method stub
		Mobile m = null;
		boolean res = false;
		for(Mobile l:objectList) {
			if(l.getMobId() == mId) {
				m = l;
				break;
			}
		}
		res = objectList.remove(m);
		
		return res;
		
	}

	@Override
	public void displayAllMobiles() {
		// TODO Auto-generated method stub
		for(Mobile l: objectList) {
			System.out.println("" + l.getMobId() + " " + l.getBrandName() + " " + l.getDescription() + " " + l.getPrice());
		}
		
	}

	@Override
	public 	Mobile searchMobileById(int mId) {
		// TODO Auto-generated method stub
		Mobile l = null;
		for(Mobile m: objectList) {
			if(m.getMobId() == mId) {
				l = m;
			}
		}
		return l;
		
	}
	
	@Override
	public boolean containsId(int mobId) {
		boolean temp = false;
		for(Mobile l: objectList) {
			if(l.getMobId() == mobId) {
				temp = true;
			}
		}
		
		return temp;
		
	}
	
}