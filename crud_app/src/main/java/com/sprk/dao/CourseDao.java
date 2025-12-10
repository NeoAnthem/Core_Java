package com.sprk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.sprk.model.Course;
import com.sprk.model.Student;

public class CourseDao {
	private Connection connection;

	public CourseDao(Connection connection) throws Exception {
		if (connection == null) {
			throw new Exception("Please Pass Connection To Proceed");
		}
		this.connection = connection;
	}

	public void testConnection() {
		System.out.println("Connection Obj = " + connection);
	}
	
	public int insertStudent(Course course) throws SQLException {

		String sql = "insert into course(course_name, duration, fee) values (?, ?, ?)";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setString(1, course.getCourseName());
		preparedStatement.setString(2, course.getDuration());
		preparedStatement.setDouble(3, course.getFee());

		int result = preparedStatement.executeUpdate();

		closeAll(connection, preparedStatement, null);

		return result;
	}
	
	public Course findByCourseId(int CourseId) throws SQLException {

		String sql = "select * from course where id = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setInt(1, CourseId);

		ResultSet resultSet = preparedStatement.executeQuery();
		Course course = null;
		if (resultSet.next()) {
			course = new Course();
			course.setCourseName(resultSet.getString("course_name"));
			course.setDuration(resultSet.getString("duration"));
			course.setFee(resultSet.getDouble("fee"));
			course.setId(resultSet.getInt("id"));
			course.setCourseCreatedAt(resultSet.getTimestamp("course_created_at"));
			course.setCourseUpdatedAt(resultSet.getTimestamp("course_updated_at"));
		}
		closeAll(connection, preparedStatement, resultSet);
		return course;
	
	}
	
	public List<Course> getAllCouses() throws SQLException {

		String sql = "select * from course";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		ResultSet resultSet = preparedStatement.executeQuery();

		List<Course> allCourse = new LinkedList<Course>();

		while (resultSet.next()) {

			Course course = new Course();
			course.setCourseName(resultSet.getString("course_name"));
			course.setDuration(resultSet.getString("duration"));
			course.setFee(resultSet.getDouble("fee"));
			course.setId(resultSet.getInt("id"));
			course.setCourseCreatedAt(resultSet.getTimestamp("course_created_at"));
			course.setCourseUpdatedAt(resultSet.getTimestamp("course_updated_at"));

			allCourse.add(course);

		}

		closeAll(connection, preparedStatement, resultSet);
		return allCourse;
	}


	public boolean deleteCourse(int couserId) throws Exception {

		Course dbCourse = findByCourseId(couserId);
		if (dbCourse == null) {
			closeAll(connection, null, null);
			throw new Exception("Course Id   = " + couserId + " not found");
		}

		String sql = "delete from course where id = ?";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setInt(1, couserId);

		int result = preparedStatement.executeUpdate();

		closeAll(connection, preparedStatement, null);
		if (result > 0) {
			return true;
		}

		return false;
	}

	public int updateCourse(int couserId, Course updatedCourse) throws Exception {

		Course dbCourse = findByCourseId(couserId);
		if (dbCourse == null) {
			closeAll(connection, null, null);
			throw new Exception("Course Id   = " + couserId + " not found");
		}
		PreparedStatement preparedStatement = null;
		int result ;
		try {
		String sql = "update course set course_name = ?, duration =?, fee=? where id = ?";

	    preparedStatement = connection.prepareStatement(sql);

		if (updatedCourse.getCourseName()== null || updatedCourse.getCourseName().isBlank()) {
			updatedCourse.setCourseName(dbCourse.getCourseName());
		}
		if (updatedCourse.getDuration() == null || updatedCourse.getDuration().isBlank()) {
			updatedCourse.setDuration(dbCourse.getDuration());
		}
		if (updatedCourse.getFee() <=0.0) {
		    updatedCourse.setFee(dbCourse.getFee());
		}
		preparedStatement.setString(1, updatedCourse.getCourseName());
		preparedStatement.setString(2, updatedCourse.getDuration());
		preparedStatement.setDouble(3, updatedCourse.getFee());
		preparedStatement.setInt(4, couserId);

		 result = preparedStatement.executeUpdate();
		}
		finally {
	        closeAll(connection, preparedStatement, null);
	    }


		return result;
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