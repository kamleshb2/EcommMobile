package com.ct.mobilemanagementsystem.dao;

import java.util.ArrayList;
import java.util.HashSet;

import com.ct.mobilemanagementsystem.ui.Mobile;

public interface IMobileDAO {
			
	public void addMobile(Mobile m);
	public boolean deleteMobile(int mId);
	public HashSet<Mobile> displayAllMobiles();
	public Mobile searchMobileById(int mId);
	public boolean containsId(int mobId);
	
}
