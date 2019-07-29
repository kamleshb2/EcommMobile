package com.ct.mobilemanagementsystem.dao;

import java.util.ArrayList;

import com.ct.mobilemanagementsystem.ui.Mobile;

public interface IMobileDAO {
			
	public void addMobile(Mobile m);
	public boolean deleteMobile(int mId);
	public ArrayList<Mobile> displayAllMobiles();
	public Mobile searchMobileById(int mId);
	public boolean containsId(int mobId);
	
}
