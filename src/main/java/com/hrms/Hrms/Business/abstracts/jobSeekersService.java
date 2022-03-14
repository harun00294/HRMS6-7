package com.hrms.Hrms.Business.abstracts;

import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.Result;
import com.hrms.Hrms.Entities.Concretes.jobSeekers;

import java.util.List;

public interface jobSeekersService {
    Result add(jobSeekers jobSeekers);
    DataResult<List<jobSeekers>> getAll();
}
