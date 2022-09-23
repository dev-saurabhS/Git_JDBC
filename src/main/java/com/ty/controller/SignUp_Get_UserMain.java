package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.UserDAO;
import com.ty.dto.UserData;

public class SignUp_Get_UserMain {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		UserData ud = new UserData();

		System.out.println("Enter the Email ID of User");
		String email = s.next();

		System.out.println("Enter the password for User");
		String password = s.next();

		UserDAO udo = new UserDAO();
		ud = udo.getUserByEmailAndPassword(email, password);
		try {
			if (ud.getPassword().compareTo(password) == 0) {
				System.out.println("Password correct");
				System.out.println(ud);

			}
		} catch (NullPointerException e) {
			System.out.println("Password incorrect");
		}
	}
}
