package com.revature.projectdept2.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.projectdept2.ConncetionUtil;

import DAO.UserDAODetails;

public class MainMenuList {

	
	public static void show() throws SQLException, ClassNotFoundException {
		Connection con = ConncetionUtil.getconnection();

		System.out.println("MAIN MENU \n 1 : REQUEST LIST \n 2 : DONOR LIST \n 3:Admin User");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		
		while (a != 4) {
			switch (a) {

			case 1: {
				System.out.println("REQUEST LIST");

				RequestList.req();
				show();
			}
				break;

			case 2: {
				System.out.println("DONOR LIST");

				LoginAdmin.loginAd();
				UserDAODetails.LoginDAO1(null, a);
				System.out.println("MAIN MENU \n "
						+ "01 : CHILDRENS EDUCTAION \n"
						+ "02:HEALTH & NUTRITION \n"
						+ "03:LOG OUT");
				
				System.out.println("Enter the Request Number:");
				Scanner scanner11 = new Scanner(System.in);
			 	int Reqno = scanner11.nextInt();
				String sql="select id from donor_details where Request_no=?" ;
				   PreparedStatement pst = con.prepareStatement(sql);
				   pst.setInt(1, Reqno);
				   ResultSet rs = pst.executeQuery();
				   while(rs.next())
					{
					
					   /*String sql1="select id from donor_details where Request_no=?";
					  PreparedStatement pst1 = con.prepareStatement(sql1);
						pst1.setInt(1, Reqno);
					
					
						pst1.executeUpdate();

					  ResultSet rs1 = pst1.executeQuery();
*/

				show();
			
			
				break;
	
	}
			}

				case 3: {
				System.out.println("WELCOME TO THE CHARITY FUNDS");
				System.out.println("MAIN MENU \n "
						+ "01 : CHILDRENS EDUCTAION \n"
						+ "02:HEALTH & NUTRITION \n"
						+ "03:LOG OUT");
				
			
				//HOW TO MAKE ALTERATION IN REQUEST AND RAISE FUNDS
				Scanner sc =new Scanner(System.in);

				System.out.println("Enter Request Number");
				   int Reqno =sc.nextInt();
				   
				   
				   Fundinfo.fund();


				show();
			}
				break;
			}

			}
		}
	}




