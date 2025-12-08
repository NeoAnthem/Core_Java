package com.sprk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.sprk.model.Student;

//Data Access Object Layer -> Repository
public class StudentDao {

	// Aggregation
	private Connection connection;

	public StudentDao(Connection connection) throws Exception {

		if (connection == null) {
			throw new Exception("Please Pass Connection To Proceed");
		}

		this.connection = connection;
	}

	public void testConnection() {
		System.out.println("Connection Obj = " + connection);
	}

	public int insertStudent(Student student) throws SQLException {

		String sql = "insert into student(first_name, last_name, gender) values (?, ?, ?)";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setString(1, student.getFirstName());
		preparedStatement.setString(2, student.getLastName());
		preparedStatement.setString(3, student.getGender());

		int result = preparedStatement.executeUpdate();

		closeAll(connection, preparedStatement, null);

		return result;
	}

	public Student findByRollNo(int rollNo) throws SQLException {

		String sql = "select * from student where roll_no = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setInt(1, rollNo);

		ResultSet resultSet = preparedStatement.executeQuery();
		Student student = null;
		if (resultSet.next()) {
			student = new Student();
			student.setFirstName(resultSet.getString("first_name"));
			student.setLastName(resultSet.getString("last_name"));
			student.setRollNo(resultSet.getInt("roll_no"));
			student.setGender(resultSet.getString("gender"));
			student.setAccCreatedAt(resultSet.getTimestamp("acc_created_at"));
			student.setAccUpdatedAt(resultSet.getTimestamp("last_update"));
		}

		closeAll(connection, preparedStatement, resultSet);
		return student;
	}

	// Find All Students -> Many Rows -> Arrays[Fixed in Size]
	// Collections -> List<Student>

	public List<Student> getAllStudents() throws SQLException {

		String sql = "select * from student";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet resultSet = preparedStatement.executeQuery();

		// We have many rows -> no idea about number of rows -> while loop
		List<Student> allStudents = new LinkedList<Student>();
		// size == 0 -> No students found/ db is empty

		while (resultSet.next()) {

			Student student = new Student();
			student.setFirstName(resultSet.getString("first_name"));
			student.setLastName(resultSet.getString("last_name"));
			student.setRollNo(resultSet.getInt("roll_no"));
			student.setGender(resultSet.getString("gender"));
			student.setAccCreatedAt(resultSet.getTimestamp("acc_created_at"));
			student.setAccUpdatedAt(resultSet.getTimestamp("last_update"));

			allStudents.add(student);

		}

		closeAll(connection, preparedStatement, resultSet);
		return allStudents;
	}

	private Student getStudentByRollNo(int rollNo) throws SQLException {

		String sql = "select * from student where roll_no = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setInt(1, rollNo);

		ResultSet resultSet = preparedStatement.executeQuery();
		Student student = null;
		if (resultSet.next()) {
			student = new Student();
			student.setFirstName(resultSet.getString("first_name"));
			student.setLastName(resultSet.getString("last_name"));
			student.setRollNo(resultSet.getInt("roll_no"));
			student.setGender(resultSet.getString("gender"));
			student.setAccCreatedAt(resultSet.getTimestamp("acc_created_at"));
			student.setAccUpdatedAt(resultSet.getTimestamp("last_update"));
		}
		
		closeAll(null, preparedStatement, resultSet);

		return student;

	}

	public boolean deleteStudent(int rollNo) throws Exception {

		// Step 1: CHeck whether the student with rollNo exists or not?
		Student dbStudent = getStudentByRollNo(rollNo);

		// if student not exists then throw error
		if (dbStudent == null) {
			closeAll(connection, null, null);
			throw new Exception("Student with roll no = " + rollNo + " not found");
		}

		String sql = "delete from student where roll_no = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setInt(1, rollNo);

		int result = preparedStatement.executeUpdate();

		closeAll(connection, preparedStatement, null);
		if (result > 0) {
			return true;
		}

		return false;
	}

	private void closeAll(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet)
			throws SQLException {

		if (connection != null) {
			connection.close();
		}
		if (preparedStatement != null) {
			preparedStatement.close();
		}
		if (resultSet != null) {
			resultSet.close();
		}
	}

}