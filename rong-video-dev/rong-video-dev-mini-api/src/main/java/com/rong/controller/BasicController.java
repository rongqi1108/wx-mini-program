package com.rong.controller;

import com.rong.utils.RedisOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
	
	@Autowired
	public RedisOperator redis;
	
	public static final String USER_REDIS_SESSION = "user-redis-session";
	
	// 文件保存的命名空间
	public static final String FILE_SPACE = " /Users/rong/rong-video-dev";

	// ffmpeg所在目录
	public static final String FFMPEG_EXE = "/usr/local/Cellar/ffmpeg/4.4_2/bin/ffmpeg";
	
	// 每页分页的记录数
	public static final Integer PAGE_SIZE = 5;
	
}
