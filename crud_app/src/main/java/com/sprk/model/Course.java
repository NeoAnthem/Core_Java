package com.sprk.model;

import java.sql.Timestamp;

public class Course {
	private int id;
	private String courseName;
	private String duration;
	private double fee;
	private Timestamp courseCreatedAt;
	private Timestamp CourseUpdatedAt;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String courseName, String duration, double fee) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}

	public Course(int id, String courseName, String duration, double fee, Timestamp courseCreatedAt,
			Timestamp courseUpdatedAt) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		this.courseCreatedAt = courseCreatedAt;
		CourseUpdatedAt = courseUpdatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Timestamp getCourseCreatedAt() {
		return courseCreatedAt;
	}

	public void setCourseCreatedAt(Timestamp courseCreatedAt) {
		this.courseCreatedAt = courseCreatedAt;
	}

	public Timestamp getCourseUpdatedAt() {
		return CourseUpdatedAt;
	}

	public void setCourseUpdatedAt(Timestamp courseUpdatedAt) {
		CourseUpdatedAt = courseUpdatedAt;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", duration=" + duration + ", fee=" + fee
				+ ", courseCreatedAt=" + courseCreatedAt + ", CourseUpdatedAt=" + CourseUpdatedAt + "]";
	}

}