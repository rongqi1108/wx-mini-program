package com.rong.service.crud;

import com.rong.pojo.Users;

public interface UserCRUDService {
	
	
	public void saveUser(Users user);
	
	
	public void updateUser(Users user);
	
	public void updateUserExample(Users user);
	
	public void delete();
}
