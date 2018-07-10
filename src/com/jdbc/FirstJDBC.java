package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class FirstJDBC {
		
    public FirstJDBC(){
			Connection connection = null;
			Statement statement = null;
			ResultSet resultset = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager
						.getConnection("jdbc:mysql://localhost/attend","root","");
				System.out.println(connection);
				statement = connection.createStatement();
				String sql = "select * from employee";
				resultset = statement.executeQuery(sql);
				System.out.println(statement);
				System.out.println(resultset);
				
				while(resultset.next()) {
					System.out.println(resultset.getString("regno")+" ");
					System.out.println(resultset.getString("name")+" ");
					System.out.println(resultset.getString("dept")+" ");
					
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
			
			finally {
				try {
					if(resultset != null)
						resultset.close();
					if(statement != null)
						statement.close();
					if(connection != null)
						connection.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		
		public static void main(String[] args) {
			FirstJDBC first = new FirstJDBC();
		}

	}