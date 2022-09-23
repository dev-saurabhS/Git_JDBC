package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.UserDAO;
import com.ty.dto.UserData;

public class SignUp_UserMain {
	
	static {	System.out.println("****Perform SIGNUP OPERATION -[ USER ]*****");}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =  new Scanner(System.in);
		
		System.out.println("Enter the first Name of User");
		String f_name = s.next();
		
		System.out.println("Enter the Last Name of User");
		String l_name = s.next();
		
		System.out.println("Enter the Email ID of User");
		String email = s.next();
		
		System.out.println("Enter the password for User");
		String password = s.next();
		
		System.out.println("Enter the User Phone Number");
		Long phone = s.nextLong();
		
		System.out.println("Enter the Date Of Birth of User");
		String dob = s.next();
		
		System.out.println("Enter the gender of the User");
		String gender = s.next();
		
		UserData ud = new UserData(f_name,l_name,email,password,phone,dob,gender);
		UserDAO udo = new UserDAO();
		
		String result = udo.Signup(ud);   // calling Signup() and passing UserData Object
		
		System.out.println(result);
	}

}
