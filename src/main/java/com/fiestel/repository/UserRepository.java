package com.fiestel.repository;

import com.fiestel.domain.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UserRepository extends CrudRepository<User, Long>{
    User findByEmail(String email);
}
