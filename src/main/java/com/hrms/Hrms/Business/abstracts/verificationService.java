package com.hrms.Hrms.Business.abstracts;

import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Entities.Concretes.verification;

import java.util.List;

public interface verificationService {
    DataResult<List<verification>> getAll();
}
