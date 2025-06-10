package com.springcrud.Spring.Boot.Crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.Spring.Boot.Crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository <Employee , Long> {

}
