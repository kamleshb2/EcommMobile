package com.ct.mobilemanagementsystem.mobile;

import java.util.HashSet;

import com.ct.mobilemanagementsystem.ui.Mobile;

public class HashSetEx {
	
	static Mobile m = new Mobile();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Mobile> l = new HashSet<>();
		System.out.println(l);
		l.add(new Mobile(123, "Samsung", "good", 12999));
		l.add(new Mobile(123, "Samsungg", "good", 12999));
		l.add(new Mobile(12378, "Samsung", "good", 12999));
		
		for(Mobile m: l ) {
			System.out.println("" + m.getMobId() + " " + m.getBrandName() + " " + m.getDescription() + " " + m.getPrice());
		}
		
		System.out.println(m.getMobId() + " " + m.getPrice() + " " + m.getBrandName());
		

	}

}
