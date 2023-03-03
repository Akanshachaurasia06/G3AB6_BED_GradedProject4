package com.graded.employeeService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graded.employeeService.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
