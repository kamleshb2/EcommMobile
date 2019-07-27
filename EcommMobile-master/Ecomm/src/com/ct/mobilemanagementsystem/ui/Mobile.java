package com.ct.mobilemanagementsystem.ui;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.ct.mobilemanagementsystem.dao.*;
import com.ct.mobilemanagementsystem.service.*;

public class Mobile {
	
	private int mobId;
	private String brandName;
	private String description;
	private float price;
	static Mobile selectMethod = null;
	static IMobileService intObj = new MobileServiceImpl();
	
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
		
		while(true) {
		
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
			System.out.println("Enter Mobile ID to be searched");
			try {
			int id = scn.nextInt();
			selectMethod.searchMobile(id);
			}catch(InputMismatchException e) {
				System.out.println("Input must be integer!!!");
			}
			break;
		case 3:
			selectMethod.displayMobile();
			break;
		case 4:
			System.out.println("Enter Mobile ID to be deleted");
			int mId = scn.nextInt();
			selectMethod.deleteMobile(mId);
			break;	
		case 5:
			System.out.println("Thank you!");
		
		}
		
	}
	}
	
	public void addMobile(int id, String name, String des, int price) {
		
		Mobile newMob = new Mobile(id, name, des, price);
		intObj.addMobile(newMob);
		
	}
	
	public void searchMobile(int id) {
		
		intObj.searchMobileById(id);
	}
	
	public void displayMobile() {
		intObj.displayAllMobiles();
	}
	
	public void deleteMobile(int mId) {
		intObj.deleteMobile(mId);
	}

}
