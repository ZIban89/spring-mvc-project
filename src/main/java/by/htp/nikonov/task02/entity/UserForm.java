package by.htp.nikonov.task02.entity;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class UserForm {

	private Integer id;

	private String firstName;

	private String lastName;

	@Min(value = 3, message = "You are so young!")
	@Max(value = 130, message = "Are you still alive?")
	private Integer age;
	private Boolean sex;

	@Size(min = 3, message = "3 or more chars")
	private String login;

	@Size(min = 3, message = "3 or more chars")
	private String password;

	private String country;

	@Override
	public String toString() {
		return "UserForm [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", sex="
				+ sex + ", login=" + login + ", password=" + password + ", country=" + country + "]";
	}

	public UserForm() {
		super();
	}

	public UserForm(User user) {
		if (user != null) {
			id = user.getId();
			firstName = user.getFirstName();
			lastName = user.getLastName();
			age = user.getAge();
			sex = user.getSex();
			login = user.getLogin();
			password = user.getPassword();
			country = user.getCountry() == null ? null : user.getCountry().getName();
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
