package com.ceylanyildirim.service.impl;

import com.ceylanyildirim.dto.DtoDepartment;
import com.ceylanyildirim.dto.DtoEmployee;
import com.ceylanyildirim.exception.BaseException;
import com.ceylanyildirim.exception.ErrorMessage;
import com.ceylanyildirim.exception.MessageType;
import com.ceylanyildirim.model.Department;
import com.ceylanyildirim.model.Employee;
import com.ceylanyildirim.repository.EmployeeRepository;
import com.ceylanyildirim.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee findEmployeeById(Long id)  {
        DtoEmployee dtoEmployee= new DtoEmployee();
        DtoDepartment dtoDepartment=new DtoDepartment();



        Optional<Employee> optional= employeeRepository.findById(id);
        if(optional.isEmpty()) {
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST,id.toString()));
        }
        Employee employee= optional.get();
        Department department=employee.getDepartment();

        //dto a cevır
        BeanUtils.copyProperties(employee,dtoEmployee);
        BeanUtils.copyProperties(department,dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);
        return dtoEmployee;
    }
}
