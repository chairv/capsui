package com.capsui.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capsui.bean.Temp;
import com.capsui.bean.TempFlow;
import com.capsui.dao.mapper.TempFlowMapper;
import com.capsui.service.TempFlowService;

/**
 * Created by tancw on 2016/6/22.
 */
@Service
public class TempFlowServiceImpl implements TempFlowService {
	@Autowired
	private TempFlowMapper mapper;

	@Override
	public int saveOrUpdate(TempFlow flow) {
		TempFlow oldFlow = mapper.select(flow);
		if (oldFlow != null) {
			flow.setId(oldFlow.getId());
			return mapper.update(flow);
		} else {
			return mapper.save(flow);
		}
	}

	@Override
	public List<Temp> list() {
		return mapper.list();
	}
}
