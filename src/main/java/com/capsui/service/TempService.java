package com.capsui.service;

import java.util.List;
import java.util.Map;

import com.capsui.bean.Temp;

/**
 * Created by tancw on 2016/6/23.
 */
public interface TempService {
    int save(Temp temp);

    Temp selectByTitleContent(String title, String content);

    List<Temp> list(Map<String, Object> param);

    int count(Map<String, Object> param);
}
