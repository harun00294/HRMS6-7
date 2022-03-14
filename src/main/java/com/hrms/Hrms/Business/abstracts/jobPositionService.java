package com.hrms.Hrms.Business.abstracts;

import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.Result;
import com.hrms.Hrms.Entities.Concretes.jobPosition;

import java.util.List;

public interface jobPositionService {

    Result add(jobPosition jobPosition);
    DataResult<List<jobPosition>> getAll();
}
