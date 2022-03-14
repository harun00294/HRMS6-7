package com.hrms.Hrms.dataAccess.abstracts;

import com.hrms.Hrms.Entities.Concretes.users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usersDto extends JpaRepository<users,Integer> {
}

