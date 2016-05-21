package com.chen;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	private static String DBDRIVER = "org.git.mm.mysql.Driver";
	private static String DBURL = "jdbc.mysql://localhost:3306/mldn";
	private static String DBUSER = "root";
	private static String DBPASSWORD = "123456";
	private Connection conn = null;
	
	
	public DatabaseConnection() throws Exception{
		Class.forName(DBDRIVER);
		this.conn = DriverManager.getConnection(DBURL, DBURL, DBPASSWORD);
		
	}
	
	public Connection getConnection(){
		return this.conn;
	}
	
	public void close() throws Exception{
		if(this.conn!=null){
			try {
				this.conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
