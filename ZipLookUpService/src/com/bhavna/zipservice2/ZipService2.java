package com.bhavna.zipservice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bhavna.area.Area;
import com.bhavna.zipservice1.ZipService1;

public class ZipService2 implements ZipService1{

	Scanner scanner=new Scanner(System.in);
	static  Map<Integer,Area> map;
	static {
		 map=new HashMap() ;
		 map.put(507130, new Area("India", "Andhra Pradesh","East Godavari", 507130));
		 map.put(521175,new Area("India", "Andhra Pradesh","Krishna",521175));
		 map.put(515001,new Area("India", "Andhra Pradesh","Ananthpur",515001));
		 map.put(517001,new Area("India", "Andhra Pradesh","Chittoor",517001));
		 map.put(518001,new Area("India", "Andhra Pradesh","Kadapa",518001));
		 map.put(524001,new Area("India", "Andhra Pradesh","Nellore",524001));
		 map.put(523001,new Area("India", "Andhra Pradesh","Prakasham",523001));
		 map.put(532001,new Area("India", "Andhra Pradesh","Srikakulam",532001));
		 map.put(531162,new Area("India", "Andhra Pradesh","Vijayanagaram",531162));
	}
	
	@Override
	public  void getByChoice(int choice) {
		switch (choice) {
		 case 1:
			    System.out.println("Enter the Zip code");
			    int zipCode=scanner.nextInt();
				while((zipCode<500000)||(zipCode>600000))
				{
					System.out.println("please enter a valid zip code which in between 500000 and 600000");
					zipCode=scanner.nextInt();
				}
			    System.out.println(getByZipCode(scanner.nextInt()));
			    break;
		 case 2:
			    map.forEach((k,v)->System.out.println(v));
			    break;
		 case 3:
			    System.out.println("Enter Zip code");
			    zipCode=scanner.nextInt();
			    while(map.containsKey(zipCode)){
				    System.out.println("This Zip code is already exist, pls enter new one");
				    zipCode=scanner.nextInt();
				    }
			    
			    break;
		}
	}
    
	@Override
	public  Area getByZipCode(int zipCode) {
	 return map.get(zipCode);
    }




}
