package com.example.dao;

import com.example.dao.config.InjectConfig;
import com.example.entity.Employee;
import org.seasar.doma.Dao;
import org.seasar.doma.Script;
import org.seasar.doma.Select;

import java.util.List;
import java.util.Optional;

/**
 * Created by tada on 2015/10/12.
 */
@Dao
@InjectConfig
public interface EmployeeDao {

    @Script
    void create();

    @Select
    Optional<Employee> selectById(Integer empId);

    @Select
    List<Employee> selectLikeName(String name);
}
