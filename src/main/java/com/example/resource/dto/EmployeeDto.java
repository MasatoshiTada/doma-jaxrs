package com.example.resource.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by tada on 2015/10/12.
 */
public class EmployeeDto implements Serializable {
    @JsonProperty("emp_id")
    private Integer empId;

    private String name;

    @JsonProperty("joined_date")
    private Date joinedDate;

    @JsonProperty("department")
    private DepartmentDto departmentDto = new DepartmentDto();

    /**
     * @return the empId
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the joinedDate
     */
    public Date getJoinedDate() {
        return joinedDate;
    }

    /**
     * @param joinedDate the joinedDate to set
     */
    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    /**
     * @return the department
     */
    public DepartmentDto getDepartmentDto() {
        return departmentDto;
    }

    /**
     * @param departmentDto the department to set
     */
    public void setDepartmentDto(DepartmentDto departmentDto) {
        this.departmentDto = departmentDto;
    }

}
