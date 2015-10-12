package com.example.dao.config;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.MysqlDialect;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.sql.DataSource;

/**
 * Created by tada on 2015/10/12.
 */
//@Named("config")
@ApplicationScoped
public class AppConfig implements Config {

    @Resource(name = "jdbc/mariaTest")
    private DataSource dataSource;

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public Dialect getDialect() {
        return new MysqlDialect();
    }


}
