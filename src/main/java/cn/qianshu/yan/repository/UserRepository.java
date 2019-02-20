package cn.qianshu.yan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.qianshu.yan.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
	User findByUsername(String username);
	
}