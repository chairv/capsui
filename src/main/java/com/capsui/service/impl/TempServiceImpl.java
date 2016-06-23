package com.capsui.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capsui.bean.Temp;
import com.capsui.dao.mapper.TempMapper;
import com.capsui.service.TempService;

/**
 * Created by tancw on 2016/6/23.
 */
@Service
public class TempServiceImpl implements TempService {
	@Autowired
	private TempMapper tempMapper;

	@Override
	public int save(Temp temp) {
		return tempMapper.save(temp);
	}

	@Override
	public Temp selectByTitleContent(String title, String content) {
		return tempMapper.selectByTitleContent(title, content);
	}

	@Override
	public List<Temp> list(Map<String, Object> param) {
		return tempMapper.select(param);
	}

	@Override
	public int count(Map<String, Object> param) {
		return tempMapper.getCount(param);
	}

}
