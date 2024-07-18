package com.example.MongoAtlasConnectivity.Repository;

import com.example.MongoAtlasConnectivity.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositories extends MongoRepository<Employee,String> {

}
