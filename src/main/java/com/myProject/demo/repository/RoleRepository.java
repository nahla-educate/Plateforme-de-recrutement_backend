package com.myProject.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myProject.demo.model.ERole;
import com.myProject.demo.model.Role;

@Repository
  public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
  }
  

