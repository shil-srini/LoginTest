package spring.beans;

import org.springframework.context.annotation.EnableMBeanExport;

@EnableMBeanExport
public class LoginBean {

	public LoginBean() {
		// TODO Auto-generated constructor stub
	}
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
