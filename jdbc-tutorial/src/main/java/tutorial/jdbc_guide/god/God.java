package tutorial.jdbc_guide.god;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import tutorial.jdbc_guide.god.model.Employee;


//try catch need for automatically close resources after end
public class God {

	 private static final String SQL_TABLE_CREATE = "CREATE TABLE EMPLOYEE"
	            + "("
	            + " ID serial,"
	            + " NAME varchar(100) NOT NULL,"
	            + " SALARY numeric(15, 2) NOT NULL,"
	            + " CREATED_DATE timestamp with time zone NOT NULL DEFAULT CURRENT_TIMESTAMP,"
	            + " PRIMARY KEY (ID)"
	            + ")";
	
	 private static final String SQL_INSERT = "INSERT INTO EMPLOYEE (NAME, SALARY, CREATED_DATE) VALUES (?,?,?)";

	 private static final String SQL_UPDATE = "UPDATE EMPLOYEE SET SALARY=? WHERE NAME=?";
   
	public static void please_createDataBase() 
	{
		
		  try (Connection conn = DriverManager.getConnection(
	                "jdbc:postgresql://127.0.0.1:5432/jdbc_tutorial", "postgres", "password")) {
	        	
	            	Statement statement = conn.createStatement();
	        		statement.executeUpdate("CREATE DATABASE jdbc_tutorial");

	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }		
	}

	public static void check_connection_with_database() 
	{
	
		  try (Connection conn = DriverManager.getConnection(
	                "jdbc:postgresql://127.0.0.1:5432/", "postgres", "password")) {

	        	
	            if (conn != null) {
	                System.out.println("Connected to the database!");
	            } else {
	                System.out.println("Failed to make connection!");
	            }

	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}

	public static void create_table() {
		

		  try (Connection conn = DriverManager.getConnection(
	                "jdbc:postgresql://127.0.0.1:5432/jdbc_tutorial/EMPLOYEE", "postgres", "password")) {

	            	 Statement statement = conn.createStatement();
		             statement.execute(SQL_TABLE_CREATE);

	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
	}

	
	public static void please_insert_to_table_something()
	{
		 try (Connection conn = DriverManager.getConnection(
	                "jdbc:postgresql://127.0.0.1:5432/jdbc_tutorial/employee", "postgres", "password");
	             Statement statement = conn.createStatement();
	             PreparedStatement psInsert = conn.prepareStatement(SQL_INSERT)) {


	            // start transaction block
	            conn.setAutoCommit(false); // default true

	            // Run list of insert commands
	            psInsert.setString(1, "banan");
	            psInsert.setBigDecimal(2, new BigDecimal(5));
	            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
	            psInsert.execute();

	            psInsert.setString(1, "abakanuka_monako");
	            psInsert.setBigDecimal(2, new BigDecimal(3));
	            psInsert.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
	            psInsert.execute();

	            // end transaction block, commit changes
	            conn.commit();

	            // good practice to set it back to default true
	            conn.setAutoCommit(true);

	        } catch (Exception e) {
	            e.printStackTrace();
	        } 

	}

	public static void please_show_me_table() {
		
		 List<Employee> result = new ArrayList<>();

	     String SQL_SELECT = "Select * from EMPLOYEE";
	        
		 try (Connection conn = DriverManager.getConnection(
	                "jdbc:postgresql://127.0.0.1:5432/jdbc_tutorial/employee", "postgres", "password");
	             Statement statement = conn.createStatement();
				 PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT)) {

	            ResultSet resultSet = preparedStatement.executeQuery();

	            while (resultSet.next()) {

	                long id = resultSet.getLong("ID");
	                String name = resultSet.getString("NAME");
	                BigDecimal salary = resultSet.getBigDecimal("SALARY");
	                Timestamp createdDate = resultSet.getTimestamp("CREATED_DATE");

	                Employee obj = new Employee();
	                obj.setId(id);
	                obj.setName(name);
	                obj.setSalary(salary);
	                // Timestamp -> LocalDateTime
	                obj.setCreatedDate(createdDate.toLocalDateTime());

	                result.add(obj);

	            }
	            
	            System.out.println("Info about current data in table");
	            result.forEach(x -> System.out.println(x));
	            System.out.println("end data");
	            
	        } catch (SQLException e) {
	            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

		 
	}

	public static void update_info_of_table_employee() {
		
		 try (Connection conn = DriverManager.getConnection(
	                "jdbc:postgresql://127.0.0.1:5432/jdbc_tutorial/employee", "postgres", "password");
	     
		Statement statement = conn.createStatement();
        PreparedStatement psUpdate = conn.prepareStatement(SQL_UPDATE)) {

       // start transaction block
       conn.setAutoCommit(false); // default true

       // Run list of update commands

       // error, test roolback
       // org.postgresql.util.PSQLException: No value specified for parameter 1.
       psUpdate.setBigDecimal(1, new BigDecimal(999.99));
       psUpdate.setString(2, "banan");
       psUpdate.execute();

       // end transaction block, commit changes
       conn.commit();

       // good practice to set it back to default true
       conn.setAutoCommit(true);

   } catch (Exception e) {
       e.printStackTrace();
   }

		
	}

	
	
}
