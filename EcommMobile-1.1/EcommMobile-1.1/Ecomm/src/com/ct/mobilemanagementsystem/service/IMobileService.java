package com.ct.mobilemanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import com.ct.mobilemanagementsystem.ui.Mobile;

public interface IMobileService {
	
	public List addMobile(Mobile m);
	public void deleteMobile(int mId);
	public void displayAllMobiles();
	public Mobile searchMobileById(int mId);
	

}
