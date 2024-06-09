package conn;

import java.sql.*;
public class ConnPro{

	private static Connection con=null;

	public static Connection getConnection(){

		if(con == null){

			try{
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306//Student","root","Hsm@8102");
			}catch(Exception e){

				e.printStackTrace();
			}
			
		}
		return con;
	}
}
