package com.imooc.scbo2o.config.dao;

import com.imooc.scbo2o.util.DESUtil;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.beans.PropertyVetoException;

/**
 * @Author Jiusen Guo
 * @Date 2020/12/25 16:26
 * @Description 配置DataSource到IOC容器里面
 */
@Configuration
//配置mybatis mapper的扫描路径
@MapperScan("com.imooc.scbo2o.dao")
public class DataSourceConfiguration {

    @Value("${jdbc.driver}")
    private String jdbcDriver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String jdbcUsername;

    @Value("${jdbc.password}")
    private String jdbcpassword;

    /**
     * 生成与spring-dao.xml对应的bean dataSource
     * @return
     */
    @Bean(name = "dataSource")
    public ComboPooledDataSource createDataSource() throws PropertyVetoException {
        //生成 datasource 实例
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //跟配置文件一样设置以下信息
        //驱动
        dataSource.setDriverClass(jdbcDriver);
        //数据库链接URL
        dataSource.setJdbcUrl(url);
        //设置用户名
        dataSource.setUser(DESUtil.getDecryptString(jdbcUsername));
        //设置用户名
        dataSource.setPassword(DESUtil.getDecryptString(jdbcpassword));

        //配置C3P0连接的私有属性
        //连接池最大线程数
        dataSource.setMaxPoolSize(30);
        //连接池最小线程数
        dataSource.setMinPoolSize(30);
        //关闭连接后不自动commit
        dataSource.setAutoCommitOnClose(false);
        //连接超时时间
        dataSource.setCheckoutTimeout(10000);
        //连接失败重试次数
        dataSource.setAcquireRetryAttempts(2);

        return dataSource;
    }
}
