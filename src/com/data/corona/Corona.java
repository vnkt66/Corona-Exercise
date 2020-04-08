package com.data.corona;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Corona {
	
	// SQLException handles any errors related to  SQL database

	public static void main(String[] args) throws SQLException {
		
       // Connection interface has methods to contact a database
		Connection myConn = null;
		// Objects from this interface is used to submit SQL statements to a database
		PreparedStatement myStmt = null;
		// stores result of the executed queries from database and acts as a iterator
		ResultSet myRs = null;
		// try and catch block to catch error and print it using printStackTrace
		
		try {
			// * Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/corona", "student" , "student");
			
			// * Prepare statement
			myStmt = myConn.prepareStatement("select * from coronadata");
			
			
			// * Execute SQL query
			myRs = myStmt.executeQuery();
			
			// * This method takes the resultSet and extracts the values and makes instances of CoronaDataModel and adds it to the List 
			addCoronaData(myRs);

		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			if (myStmt != null) {
				myStmt.close();
			}
			
			if (myConn != null) {
				myConn.close();
			}
		}
	}

	private static void addCoronaData(ResultSet myRs) throws SQLException {
		// LinkedList is a List Collection mostly similar to arrayList but adding at any place or removing items is faster 
		List<CoronaDataModel> list = new LinkedList<CoronaDataModel>();
		while (myRs.next()) {
			int id = myRs.getInt("id");
			String State = myRs.getString("State");
			String City = myRs.getString("City");
			int MaleCount = myRs.getInt("male");
			int FemaleCount = myRs.getInt("Female");
			
			// adding CoronaDataModel instances to the list
			list.add(new CoronaDataModel(id, State, City, MaleCount, FemaleCount));
			
		}
		//Sending the list collection as a parameter to the constructor of CalaculateData
		CalculateData data = new CalculateData(list);
		// Formatting the strings to make them move left
		System.out.printf("\t%s\n\n", "PATIENTS AFFECTED BY CORONA VIRUS STATE WISE");
		System.out.println("***********************************************************");
		System.out.printf("%40s %d\n","Tamilnadu Male Count:", data.tnMaleCount);
		System.out.printf("%40s %d\n", "Tamilnadu Female Count:", data.tnFemaleCount);
		System.out.printf("%40s %d\n", "Tamilnadu Total Count:", data.tnMaleCount + data.tnFemaleCount);
		System.out.printf("%40s %d\n", "AP Male Count:", data.apMaleCount);
		System.out.printf("%40s %d\n", "AP Female Count:", data.apFemaleCount);
		System.out.printf("%40s %d\n", "AP Total Count:", data.apMaleCount + data.apFemaleCount);
		System.out.printf("%40s %d\n", "Kerala Male Count:", data.kMaleCount);
		System.out.printf("%40s %d\n", "Kerala Female Count:", data.kFemaleCount);
		System.out.printf("%40s %d\n", "Kerala Total Count:", data.kMaleCount + data.kFemaleCount);
		System.out.println("_____________________________________________________________");
		System.out.printf("%40s %d\n", "Total Count:", data.getTotalCount());
	}
	
}


