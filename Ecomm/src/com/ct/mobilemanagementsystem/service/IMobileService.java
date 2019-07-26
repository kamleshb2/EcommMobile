package com.ct.mobilemanagementsystem.service;

import com.ct.mobilemanagementsystem.ui.Mobile;

public interface IMobileService {
	
	public void addMobile(Mobile m);
	public void deleteMobile(int mId);
	public void updateMobileDetails(int mId);
	public void searchMobileById(int mId);
	

}
