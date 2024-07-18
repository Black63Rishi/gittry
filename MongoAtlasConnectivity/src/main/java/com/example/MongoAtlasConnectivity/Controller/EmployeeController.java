package com.example.MongoAtlasConnectivity.Controller;

import com.example.MongoAtlasConnectivity.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
    @Autowired
    public EmployeeService service;
    public Employee saveEmployee(@RequestBody Employee employee){
        return service.insertEmployee(employee);
    }
}
