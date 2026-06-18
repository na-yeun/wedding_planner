package com.weddingplanner.todo.repository;

import java.util.List;

import com.weddingplanner.todo.domain.TodoItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TodoItemRepository extends MongoRepository<TodoItem, String> {

    List<TodoItem> findByOwnerIdOrPartnerIdOrderByCompletedAscPriorityDesc(String ownerId, String partnerId);
}
