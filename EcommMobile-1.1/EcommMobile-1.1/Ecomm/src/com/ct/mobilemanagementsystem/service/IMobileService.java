package com.ct.mobilemanagementsystem.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.ct.mobilemanagementsystem.ui.Mobile;

public interface IMobileService {
	
	public ArrayList<String> addMobile(Mobile m);
	public boolean deleteMobile(int mId);
	public HashSet<Mobile> displayAllMobiles();
	public Mobile searchMobileById(int mId);
	

}
