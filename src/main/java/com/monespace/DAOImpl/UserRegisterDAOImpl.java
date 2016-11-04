package com.monespace.DAOImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.monespace.DAO.UserDAO;
import com.monespace.model.ShortList;
import com.monespace.model.User;
import com.monespace.model.UserBillingAddress;
import com.monespace.model.UserDetail;
import com.monespace.model.UserPermanentAddress;

@Repository
public class UserRegisterDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveOrUpdate(UserDetail userDetail) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		
		userDetail.getUserBillingAddress().setUserDetail(userDetail);
		userDetail.getUserPermanentAddress().setUserDetail(userDetail);
		userDetail.getUserRole().setUserDetail(userDetail);
		
		session.saveOrUpdate(userDetail.getUserBillingAddress());
		session.saveOrUpdate(userDetail.getUserPermanentAddress());
		session.saveOrUpdate(userDetail.getUserRole());
		session.saveOrUpdate(userDetail);
	}
	
	public void saveOrUpdateUser (User user) {
		Session session=sessionFactory.getCurrentSession();
		user.setEnabled(true);
		session.saveOrUpdate(user);
		ShortList shortList= new ShortList();
		shortList.setShortListId(user.getUserId());
		shortList.setUserId(user.getUserId());
		session.saveOrUpdate(shortList);
	}

	public List<UserDetail> listDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveOrUpdateUserPermanentAddress(UserPermanentAddress userPermanentAddress) {
		// TODO Auto-generated method stub
		
	}

	public void saveOrUpdateUserBillingAddress(UserBillingAddress userBillingAddress) {
		// TODO Auto-generated method stub
		
	}
	
}
