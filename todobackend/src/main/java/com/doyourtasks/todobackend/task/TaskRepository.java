package com.doyourtasks.todobackend.task;

import org.springframework.data.repository.ListCrudRepository;

public interface TaskRepository extends ListCrudRepository<Task, Integer> { }
