package com.capsui.dao.mapper;

import java.util.List;

import com.capsui.bean.Temp;
import com.capsui.bean.TempFlow;
import com.capsui.dao.MybatisDao;

/**
 * Created by tancw on 2016/6/22.
 */
@MybatisDao
public interface TempFlowMapper {
    TempFlow select(TempFlow flow);

    int update(TempFlow flow);

    int save(TempFlow flow);

    List<Temp> list();
}
