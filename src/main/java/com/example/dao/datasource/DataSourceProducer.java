package com.example.dao.datasource;

import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.StandardDialect;

import javax.sql.DataSource;

/**
 * Created by tada on 2015/10/15.
 */
public interface DataSourceProducer {
    DataSource getDataSource();

    default Dialect getDialect() {
        return new StandardDialect();
    }
}
