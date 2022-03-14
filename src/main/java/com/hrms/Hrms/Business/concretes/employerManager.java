package com.hrms.Hrms.Business.concretes;

import com.hrms.Hrms.Business.abstracts.employerService;
import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.Result;
import com.hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.hrms.Hrms.Entities.Concretes.employer;
import com.hrms.Hrms.dataAccess.abstracts.employerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.List;

@Service
public class employerManager implements employerService {

    @Autowired
    public employerManager(com.hrms.Hrms.dataAccess.abstracts.employerDto employerDto) {
        this.employerDto = employerDto;
    }

    private employerDto employerDto;

    @Override
    public Result add(employer employer) {
        this.employerDto.save(employer);
        return new SuccessDataResult("Eklendi");
    }

    @Override
    public DataResult<List<employer>> getAll() {
        return new SuccessDataResult<List<employer>>(this.employerDto.findAll(),"Data Listelendi");
    }
}
