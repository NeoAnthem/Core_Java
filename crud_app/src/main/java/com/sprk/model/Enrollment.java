package com.sprk.model;

import java.sql.Timestamp;

public class Enrollment {


	    private int enrollmentId;
	    private int studentId;
	    private int courseId;
	    private String status;
	    private String studentFirstName;
	    private String studentLastName;
	    private String courseName;
	    private Timestamp enrollmentDate;


	    public Enrollment() {}

	    public Enrollment(int studentId, int courseId) {
	        this.studentId = studentId;
	        this.courseId = courseId;
	        this.status = "ACTIVE";
	    }

	    public Enrollment(int enrollmentId, int studentId, int courseId, String status) {
	        this.enrollmentId = enrollmentId;
	        this.studentId = studentId;
	        this.courseId = courseId;
	        this.status = status;
	    }

		public int getEnrollmentId() {
			return enrollmentId;
		}

		public void setEnrollmentId(int enrollmentId) {
			this.enrollmentId = enrollmentId;
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStudentFirstName() {
			return studentFirstName;
		}

		public void setStudentFirstName(String studentFirstName) {
			this.studentFirstName = studentFirstName;
		}

		public String getStudentLastName() {
			return studentLastName;
		}

		public void setStudentLastName(String studentLastName) {
			this.studentLastName = studentLastName;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public Timestamp getEnrollmentDate() {
			return enrollmentDate;
		}

		public void setEnrollmentDate(Timestamp enrollmentDate) {
			this.enrollmentDate = enrollmentDate;
		}

		@Override
		public String toString() {
			return "Enrollment [enrollmentId=" + enrollmentId + ", studentId=" + studentId + ", courseId=" + courseId
					+ ", status=" + status + ", studentFirstName=" + studentFirstName + ", studentLastName="
					+ studentLastName + ", courseName=" + courseName + ", enrollmentDate=" + enrollmentDate + "]";
		}
}