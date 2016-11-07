package com.monespace.DAO;

import java.util.List;

import com.monespace.model.UserBillingAddress;
import com.monespace.model.UserDetail;
import com.monespace.model.UserPermanentAddress;

public interface UserDAO {

	public void saveOrUpdate(UserDetail userDetail);
	public List<UserDetail> listDetail();
	public void saveOrUpdateUserPermanentAddress(UserPermanentAddress userPermanentAddress);
	public void saveOrUpdateUserBillingAddress(UserBillingAddress userBillingAddress);
	
}
