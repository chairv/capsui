package com.capsui.dao;

import java.util.List;
import java.util.Map;

/**
 * Created by tancw on 2016/6/23.
 */
public interface BaseDao<T> {
	int save(T t);

	void delete(T t);

	T get(long id);

	List<T> list(T t);

	int update(T t);

	int getCount(Map<String, Object> map);

}
