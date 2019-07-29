package com.ct.mobilemanagementsystem.mobile;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.ct.mobilemanagementsystem.ui.Mobile;

public class UserInterface {
	static Mobile selectMethod = null;
	
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
			try {
			int a = scn.nextInt();
			String b = scn.next();
			scn.nextLine();
			String c = scn.nextLine();
			int d = scn.nextInt();
			
			ArrayList<String> finalList = selectMethod.addMobile(a, b, c, d);
			System.out.println(finalList);
			}catch(InputMismatchException e) {
				System.out.println("Input must be in the specified format");
			}
			break;
		case 2:
			System.out.println("Enter Mobile ID to be searched");
			try {
			int id = scn.nextInt();
			Mobile m;
			m = selectMethod.searchMobile(id);
			System.out.println("" + m.getMobId() + " " + m.getBrandName() + " " + m.getDescription() + " " + m.getPrice());
			}catch(InputMismatchException | NullPointerException e) {
				if(e instanceof InputMismatchException) {
				System.out.println("Input must be integer!!!");
				}
				else {
					System.out.println("Given ID doesn't exists!!");
				}
			}
			break;
		case 3:
			HashSet<Mobile> l = selectMethod.displayMobile();
			for(Mobile m: l) {
				System.out.println("" + m.getMobId() + " " + m.getBrandName() + " " + m.getDescription() + " " + m.getPrice());
			}
			break;
		case 4:
				System.out.println("Enter Mobile ID to be deleted");
				int mId = scn.nextInt();
				boolean result = false;
				try {
					result = selectMethod.deleteMobile(mId);
					if (result) {
						System.out.println("Mobile successfully removed from the database");
					} else {
						System.out.println("Given mobile ID doesn't exist!!!");
					}
				} catch (NullPointerException e) {
					System.out.println("Given ID doesn't exists!!!");
				} catch (InputMismatchException e) {
					System.out.println("Input must be integer!!!");
				}
				break;
		case 5:
			System.out.println("Thank you!");
			System.exit(0);
		
		}
		
	}
	}

}
