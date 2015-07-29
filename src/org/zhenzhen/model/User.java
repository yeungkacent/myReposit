package org.zhenzhen.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//ʵ��
@javax.persistence.Entity
//����һ�ű�
@Table(name = "t_user")
public class User {

	private int id;
	private String username;
	private String password;
	private String email;
	private String nickname;
	
	@GeneratedValue
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
