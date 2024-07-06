package Start_Advance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ad_09_JDBC_createTable {

	public static void main(String[] args) throws SQLException {
		// Creating the connection
		String url = "jdbc:mysql://localhost/stu_record";
		Connection conn = null;
		
		int rollno = 3 ;
		String name = "Rohan";
		int age = 23;
		String sql = "insert into students(Roll_no, Stu_name, age) "+"values(" + rollno +", '"+ name +"', "+age +")";
		
		try {
			conn = DriverManager.getConnection(url,"root","Shubham@123");		// to establich a live connection to the database
			Statement st = conn.createStatement();  // create a statement object
			int m = st.executeUpdate(sql);		// execute method to execute sql command --> it returns the number of rows affected
			
			if(m == 1) {		// here we uses a single row insertion so only one row will be affected 
				System.out.println("Inserted succesfully : "+sql);
			}else {
				System.out.println("ERROR");
				System.out.println(url);
			}
		}
		catch(Exception e)  {
			System.out.print("the exception is : ");
			System.out.println(e);
		}
		finally {
			System.out.println("closeing the connection -- ");
			conn.close();
		}
	}

}
