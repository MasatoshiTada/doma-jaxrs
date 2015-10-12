package com.example.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Column;
import java.util.Date;

/**
 * Created by tada on 2015/10/12.
 */
@Entity
public class Employee {
    @Id
    @Column(name = "emp_id")
    public Integer empId;

    @Column
    public String name;

    @Column(name = "joined_date")
    public Date joinedDate;

    @Column(name = "dept_id")
    public Integer deptId;

    @Column(name = "dept_name")
    public String deptName;

}
