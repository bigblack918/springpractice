package com.leo.springpractice.repository;

import org.springframework.data.repository.CrudRepository;
import com.leo.springpractice.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
