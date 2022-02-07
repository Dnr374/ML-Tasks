package com.bhavna.filetextprocessor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FileProcessor {
	Scanner scanner=new Scanner(System.in);

	public void txtProcessor() {
		String line = null;
		String[] data = null;
		File file=new File("a.txt");
		try {
			Scanner scanner=new Scanner(file);
			while(scanner.hasNext()) {
				line=scanner.nextLine();
				if(line.length()>0) {
					data=line.split("\t");

					if(map.containsKey(data[0]))
						map.get(data[0]).add(new LoginData(data[0],data[1],data[2]));
					else {
						List<LoginData> list=new ArrayList();
						list.add(new LoginData(data[0],data[1],data[2]));
						map.put(data[0],list);}
				}}

		} catch (FileNotFoundException e) {	
			System.out.println("File not found");
		}

	}
	static Map<String,List<LoginData>> map= new HashMap<String, List<LoginData>>();

	public void getDataByName(String name) {		
		try {
			if(map.containsKey(name))
				System.out.println("The user logged "+map.get(name).size()+" times and "+"his/her login date and time are as follows"+"\n"+map.get(name));
			else
				throw new UserNotFound("The user u have entered is not in the records pls enter a valid User Name");}
		catch(UserNotFound e) {
			System.err.println(e.getMessage());
		}
	}
	public void getAllDetails() {
		for(Map.Entry<String, List<LoginData>> m:map.entrySet()) {
			System.out.println("--------------");
			System.out.println(m.getKey()+" logged "+m.getValue().size()+" no of times : ");
			System.out.println(m.getValue());
			System.out.println();
		}

	}

	public  void getByChoice(int choice) {
		switch (choice) {
		case 1:
			System.out.println("enter the user name  to search his/her login details ");
			getDataByName(scanner.next());
			break;
		case 2:
			getAllDetails();
			break;
		}
	}}






















