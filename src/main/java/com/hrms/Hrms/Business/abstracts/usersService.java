package com.hrms.Hrms.Business.abstracts;

import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Entities.Concretes.users;

import java.util.List;

public interface usersService {
    DataResult<List<users>> getAll();
}
