package com.example.dao.datasource;

import com.example.dao.qualifier.DerbyQualifier;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.sql.DataSource;

/**
 * Created by tada on 2015/10/15.
 */
@ApplicationScoped
@DerbyQualifier
public class DerbyDataSourceProducer implements DataSourceProducer {

    @Resource(name = "jdbc__default")
    private DataSource dataSource;

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }
}
