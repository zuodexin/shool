package com.zuodexin.po;

import com.zuodexin.po.itf.Refreshable;

// Generated 2016-5-27 11:22:51 by Hibernate Tools 4.0.0

/**
 * JionClass generated by hbm2java
 */
public class JionClass implements java.io.Serializable ,Refreshable{

	private int id;
	private Student student;
	private Schoolclass schoolclass;

	public JionClass() {
	}

	public JionClass(int id, Student student, Schoolclass schoolclass) {
		this.id = id;
		this.student = student;
		this.schoolclass = schoolclass;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Schoolclass getSchoolclass() {
		return this.schoolclass;
	}

	public void setSchoolclass(Schoolclass schoolclass) {
		this.schoolclass = schoolclass;
	}

}
