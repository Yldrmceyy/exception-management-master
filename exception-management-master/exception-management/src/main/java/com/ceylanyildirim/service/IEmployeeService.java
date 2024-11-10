package com.ceylanyildirim.service;

import com.ceylanyildirim.dto.DtoEmployee;
import com.ceylanyildirim.model.Employee;

public interface IEmployeeService {
    public DtoEmployee findEmployeeById(Long Id);
}
