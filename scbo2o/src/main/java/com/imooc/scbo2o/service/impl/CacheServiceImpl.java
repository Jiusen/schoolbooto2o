package com.imooc.scbo2o.service.impl;

import com.imooc.scbo2o.cache.JedisUtil;
import com.imooc.scbo2o.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @Author Jiusen Guo
 * @Date 2020/12/18 10:57
 * @Description
 */
@Service
public class CacheServiceImpl implements CacheService {

    @Autowired
    private JedisUtil.Keys jedisKeys;

    @Override
    public void removeFromCache(String keyPrefix) {
        Set<String> keySet = jedisKeys.keys(keyPrefix + "*");
        for (String key : keySet) {
            jedisKeys.del(key);
        }
    }
}
