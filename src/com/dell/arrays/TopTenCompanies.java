package com.dell.arrays;

import java.util.Scanner;

public class TopTenCompanies {

	public static void main(String[] args) {
		String topTenCompanies[] = {
				"DELL","INFOSYS", "MICROSOFT","AMAZON","EMC",
				"BOA", "GOOGLE", "HP", "CP","FIDELITY", "SIEMENS"				
		};
		
		System.out.println("Welcome to top 10 companies");
		System.out.println("Please enter company name");
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		boolean companyPresent = false;
		int i =0;
		for(i=0;i<topTenCompanies.length;i++) {
			if(topTenCompanies[i].equalsIgnoreCase(s)){
				companyPresent = true;
				
				break;
			}
		}
		if(companyPresent) {
			System.out.println("Your company is in topTenListand and its position isnumber "+(i+1));
		}else {
			System.out.println("Your company is not in topTenList");
		}
	}

}
