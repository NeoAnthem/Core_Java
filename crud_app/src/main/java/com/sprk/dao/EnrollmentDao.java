package com.sprk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.sprk.model.Course;
import com.sprk.model.Enrollment;

public class EnrollmentDao {
	private Connection connection;

	public EnrollmentDao(Connection connection) throws Exception {
		if (connection == null) {
			throw new Exception("Please Pass Connection To Proceed");
		}
		this.connection = connection;
	}

	public void testConnection() {
		System.out.println("Connection Obj = " + connection);
	}
	
	public int insertEnrollment(int studentId, int courseId) throws SQLException {

		String sql = "insert into enrollment(student_id, course_id) VALUES (?, ?)";

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.setInt(1, studentId);
		preparedStatement.setInt(2, courseId);

		int result = preparedStatement.executeUpdate();

		closeAll(connection, preparedStatement, null);

		return result;
	}

	
	public List<Enrollment> getEnrollmentByStudent(int studentId) throws Exception {
        String sql = "SELECT * FROM enrollment WHERE student_id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, studentId);
        ResultSet rs = preparedStatement.executeQuery();
        List<Enrollment> allEnroll = new ArrayList<Enrollment>();
		while (rs.next()) {

			Enrollment enrollment = new Enrollment();
			enrollment.setCourseId(rs.getInt("course_id"));
			enrollment.setEnrollmentId(rs.getInt("enrollment_id"));
			enrollment.setStudentId(rs.getInt("student_id"));
			enrollment.setStatus(rs.getString("status"));
			allEnroll.add(enrollment);

		}

		closeAll(connection, preparedStatement, rs);
		return allEnroll;
     
    }
	
	
     
	public List<Enrollment> getAllEnrollments() throws SQLException {
        String sql = "SELECT e.enrollment_id, e.enrollment_date, e.status, " +
                     "s.id AS sid, s.first_name, s.last_name, " +
                     "c.id AS cid, c.course_name " +
                     "FROM enrollment e " +
                     "JOIN students s ON e.student_id = s.id " +
                     "JOIN course c  ON e.course_id  = c.id " +
                     "ORDER BY e.enrollment_id";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        List<Enrollment> list = new ArrayList<>();
        while (rs.next()) {
            Enrollment e = new Enrollment();
            e.setEnrollmentId(rs.getInt("enrollment_id"));
            e.setEnrollmentDate(rs.getTimestamp("enrollment_date"));
            e.setStatus(rs.getString("status"));
            e.setStudentId(rs.getInt("sid"));
            e.setStudentFirstName(rs.getString("first_name"));
            e.setStudentLastName(rs.getString("last_name"));
            e.setCourseId(rs.getInt("cid"));
            e.setCourseName(rs.getString("course_name"));
            list.add(e);
        }
        closeAll(connection, ps, rs);
        return list;
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