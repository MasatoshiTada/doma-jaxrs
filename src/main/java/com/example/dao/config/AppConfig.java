package com.example.dao.config;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.sql.DataSource;

/**
 * Created by tada on 2015/10/12.
 */
@ApplicationScoped
public class AppConfig implements Config {

    @Inject
    private DataSource dataSource;

    @Inject
    private Dialect dialect;

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

}
