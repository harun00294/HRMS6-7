package com.hrms.Hrms.Business.abstracts;

import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.Result;
import com.hrms.Hrms.Entities.Concretes.employer;

import java.util.List;


public interface employerService {
    Result add(employer employer);
    DataResult<List<employer>> getAll();
}
