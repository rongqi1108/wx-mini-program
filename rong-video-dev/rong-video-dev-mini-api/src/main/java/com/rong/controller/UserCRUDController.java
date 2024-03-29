package com.rong.controller;

import com.rong.pojo.Users;
import com.rong.service.crud.UserCRUDService;
import com.rong.utils.RongJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/crud")
public class UserCRUDController {
	
	@Autowired
	private UserCRUDService userCRUDService;
	
	@RequestMapping("/save")
	public RongJSONResult save() {
		
		Users user = new Users("1001", "test-saveuser-1001",
				"123456", "/path", "戎旗", null, null, null);
		userCRUDService.saveUser(user);
		
		return RongJSONResult.ok();
	}
	
	@RequestMapping("/update")
	public RongJSONResult update() {
		
		Users user = new Users("1001", "test-saveuser-1111",
				"77777", "/path000", "好牛~", null, null, null);
		userCRUDService.updateUser(user);
		
		return RongJSONResult.ok();
	}
	
	@RequestMapping("/update2")
	public RongJSONResult update2() {
		
		Users user = new Users("1001", null,
				"9999", "/path000999", "牛~", null, null, null);
		userCRUDService.updateUser(user);
		
		return RongJSONResult.ok();
	}
	
	@RequestMapping("/delUser")
	public RongJSONResult delUser() {
		
		userCRUDService.delete();
		
		return RongJSONResult.ok();
	}
}
