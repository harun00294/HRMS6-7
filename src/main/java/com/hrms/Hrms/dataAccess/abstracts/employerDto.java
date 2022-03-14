package com.hrms.Hrms.dataAccess.abstracts;

import com.hrms.Hrms.Entities.Concretes.employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface employerDto extends JpaRepository<employer,Integer> {

}