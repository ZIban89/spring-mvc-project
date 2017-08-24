package by.htp.nikonov.task02.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	
	@NotNull(message="is required")
	@Size(min = 1, message = "is required")
	private String username;
	
	@NotNull(message="is required")
	@Size(min = 1, message = "is required")
	private String password;
	
	private boolean sex;
	
	@NotNull(message="is required")
	@Min(value=18, message="You are so young")
	private Integer age;
	
	public User() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

	
}
