package com.quiz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Menu {

	int selectOption;

	Scanner sc = new Scanner(System.in);

	int userID = 0;
	String query = "select * from quiz.question_info_master order by RAND()";
	String queryToGetAllResult = "select distinct user_firstName, user_lastName, count(question_ID) as Total_Questions ,\r\n"
			+ "count(if(answer = 'W',1,NULL)) as Wrong_Answers,\r\n"
			+ "count(if(answer = 'C',1,NULL)) as Correct_Answers \r\n"
			+ "from quiz.registered_user_info_details  uInfo, quiz.quiz_user_answers_table uAns \r\n"
			+ "where uInfo.u_id = uAns.user_ID \r\n" + "group by uInfo.u_id";

	Quiz q = new Quiz();

	String firstName, lastName;

	public void showMenu() {
		try {

			Connection con = q.getConnection();

			do {
				System.out.println("*************** Please select an option below ***************");
				System.out.printf("\n");
				System.out.println("Press 1 : Register to Quiz ");
				System.out.println("Press 2 : Start the Quiz");
				System.out.println("Press 3 : Retrieve the result of specific user");
				System.out.println("Press 4 : Get all user result");
				System.out.println("Press 5 : Exit");
				System.out.printf("\n");
				System.out.println("*************************************************************");

				System.out.println("Press any key : ");
				selectOption = sc.nextInt();

				switch (selectOption) {

				case 1:
					System.out.println("Enter First Name : ");
					firstName = sc.next();

					System.out.println("Enter Last Name : ");
					lastName = sc.next();

					q.registerUser(con, firstName, lastName);
					break;
				case 2:
					userID = q.getUserID(con, firstName, lastName);
					ResultSet rs = q.getQuestions(con, query);
					q.getQuiz(rs, userID);
					rs = q.getResultForSingleUser(con, userID);
					q.displaySingleUserResult(con, rs, firstName, lastName);
					break;
				case 3:
					System.out.println("Enter First Name : ");
					firstName = sc.next();

					System.out.println("Enter Last Name : ");
					lastName = sc.next();
					q.displaySpecificUserResult(con, firstName, lastName);
					break;
				case 4:
					q.displayAllUserReult(con, queryToGetAllResult);
					break;
				case 5:
					System.out.println("exit");
					break;
				default:
					System.out.println("Invalid Input");
					break;
				}

			} while (selectOption != 5);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
