package com.zuodexin.po;

import com.zuodexin.po.itf.Refreshable;

// Generated 2016-5-27 11:22:51 by Hibernate Tools 4.0.0

/**
 * Instruct generated by hbm2java
 */
public class Instruct implements java.io.Serializable,Refreshable {

	private int id;
	private Course course;
	private Professor professor;

	public Instruct() {
	}

	public Instruct(int id, Course course, Professor professor) {
		this.id = id;
		this.course = course;
		this.professor = professor;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Professor getProfessor() {
		return this.professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
