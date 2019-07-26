package com.ct.mobilemanagementsystem.ui;
import java.util.Scanner;

import com.ct.mobilemanagementsystem.dao.*;
import com.ct.mobilemanagementsystem.service.*;

public class Mobile {
	
	private int mobId;
	private String brandName;
	private String description;
	private float price;
	static Mobile selectMethod = null;
	
	Mobile(int id, String name, String des, float pric){
		mobId = id;
		brandName = name;
		description = des;
		price = pric;
		
	}
	
	Mobile(){
		
		}
	
	
	
	public int getMobId() {
		return mobId;
	}



	public void setMobId(int mobId) {
		this.mobId = mobId;
	}



	public String getBrandName() {
		return brandName;
	}



	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		System.out.println("***Welcome to ABC Mobile Shop***");
		System.out.println("--------------------------------------");
		System.out.println("--------------------------------------");
		
		System.out.println("1.Add Mobile\r\n" + 
				"2.Search Mobiles by Id\r\n" + 
				"3.Display All Mobiles\r\n" + 
				"4.delete mobile  \r\n" + 
				"5.exit");
		
		Scanner scn = new Scanner(System.in);
		int choice = scn.nextInt();
		selectMethod = 	new Mobile();
		
		switch(choice)
		{	
		case 1:
			System.out.println("Enter Mobile Id, Brand Name, Description and Price");
			int a = scn.nextInt();
			String b = scn.next();
			String c = scn.next();
			int d = scn.nextInt();
			
			selectMethod.addMobile(a, b, c, d);
			break;
		case 2:
//			Mobile searchResult = selectMethod.searchMobile();
			break;
		case 3:
			selectMethod.displayMobile();
			break;
		case 4:
			selectMethod.deleteMobile();
			break;	
		case 5:
			System.out.println("Thank you!");
		
		}
		
	}
	
	public void addMobile(int id, String name, String des, int price) {
		
		Mobile newMob = new Mobile(id, name, des, price);
		IMobileService intObj = null;
		intObj = new MobileServiceImpl();
		intObj.addMobile(newMob);
		
		
	}
	
//	public Mobile searchMobile() {
//		
//		
//	}
	
	public void displayMobile() {
		
	}
	
	public void deleteMobile() {
		
	}

}
