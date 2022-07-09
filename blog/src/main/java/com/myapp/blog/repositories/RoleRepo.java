package com.myapp.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myapp.blog.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
