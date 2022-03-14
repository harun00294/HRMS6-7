package com.hrms.Hrms.dataAccess.abstracts;

import com.hrms.Hrms.Entities.Concretes.jobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jobPositionDto extends JpaRepository<jobPosition,Integer> {
}
