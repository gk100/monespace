package com.monespace.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Role {

	@Id
	private int roleId;
	private int roleName;

	@OneToOne
	@JoinColumn(name = "roleId", nullable = false, insertable = false, updatable = false)
	private UserDetails userDetails;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getRoleName() {
		return roleName;
	}

	public void setRoleName(int roleName) {
		this.roleName = roleName;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
}
