package com.monespace.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserRole {

	@Id
	private int userId;
	private String roleId;

	@OneToOne
	@JoinColumn(name = "userId", nullable = false, insertable = false, updatable = false)
	private UserDetails userDetails;

	@OneToOne
	@JoinColumn(name = "roleId", nullable = false, insertable = false, updatable = false)
	private Role role;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
