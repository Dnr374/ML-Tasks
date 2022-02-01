package com.bhavna.main;

import java.util.Scanner;

import com.bhavna.zipservice1.ZipService1;
import com.bhavna.zipservice2.ZipService2;
public class MainClass {
	
	public static void main(String[] args) {
		char val;
		Scanner scanner=new Scanner(System.in);
		do {
		System.out.println("select the following "+"\r\n"+"press 1 to get the details by zip code"
							+"\r\n"+"press 2 to get all the zip codes details"
							+"\r\n"+"press 3 to enter the new record");
		
		int choice=scanner.nextInt();
		ZipService1 zipService1=new ZipService2();
		zipService1.getByChoice(choice);
		System.out.println("do you wnat to continue y/n");
		val=scanner.next().charAt(0);
		if(val=='n'){
		break;
		}

		}while(val=='y');
	
	}
}
