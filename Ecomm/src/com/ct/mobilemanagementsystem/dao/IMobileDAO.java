package com.ct.mobilemanagementsystem.dao;

import com.ct.mobilemanagementsystem.ui.Mobile;

public interface IMobileDAO {
			
	public void addMobile(Mobile m);
	public void deleteMobile(int mId);
	public void updateMobileDetails(int mId);
	public void searchMobileById(int mId);	
	
}
