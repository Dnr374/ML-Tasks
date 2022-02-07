package com.bhavna.filetextprocessor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FileProcessor fp=new FileProcessor();
		fp.txtProcessor();
		char val;
		do {
		System.out.println("Select the following"+"\n"+"press 1 to search login details by name "+"\n"+"press 2 to get all the records");
		Scanner scanner=new Scanner(System.in);
		fp.getByChoice(scanner.nextInt());
		System.out.println("do you want to continue y/n");
		 val=scanner.next().charAt(0);
		if(val=='n')
		break;
		}
        while(val=='y');
	}

}

