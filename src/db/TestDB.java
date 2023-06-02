package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	   //1. Register Driver
		 Class.forName("com.mysql.cj.jdbc.Driver");
       
	  //2. getConnection(url,un,psw)
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb8am", "root", "");
		 
	 //============================== insert sql ===================================
		//		//1. write sql
		//		 String sql = "insert into user(username,password)values('jon','j6666') ";
		//		//2. create statement/prepared statement
		//		 Statement  stm = con.createStatement();
		//		//3. execute / executeQuery 
		//		 stm.execute(sql);
		//		//4. close db
		//		 con.close();
		//		 
		//		 System.out.println("success");
		
	
  //============================= delete sql =========================================
		
	//		String sql = "delete from user where id = 3 ";
	//		Statement stm = con.createStatement();
	//		stm.execute(sql);
	// 
	//		System.out.println("delete success");
		
 //======================  update sql ===================================================		
	//		String sql = "update user set password = 'test789' where id =2 ";
	//		Statement stm = con.createStatement();
	//		stm.execute(sql);
	//		
	//		System.out.println("update success");
		
//==================================== select sql ========================================
		String sql = "select * from user ";
		Statement stm = con.createStatement();
		ResultSet  rs = stm.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println("Id = "+rs.getInt("id"));
			System.out.println("UserName = "+rs.getString("username"));
			System.out.println("Password = "+rs.getString("password"));
			System.out.println("=================");
		}
		
	}

}
