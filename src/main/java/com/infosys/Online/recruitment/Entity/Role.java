package com.infosys.Online.recruitment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Role {

	@Id
	private int roleId;
	private String roleTitle;
	private String roleDesc;
	
	@OneToOne(mappedBy = "role" )
	private User user;

	public Role() { 	
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(int roleId, String roleTitle, String roleDesc, User user) {
		super();
		this.roleId = roleId;
		this.roleTitle = roleTitle;
		this.roleDesc = roleDesc;
		this.user = user;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleTitle() {
		return roleTitle;
	}

	public void setRoleTitle(String roleTitle) {
		this.roleTitle = roleTitle;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleTitle=" + roleTitle + ", roleDesc=" + roleDesc + ", user=" + user
				+ "]";
	}
	
	
}
