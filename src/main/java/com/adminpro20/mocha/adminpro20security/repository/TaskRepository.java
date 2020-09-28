package com.adminpro20.mocha.adminpro20security.repository;

import com.adminpro20.mocha.adminpro20security.model.Task;
import com.adminpro20.mocha.adminpro20security.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
