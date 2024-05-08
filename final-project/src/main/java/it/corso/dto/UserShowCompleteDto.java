package it.corso.dto;

import java.util.List;

public class UserShowCompleteDto {

	private String name;

	private String surname;

	private String email;

	private String password;

	private List<RoleShowDto> roleList;

	private List<CourseShowDto> courseList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<RoleShowDto> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<RoleShowDto> roleList) {
		this.roleList = roleList;
	}

	public List<CourseShowDto> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<CourseShowDto> courseList) {
		this.courseList = courseList;
	}

}
