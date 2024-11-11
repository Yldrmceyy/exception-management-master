package com.ceylanyildirim.exception_management;

import com.ceylanyildirim.dto.DtoEmployee;
import com.ceylanyildirim.service.IEmployeeService;
import com.ceylanyildirim.starter.ExceptionManagementStarter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;

	@BeforeEach
	public void beforeEach(){
		System.out.println("beforeEach çalıştı.");
	}


	@Test
	public void testFindEmployeeById() {
		DtoEmployee employee=employeeService.findEmployeeById(2L);
//		if(employee!=null){
//			System.out.println("İsim: " + employee.getName());
//		}
		assertNotNull(employee);
	}


	@AfterEach
	public  void afterEach(){
		System.out.println("AfterEach çalıştı");
	}
}
