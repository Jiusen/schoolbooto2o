package com.imooc.scbo2o.dao;

import com.imooc.scbo2o.entity.LocalAuth;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
 * @Author Jiusen Guo
 * @Date 2020/12/18 14:09
 * @Description
 */
public interface LocalAuthDao {

    /**
     * 通过账号和密码查询对应信息，登录用
     *
     * @param username
     * @param password
     * @return
     */
    LocalAuth queryLocalByUserNameAndPwd(@Param("username")String username, @Param("password")String password);

    /**
     * 通过用户id查询对应localAuth
     *
     * @param userId
     * @return
     */
    LocalAuth queryLocalByUserId(@Param("userId")Long userId);

    /**
     * 添加平台账号
     *
     * @param localAuth
     * @return
     */
    int insertLocalAuth(LocalAuth localAuth);

    /**
     * 更新账号信息
     * @param userId
     * @param username
     * @param password
     * @param newPassword
     * @param lastEditTime
     * @return
     */
    int updateLocalAuth(@Param("userId") Long userId, @Param("username") String username,
                        @Param("password") String password, @Param("newPassword") String newPassword,
                        @Param("lastEditTime")Date lastEditTime);
}