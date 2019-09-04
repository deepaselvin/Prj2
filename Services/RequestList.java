package com.revature.projectdept2.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class RequestList {
 
	public static void req()throws SQLException, ClassNotFoundException {
	System.out.println("MAIN MENU \n "
			+ "01 : CHILDRENS EDUCTAION \n"
			+ "02:HEALTH & NUTRITION \n"
			+ "03:LOG OUT");
	Scanner scn10 = new Scanner(System.in);
	int letter = scn10.nextInt();
	
	 while(letter!=04) {
			switch (letter) {

			case 01:
			{
				System.out.println(" CHILDRENS EDUCTAION");
				System.out.println("FUND NEEDED:"+Fundinfo.balance);
				RequestUpdate.reqinfo();
				break;


			}
			case 02:
			{
				System.out.println("HEALTH & NUTRITION");
				System.out.println("FUND NEEDED:"+Fundinfo.balance);
				RequestUpdate.reqinfo();
				break;
				
			}
			case 03:
			{
				System.out.println("LOG OUT ");
				MainMenuList.show();
				break;
			}


}
	 }
}
}
