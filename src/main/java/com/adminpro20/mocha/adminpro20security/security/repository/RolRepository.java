package com.adminpro20.mocha.adminpro20security.security.repository;

import com.adminpro20.mocha.adminpro20security.security.entity.Rol;
import com.adminpro20.mocha.adminpro20security.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
