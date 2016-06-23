package com.capsui.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.capsui.bean.Temp;
import com.capsui.dao.BaseDao;
import com.capsui.dao.MybatisDao;

/**
 * Created by tancw on 2016/6/23.
 */
@MybatisDao
public interface TempMapper extends BaseDao<Temp>{
    int save(Temp temp);

    Temp selectByTitleContent(@Param("title") String title, @Param("content") String content);

    List<Temp> select(Map<String, Object> param);
}
