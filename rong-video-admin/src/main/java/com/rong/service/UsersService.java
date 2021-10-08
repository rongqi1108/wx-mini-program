package com.rong.service;

import com.rong.pojo.Users;
import com.rong.utils.PagedResult;

public interface UsersService {

	public PagedResult queryUsers(Users user, Integer page, Integer pageSize);
	
}
