package com.jdbc;
import java.sql.*;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	public class FirstJdb {
		
		public FirstJdb(){
		   
		Connection connection=null;
			Statement statement=null;
			ResultSet result=null;
			try {
			 
				Class.forName("com.mysql.cj.jdbc.Driver");
				 connection = DriverManager
						.getConnection("jdbc:mysql://localhost/attend","root","");
				//System.out.println(connection);
				statement=connection.createStatement();
				// sql="insert into studen (3,'sam','cse') ";
				 
				String sql="select * from student";
			   
				result=statement.executeQuery(sql);
				//System.out.println(statement);
				//System.out.println(result);
				while(result.next()) {
					System.out.println(result.getString("RegNo")+" ");
					System.out.println(result.getString("Name")+" ");
					System.out.println(result.getString("Dept")+"\n ");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			finally {
				try {
					if(result !=null) {
						result.close();
					}
					if(statement !=null) {
						statement.close();
					}
					if(connection !=null) {
						connection.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();// TODO: handle exception
				}
			}
			
			
			
		}
		public void update() {
			Connection connection=null;
			Statement statement=null;
			//ResultSet resultset=null;
			try {
			 
				Class.forName("com.mysql.cj.jdbc.Driver");
				 connection = DriverManager
						.getConnection("jdbc:mysql://localhost/attend","root","");
				System.out.println(connection);
				DatabaseMetaData db=connection.getMetaData();
				System.out.println(db.getDatabaseProductName());
				System.out.println(db.getDatabaseProductVersion());
				System.out.println(db.getDatabaseMajorVersion());
				statement=connection.createStatement();
				 String sql="update student set RegNo=23 where Name='priya'   " ;
				int result = statement.executeUpdate(sql);
			
			   
				//int  result=statement.executeUpdate(sql);
				// System.out.println(statement);
				System.out.println(result);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			finally {
				try {
					if(statement !=null) {
						statement.close();
					}
					if(connection !=null) {
						connection.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();// TODO: handle exception
				}
			}
		
			
		}
		public void delete() {
			Connection connection=null;
			Statement statement=null;
			ResultSet resultset=null;
			try {
			 
				Class.forName("com.mysql.cj.jdbc.Driver");
				 connection = DriverManager
						.getConnection("jdbc:mysql://localhost/attend","root","");
				System.out.println(connection);
				statement=connection.createStatement();
				 String sql="delete from student where RegNo=28 ";	   
				statement.executeUpdate(sql);
				
				int result=statement.executeUpdate(sql);
				System.out.println(result);
			
			
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			finally {
				try {
					if(resultset !=null) {
						resultset.close();
					}
					if(statement !=null) {
						statement.close();
					}
					if(connection !=null) {
						connection.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();// TODO: handle exception
				}
			}
		
			
		}
		public void prepareStatement() {
			Connection connection=null;
			PreparedStatement statement=null;
		
			try {
			 
				Class.forName("com.mysql.cj.jdbc.Driver");
				 connection = DriverManager
						.getConnection("jdbc:mysql://localhost/attend","root","");
				System.out.println(connection);
				
				 String sql="insert into student(RegNo,Name,Dept) values(?,?,?)";	   
			
				statement=connection.prepareStatement(sql);
				statement.setInt(1, 28);
				statement.setString(2,"ammu");
				statement.setString(3,"ces");
				int ret=statement.executeUpdate();
				System.out.println(ret);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			finally {
				try {
					
					if(statement !=null) {
						statement.close();
					}
					if(connection !=null) {
						connection.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();// TODO: handle exception
				}
			}
		
			
		}
		public void transaction() {
			Connection connection=null;
			PreparedStatement statement=null;
		
			try {
			 
				Class.forName("com.mysql.cj.jdbc.Driver");
				 connection = DriverManager
						.getConnection("jdbc:mysql://localhost/attend","root","");
				System.out.println(connection);
				String sql="update student set Dept='cse' where  Name='priya'";	
				 }
				 catch (Exception e) {
						e.printStackTrace();
					}
					
					finally {
						try {
							
							if(statement !=null) {
								statement.close();
							}
							if(connection !=null) {
								connection.close();
							}
						} catch (Exception e2) {
							e2.printStackTrace();// TODO: handle exception
						}
					}
		}
		
		public static void main(String[] args) {
			FirstJdb first = new FirstJdb();
			first.update();
			first.delete();
			first.prepareStatement();
		}

	}




