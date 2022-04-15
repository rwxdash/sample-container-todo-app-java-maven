package com.tolgatakir.todo.repository;

import com.tolgatakir.todo.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author tolgatakir
 */
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
    List<TodoEntity> findByCompletedIsTrue();
}
