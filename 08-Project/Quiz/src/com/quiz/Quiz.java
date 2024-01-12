package com.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
	
	Scanner sc = new Scanner(System.in);

	HashMap<Integer, List<String>> questionCorrectAnswer = new HashMap<Integer, List<String>>();

	public Connection getConnection() {
		/*
		 * getConnection() method we are using for create connection between java and
		 * database
		 * 
		 */

		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/quiz";
			String username = "root";
			String password = "Gauravpatil@123";
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public void registerUser(Connection con, String user_firstName, String user_lastName) throws SQLException {
		/*
		 * insertUserDetails() method we are using for insert user data into database.
		 * here we are getting user 'firstname' and 'lastname'.
		 * 
		 */

		PreparedStatement pst = null;
		String query = "insert into registered_user_info_details (user_firstName,user_lastName) values(?,?)";
		pst = con.prepareStatement(query);

		pst.setString(1, user_firstName);
		pst.setString(2, user_lastName);

		int i = pst.executeUpdate();
		System.out.println(i + " row inserted");
		System.out.println("============Registration Successful===================");
		System.out.print("\n\n\n");
	
		

	}

	/**
	 * 
	 * @param con
	 * @param userFirstName
	 * @param userLastName
	 * @return
	 * @throws SQLException
	 */
	public int getUserID(Connection con, String userFirstName, String userLastName) throws SQLException {
		// Suppose we want UserID of XYZ from table
		// when we want particular user data then we use this method

		String query = "select * from registered_user_info_details where user_firstName = ? and user_lastName = ?";
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, userFirstName);
		pst.setString(2, userLastName);

		ResultSet rs = pst.executeQuery();
		int id = 0;
		while (rs.next()) {
			id = rs.getInt(1);
			rs.getString(2);
			rs.getString(3);
		}
		System.out.println("id : " + id);
	
		return id;
	}

	public void insertResultOfUser(Connection con, HashMap<Integer, List<String>> result) {
		/*
		 * insertResultOfUser() in this method we can store the answers given by user..
		 * and store into 'quiz_user_answers_table' in mysql database.
		 * 
		 */
		PreparedStatement pst;
		try {
			String query = "insert into quiz_user_answers_table (question_ID,answer,user_ID) values (?,?,?)";
			pst = con.prepareStatement(query);
			for (Map.Entry<Integer, List<String>> entry : result.entrySet()) {
				pst.setInt(1, entry.getKey());
				pst.setString(2, entry.getValue().get(0));
				pst.setInt(3, Integer.parseInt(entry.getValue().get(1)));
				pst.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public ResultSet getQuestions(Connection con, String query) {
		// this method use for fetching questions from database
		PreparedStatement pst;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement(query);

			rs = pst.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	public void getQuiz(ResultSet rs, int userID) {

		try {
			System.out.println("=========================================================");
			System.out.println("**************** Welcome To Quiz ****************");
			
			while (rs.next()) {
				int id = rs.getInt("q_id");
				String question = rs.getString("questions");
				String option1 = rs.getString("option_1");
				String option2 = rs.getString("option_2");
				String option3 = rs.getString("option_3");
				String option4 = rs.getString("option_4");
				String c_Answer = rs.getString("correct_answer");

				System.out.println("*******************************************************");

				System.out.println(question);
				System.out.println("\t" + "a) " + option1);
				System.out.println("\t" + "b) " + option2);
				System.out.println("\t" + "c) " + option3);
				System.out.println("\t" + "d) " + option4);

				System.out.println("Enter answer : ");
				String ansGiven = sc.next();
				if (c_Answer.equalsIgnoreCase(ansGiven)) {
					questionCorrectAnswer.put(id, Arrays.asList("C", Integer.toString(userID)));

				} else {
					questionCorrectAnswer.put(id, Arrays.asList("W", Integer.toString(userID)));
				}

			}
			// calling insertResultOfUser() method
			insertResultOfUser(getConnection(), questionCorrectAnswer);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("********************Answer Submitted Successfully********************");
		System.out.println();
	}

	public ResultSet getResultForSingleUser(Connection con, int userID) {
		// this method return data of single user who attemepted test
		ResultSet rs = null;
		PreparedStatement pst;
		try {
			String query = "Select count(question_ID) as TotalQuestion, user_ID, answer from quiz_user_answers_table "
					+ "where user_ID = ? group by user_ID, answer";
			pst = con.prepareStatement(query);
			pst.setInt(1, userID);
			rs = pst.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rs;
	}

	public void displaySingleUserResult(Connection con, ResultSet finalResult, String firstName, String lastName) {
		// this method use to display output of single user
		int correctAnswer = 0, wrongAnswer = 0;
		try {
			while (finalResult.next()) {
				if (finalResult.getString("answer").equals("C")) {
					correctAnswer = finalResult.getInt("TotalQuestion");
				} else if (finalResult.getString("answer").equals("W")) {
					wrongAnswer = finalResult.getInt("TotalQuestion");
				}
			}

			int total = correctAnswer + wrongAnswer;
			String grade = "";
			switch (correctAnswer) {
			case 10:
			case 9:
			case 8:
				grade = "A";
				break;
			case 6:
			case 7:
				grade = "B";
				break;
			case 5:
				grade = "C";
				break;
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				grade = "D";
				break;

			}
			System.out.println();
			System.out.println("================= Result of Quiz =================");
			System.out.println("Name : "+firstName +" "+lastName);
			System.out.println("Total Questions : "+total);
			System.out.println("Correct Answers : "+correctAnswer);
			System.out.println("Wrong Answers :"+wrongAnswer);
			System.out.println("Grade : "+grade);
			System.out.println("==================================================");
			
			/*
			System.out.println("FirstName" + "   " + "LastName" + "   " + "Total Questions" + "   " + "Correct Answer"
					+ "   " + "Wrong Answer" + "   " + "Grade");
			System.out.println(firstName + "\t\t" + lastName + "\t\t" + total + "\t\t" + correctAnswer + "\t\t"
					+ wrongAnswer + "\t " + grade);
			*/
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void displaySpecificUserResult(Connection con, String firstName, String lastName) {
		// this method used for get specific user quiz result
		Quiz q = new Quiz();
		int userID = 0;
		ResultSet rs = null;
		try {
			userID = q.getUserID(con, firstName, lastName);
			rs = q.getResultForSingleUser(con, userID);
			q.displaySingleUserResult(con, rs, firstName, lastName);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void displayAllUserReult(Connection con, String queryToGetAllResult) {
		// this method use for display all users result
		Quiz q = new Quiz();
		String grade = null;

		ResultSet allUser = null;
		allUser = q.getQuestions(con, queryToGetAllResult);

		System.out.printf("%10s %10s %10s %10s %10s %8s", "FIRST_NAME", "LAST_NAME", "TOTAL_QUESTIONS",
				"CORRECT_ANSWER", "WRONG_ANSWERS", "GRADE");
		System.out.println();
		try {
			while (allUser.next()) {
				if (allUser.getInt("Correct_Answers") >= 8)
					grade = "A";
				else if (allUser.getInt("Correct_Answers") < 8 && allUser.getInt("Correct_Answers") >= 6)
					grade = "B";
				else if (allUser.getInt("Correct_Answers") == 5)
					grade = "C";
				else
					grade = "D";
				System.out.format("%10s %10s %10s %10s %15s %13s", allUser.getString("user_firstName"),
						allUser.getString("user_lastName"), allUser.getInt("Total_Questions"),
						allUser.getInt("Correct_Answers"), allUser.getInt("Wrong_Answers"), grade);
				System.out.println();

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	
	

}
