package com.revature.projectdept2.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.projectdept2.ConncetionUtil;

import DAO.UserDAODetails;


public class Registration {

	 Connection con =ConncetionUtil.getconnection();
	
  static void register() throws SQLException
 {
	Scanner scanner11 = new Scanner(System.in);
 	System.out.println(" enter_Name:");
 	String name = scanner11.next();
 	System.out.println(" enter Phn_No:");
 	int phone_no = scanner11.nextInt();
 	//user.setenter_Name(name);
 	//user.setPhn_No(phone_no);
 	
 	
 	System.out.println("Registered sucessfully");
 	
 	UserDAODetails.RegisterDAO(name,phone_no);
 	

	


	
 }
  
	  
  

}
