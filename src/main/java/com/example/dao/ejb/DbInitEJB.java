package com.example.dao.ejb;

import com.example.dao.EmployeeDao;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 * Created by tada on 2015/10/15.
 */
@Singleton
@Startup
public class DbInitEJB {
    @Inject
    private EmployeeDao employeeDao;

    @PostConstruct
    public void init() {
        employeeDao.create();
    }
}
