package com.hrms.Hrms.dataAccess.abstracts;

import com.hrms.Hrms.Entities.Concretes.systemUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface systemUsersDto extends JpaRepository<systemUsers,Integer> {
}
