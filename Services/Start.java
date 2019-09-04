package com.revature.projectdept2.Services;

import java.sql.SQLException;
import java.util.Scanner;

public class Start {
 
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
		
		
		
		System.out.println("**** WELCOME TO THE CHARITY PAGE ****** \n "
				+ "01:REGISTER \n"
				+ "02: LOGIN \n"
				+ "03: LOG OUT");
		int a = scanner.nextInt();
		
		switch(a) {
		case 1:{
		
		try {
			Registration.register();
		} catch (SQLException e) {
		e.printStackTrace();
			throw new Exception("Invalid Registration Details");
		}
		}

		break;
		
		case 2:{
		LoginCredits.login();
	}
         
		break;
}
}
}


