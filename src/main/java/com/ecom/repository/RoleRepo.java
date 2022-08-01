package com.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.entity.Role;

public interface RoleRepo extends JpaRepository<Role,Integer>{

	List<Role> findAll();

}
