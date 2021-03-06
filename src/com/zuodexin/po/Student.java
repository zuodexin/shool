package com.zuodexin.po;

// Generated 2016-5-27 11:22:51 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import com.zuodexin.po.itf.Refreshable;

/**
 * Student generated by hbm2java
 */
public class Student implements java.io.Serializable ,Refreshable{

	private int id;
	private String stuId;
	private String password;
	private String name;
	private Set<SelectCourse> selectCourses = new HashSet<SelectCourse>(0);
	private Set<JionClass> jionClasses = new HashSet<JionClass>(0);

	public Student() {
	}

	public Student(int id, String stuId, String password, String name) {
		this.id = id;
		this.stuId = stuId;
		this.password = password;
		this.name = name;
	}

	public Student(int id, String stuId, String password, String name,
			Set<SelectCourse> selectCourses, Set<JionClass> jionClasses) {
		this.id = id;
		this.stuId = stuId;
		this.password = password;
		this.name = name;
		this.selectCourses = selectCourses;
		this.jionClasses = jionClasses;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<SelectCourse> getSelectCourses() {
		return this.selectCourses;
	}

	public void setSelectCourses(Set<SelectCourse> selectCourses) {
		this.selectCourses = selectCourses;
	}

	public Set<JionClass> getJionClasses() {
		return this.jionClasses;
	}

	public void setJionClasses(Set<JionClass> jionClasses) {
		this.jionClasses = jionClasses;
	}

}
