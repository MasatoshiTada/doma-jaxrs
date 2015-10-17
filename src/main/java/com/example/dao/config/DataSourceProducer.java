package com.example.dao.config;

import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.MysqlDialect;

import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.sql.DataSource;
import java.io.Serializable;

/**
 * Created by tada on 2015/10/17.
 */
@Dependent
public class DataSourceProducer implements Serializable {

    @Resource(lookup = "jdbc/sandbox")
    private DataSource dataSource;

    private Dialect dialect = new MysqlDialect();

    @Produces
    public DataSource getDataSource() {
        return dataSource;
    }

    @Produces
    public Dialect getDialect() {
        return dialect;
    }
}
