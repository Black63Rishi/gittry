package com.example.demo.repositories;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepositories extends JpaRepository<Employee,Integer> {

}
