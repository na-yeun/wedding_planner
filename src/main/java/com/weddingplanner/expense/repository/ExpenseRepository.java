package com.weddingplanner.expense.repository;

import java.util.List;

import com.weddingplanner.expense.domain.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ExpenseRepository extends MongoRepository<Expense, String> {

    List<Expense> findByOwnerIdOrPartnerId(String ownerId, String partnerId);
}
