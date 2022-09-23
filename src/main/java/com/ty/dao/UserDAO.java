package com.ty.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ty.dto.UserData;

public class UserDAO {

	String path = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/ems";
	String username = "root";
	String password = "root";
	Connection connection = null;

	public String Signup(UserData ud) {

		String query = "INSERT INTO user VALUES(?,?,?,?,?,?,?)";

		try {
			Class.forName(path);
			connection = DriverManager.getConnection(url, username, password);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, ud.getFirstname());
			preparedStatement.setString(2, ud.getLastname());
			preparedStatement.setString(3, ud.getEmail());
			preparedStatement.setString(4, ud.getPassword());
			preparedStatement.setLong(5, ud.getPhone());
			preparedStatement.setString(6, ud.getDob());
			preparedStatement.setString(7, ud.getGender());

			int a = preparedStatement.executeUpdate();

			System.out.println("Number of record inserted " + a);
			return "Value Stored";
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return null;
	}

	public UserData getUserByEmailAndPassword(String email, String password) {
		String query = "SELECT * FROM user WHERE email = ? AND password = ?";
		try {
			Class.forName(path);
			connection = DriverManager.getConnection(url, username, this.password);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			ResultSet resultSet = preparedStatement.executeQuery();
			
				
				
				while (resultSet.next()) {
					UserData usd = new UserData();
					usd.setFirstname(resultSet.getString(1));
					usd.setLastname(resultSet.getString(2));
					usd.setEmail(resultSet.getString(3));
					usd.setPassword(resultSet.getString(4));
					usd.setPhone(resultSet.getLong(5));
					usd.setDob(resultSet.getString(6));
					usd.setGender(resultSet.getString(7));
				return usd;
				}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return null;
	}

	public String upd_Signup(UserData ud) {

		String query = "UPDATE user SET email = ?, password = ? WHERE firstName = ?";
		try {
			Class.forName(path);
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement prepareStatement = con.prepareStatement(query);
			prepareStatement.setString(1, ud.getEmail());
			prepareStatement.setString(2, ud.getPassword());
			prepareStatement.setString(3, ud.getFirstname());

			int a = prepareStatement.executeUpdate();
			System.out.println("Number of record updated " + a);
			return "Updated";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		return "Not Updated";
	}

	public String del_Singup() {

		return "Not Updated";
	}

}
