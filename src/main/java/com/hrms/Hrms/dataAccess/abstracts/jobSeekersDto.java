package com.hrms.Hrms.dataAccess.abstracts;

import com.hrms.Hrms.Entities.Concretes.jobSeekers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jobSeekersDto extends JpaRepository<jobSeekers,Integer> {
}

