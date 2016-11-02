package com.monespace.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.monespace.DAOImpl.UserRegisterDAOImpl;
import com.monespace.model.User;
import com.monespace.model.UserDetail;

@Service
public class UserRegisterService {

	@Autowired
	private UserRegisterDAOImpl userRegisterDAOImpl;
	
	@Transactional
	public void saveOrUpdate (UserDetail userDetail) {
		userRegisterDAOImpl.saveOrUpdate(userDetail);
	}
	
	@Transactional
	public void saveOrUpdateUser (User user) {
		userRegisterDAOImpl.saveOrUpdateUser(user);
	}
}
