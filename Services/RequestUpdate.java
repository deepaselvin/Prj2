package com.revature.projectdept2.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.projectdept2.ConncetionUtil;

import DAO.UserDAODetails;

public class RequestUpdate {
	static Connection con = ConncetionUtil.getconnection();
	
	public static void reqinfo() throws ClassNotFoundException, SQLException {
	Scanner scn01 = new Scanner(System.in);
	
	System.out.println("Enter Request ");
	String Request_need = scn01.next();
	
	System.out.println("Enter Amount to be Deposited:");
	Scanner scn02 = new Scanner(System.in);
	int Deposit = scn02.nextInt();
	
	UserDAODetails.RequestInsertDAO(Request_need, Deposit);
	
	CharityDeposit depo = new CharityDeposit();
	int bal=depo.depinfo(Deposit);
	
	
	int totalBalance = bal - Deposit;
	System.out.println("DONATED AMOUNT::"+Deposit);
	
	Connection con2 = ConncetionUtil.getconnection();
 

	System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
	System.out.println("FUND STILL NEEDED:"+totalBalance);
	if(totalBalance==0)
	{
		System.out.println("**** REQUEST WAS FULLFILLED ****");
	}
	UserDAODetails.AdFundinfoDAO(totalBalance, Request_need);
	RequestList.req(); 


}
}