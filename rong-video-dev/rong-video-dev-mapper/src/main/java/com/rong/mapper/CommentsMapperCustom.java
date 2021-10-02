package com.rong.mapper;

import com.rong.pojo.Comments;
import com.rong.pojo.vo.CommentsVO;
import com.rong.utils.MyMapper;

import java.util.List;

public interface CommentsMapperCustom extends MyMapper<Comments> {
	
	public List<CommentsVO> queryComments(String videoId);
}