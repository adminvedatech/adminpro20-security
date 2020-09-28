package com.adminpro20.mocha.adminpro20security.service.task;

import com.adminpro20.mocha.adminpro20security.model.Task;
import com.adminpro20.mocha.adminpro20security.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImp implements TaskService {

    public final TaskRepository taskRepository;

    public TaskServiceImp(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    @Override
    public List<Task> findAll() {
        return (List<Task>) this.taskRepository.findAll();
    }

    @Override
    public Optional<Task> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public Task save(Task object) {
        return taskRepository.save(object);
    }

    @Override
    public void delete(Task object) {
        taskRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void saveAll(List<Task> object) {

    }
}
