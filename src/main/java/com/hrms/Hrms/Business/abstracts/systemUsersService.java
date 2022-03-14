package com.hrms.Hrms.Business.abstracts;

import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Entities.Concretes.systemUsers;

import java.util.List;

public interface systemUsersService {
    DataResult<List<systemUsers>> getAll();

}
