package com.revature.projectdept2.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.projectdept2.ConncetionUtil;

import DAO.UserDAODetails;




public class LoginCredits {
	static Connection con = ConncetionUtil.getconnection();
	static void login() throws SQLException, ClassNotFoundException {
		System.out.println("LOGIN");
		
		System.out.println("ENTER USER NAME:");
		Scanner scanner12 = new Scanner(System.in);
		String enter_name = scanner12.next();
		System.out.println("ENTER PHONE NO:");
		int enter_phn_no = scanner12.nextInt();

		UserDAODetails.LoginDAO1(enter_name,enter_phn_no);
		MainMenuList sh=new MainMenuList();
		sh.show();
				

	}
	}

