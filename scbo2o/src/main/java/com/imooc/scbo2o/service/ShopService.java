package com.imooc.scbo2o.service;


import com.imooc.scbo2o.dto.ImageHolder;
import com.imooc.scbo2o.dto.ShopExecution;
import com.imooc.scbo2o.entity.Shop;
import com.imooc.scbo2o.exceptions.ShopOperationException;

/**
 * @Author Jiusen Guo
 * @Date 2020/11/27 9:41
 * @Description
 */
public interface ShopService {

    /**
     * 新增店铺
     *
     * @param shop
     * @param thunbnail
     * @return
     */
    ShopExecution addShop(Shop shop, ImageHolder thunbnail) throws ShopOperationException;

    /**
     * 通过店铺id获取店铺信息
     *
     * @param shopId
     * @return
     */
    Shop getByShopId(long shopId);

    /**
     * 更新店铺信息，包括对图片的处理
     *
     * @param shop
     * @param thunbnail
     * @return
     */
    ShopExecution modifyShop(Shop shop, ImageHolder thunbnail) throws ShopOperationException;

    /**
     * 根据shopCondition分页返回相应店铺列表
     *
     * @param shopCondition 条件
     * @param pageIndex 页码 1 2 3...
     * @param pageSize  每页的条数
     * @return
     */
    public ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);
}
