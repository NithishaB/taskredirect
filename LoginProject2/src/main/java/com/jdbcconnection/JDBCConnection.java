package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection 
{
	 public static Connection connect;
	    public static Connection getconnect() throws SQLException
	    {
	        try
	        {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            connect  =  DriverManager.getConnection("jdbc:mysql://localhost:3306/soprasteria", "root", "Nitheesha@15");
	            return connect;
	        }
	        catch (ClassNotFoundException e)
	        {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        return null;
	        
	    }
}

