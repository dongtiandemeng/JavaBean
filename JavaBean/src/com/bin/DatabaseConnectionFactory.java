package com.bin;

public class DatabaseConnectionFactory {
	
	public static DatabaseConnection getDatabaseConnection() {
		return new MySQLDatabaseConnection();
	}

}
