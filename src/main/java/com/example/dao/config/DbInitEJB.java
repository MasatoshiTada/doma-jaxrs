package com.example.dao.config;

import com.example.dao.EmployeeDao;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 * Created by tada on 2015/10/17.
 */
//@Singleton
//@Startup
public class DbInitEJB {

    @Inject
    private EmployeeDao employeeDao;

    /**
     * MySQLだと
     * 「The command cannot be executed when global transaction is in the  ACTIVE state」
     * と怒られる。
     */
    @PostConstruct
    public void init() {
        employeeDao.create();
    }
}
