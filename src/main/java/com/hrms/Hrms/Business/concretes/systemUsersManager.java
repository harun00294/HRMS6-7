package com.hrms.Hrms.Business.concretes;

import com.hrms.Hrms.Business.abstracts.systemUsersService;
import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.hrms.Hrms.Entities.Concretes.systemUsers;
import com.hrms.Hrms.dataAccess.abstracts.systemUsersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class systemUsersManager implements systemUsersService {

    @Autowired
    public systemUsersManager(systemUsersDto systemusersDto) {
        super();
        this.systemusersDto = systemusersDto;
    }

    private systemUsersDto systemusersDto;

    @Override
    public DataResult<List<systemUsers>> getAll() {

        return new SuccessDataResult<>(this.systemusersDto.findAll(),"Data Listelendi");
    }
}
