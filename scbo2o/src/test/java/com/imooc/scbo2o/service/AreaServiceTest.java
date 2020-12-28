package com.imooc.scbo2o.service;

import com.imooc.scbo2o.entity.Area;
import com.imooc.scbo2o.service.impl.AreaServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author Jiusen Guo
 * @Date 2020/11/25 16:29
 * @Description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceTest {

    @Autowired
    private AreaServiceImpl areaService;
    @Autowired
    private CacheService cacheService;

    @Test
    public void testQueryArea() {
        List<Area> areaList = areaService.getAreaList();
        System.out.println(areaList.size() + "+++++");
        cacheService.removeFromCache(areaService.AREALISTKEY);
        areaList = areaService.getAreaList();
    }
}
