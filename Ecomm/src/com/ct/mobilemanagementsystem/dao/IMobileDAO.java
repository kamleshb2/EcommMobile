package com.ct.mobilemanagementsystem.dao;

import com.ct.mobilemanagementsystem.ui.Mobile;

public interface IMobileDAO {
			
	public void addMobile(Mobile m);
	public boolean deleteMobile(int mId);
	public void displayAllMobiles();
	public Mobile searchMobileById(int mId);
	public boolean containsId(int mobId);
	
}
