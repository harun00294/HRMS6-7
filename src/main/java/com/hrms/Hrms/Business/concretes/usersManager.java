package com.hrms.Hrms.Business.concretes;

import com.hrms.Hrms.Business.abstracts.usersService;
import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.hrms.Hrms.Entities.Concretes.users;
import com.hrms.Hrms.dataAccess.abstracts.usersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usersManager implements usersService {

    @Autowired
    public usersManager(usersDto usersdto) {
        super();
        this.usersdto = usersdto;
    }

    private usersDto usersdto;

    @Override
    public DataResult<List<users>> getAll() {

        return new SuccessDataResult<>(this.usersdto.findAll(),"Data Listelendi");
    }
}
