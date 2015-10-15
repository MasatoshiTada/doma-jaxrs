package com.example.dao.config;

import com.example.dao.datasource.DataSourceProducer;
import com.example.dao.qualifier.DerbyQualifier;
import com.example.exception.dto.ExceptionDto;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.MysqlDialect;

import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

/**
 * Created by tada on 2015/10/12.
 */
@ApplicationScoped
public class AppConfig implements Config {

    @Inject
    @DerbyQualifier
    private DataSourceProducer dataSourceProducer;

    @Override
    public DataSource getDataSource() {
        return dataSourceProducer.getDataSource();
    }

    @Override
    public Dialect getDialect() {
        return dataSourceProducer.getDialect();
    }


}
