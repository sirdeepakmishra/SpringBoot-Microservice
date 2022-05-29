package com.micro.user.repository;

import com.micro.user.entity.User;
import com.micro.user.valueobject.ResponseTemplateVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserId(Long userId);
}
