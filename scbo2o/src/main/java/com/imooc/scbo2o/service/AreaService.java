package com.imooc.scbo2o.service;

import com.imooc.scbo2o.entity.Area;

import java.util.List;

/**
 * @Author Jiusen Guo
 * @Date 2020/11/25 15:16
 * @Description
 */
public interface AreaService {

    public static final String AREALISTKEY = "arealist";
    /**
     * 所有地区的列表， 优先从缓存中获取
     *
     * @return
     */
    List<Area> getAreaList();
}
