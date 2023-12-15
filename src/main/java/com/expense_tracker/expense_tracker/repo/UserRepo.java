package com.expense_tracker.expense_tracker.repo;

import com.expense_tracker.expense_tracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
