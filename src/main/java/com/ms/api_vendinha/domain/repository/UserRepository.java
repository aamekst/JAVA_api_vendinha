package com.ms.api_vendinha.domain.repository;

import com.ms.api_vendinha.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    
}
