package com.example.service;

import com.example.dao.EmployeeDao;
import com.example.entity.Employee;
import com.example.resource.dto.EmployeeDto;

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
@Dependent
public class EmployeeService implements Serializable {
    @Inject
    private EmployeeDao employeeDao;

    @Transactional(Transactional.TxType.REQUIRED)
    public Optional<EmployeeDto> selectById(Integer empId) {
        Optional<Employee> employeeOptional = employeeDao.selectById(empId);
        return convertToOptionalDto(employeeOptional);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public List<EmployeeDto> selectLikeName(String name) {
        List<Employee> list = employeeDao.selectLikeName("%" + name + "%");
        return list.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    private Optional<EmployeeDto> convertToOptionalDto(Optional<Employee> employeeOptional) {
        return employeeOptional.map(employee -> {
            EmployeeDto dto = new EmployeeDto();
            dto.setEmpId(employee.empId);
            dto.setName(employee.name);
            dto.setJoinedDate(employee.joinedDate);
            dto.getDepartmentDto().setDeptId(employee.deptId);
            dto.getDepartmentDto().setName(employee.deptName);
            return dto;
        });
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
