package com.sprk.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static Connection getConnection(String username, String password, String url) throws SQLException {
		return DriverManager.getConnection(url, username, password);
	}

}
