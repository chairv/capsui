package com.capsui.service;

import java.util.List;

import com.capsui.bean.Temp;
import com.capsui.bean.TempFlow;

/**
 * Created by tancw on 2016/6/22.
 */
public interface TempFlowService {
    int saveOrUpdate(TempFlow flow);

    List<Temp> list();
}
