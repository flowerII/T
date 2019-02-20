package cn.qianshu.yan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.qianshu.yan.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findByName(String string);

}
