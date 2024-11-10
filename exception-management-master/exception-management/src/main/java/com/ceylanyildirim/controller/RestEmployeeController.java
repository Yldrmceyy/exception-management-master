package com.ceylanyildirim.controller;

import com.ceylanyildirim.dto.DtoEmployee;

public interface RestEmployeeController {
    public DtoEmployee findEmployeeById(Long id);
}
