package com.ft.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class User implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="birthday")
	private Date birthday;
	
	@Column(name="usernum")
	private int usernum;
	
	@Column(name="member_id")
	private int memberId;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", birthday=" + birthday + ", usernum=" + usernum + ", memberId=" + memberId + "]";
	}
	
}
