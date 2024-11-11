package com.ceylanyildirim.controller;

import com.ceylanyildirim.dto.DtoEmployee;
import com.ceylanyildirim.model.RootEntity;

public interface RestEmployeeController {
    public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
