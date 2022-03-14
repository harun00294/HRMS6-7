package com.hrms.Hrms.dataAccess.abstracts;

import com.hrms.Hrms.Entities.Concretes.verification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface verificationDto extends JpaRepository<verification,Integer> {
}
