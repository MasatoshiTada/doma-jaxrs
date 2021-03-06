package com.example.service;

import com.example.dao.EmployeeDao;
import com.example.entity.Employee;
import com.example.resource.dto.EmployeeDto;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by tada on 2015/10/12.
 */
//@Dependent
@Stateless
public class EmployeeService implements Serializable {
    @Inject
    private EmployeeDao employeeDao;

//    @Transactional(Transactional.TxType.REQUIRED)
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Optional<EmployeeDto> selectById(Integer empId) {
        Optional<Employee> employeeOptional = employeeDao.selectById(empId);
        return employeeOptional.map(this::convertToDto);
    }

//    @Transactional(Transactional.TxType.REQUIRED)
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<EmployeeDto> selectLikeName(String name) {
        List<Employee> list = employeeDao.selectLikeName("%" + name + "%");
        return list.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private EmployeeDto convertToDto(Employee employee) {
        EmployeeDto dto = new EmployeeDto();
        dto.setEmpId(employee.empId);
        dto.setName(employee.name);
        dto.setJoinedDate(employee.joinedDate);
        dto.getDepartmentDto().setDeptId(employee.deptId);
        dto.getDepartmentDto().setName(employee.deptName);
        return dto;
    }
}
