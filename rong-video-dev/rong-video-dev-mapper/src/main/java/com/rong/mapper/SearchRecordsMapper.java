package com.rong.mapper;

import com.rong.pojo.SearchRecords;
import com.rong.utils.MyMapper;

import java.util.List;

public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
	
	public List<String> getHotwords();
}