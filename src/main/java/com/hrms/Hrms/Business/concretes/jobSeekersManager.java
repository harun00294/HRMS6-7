package com.hrms.Hrms.Business.concretes;

import com.hrms.Hrms.Business.abstracts.jobSeekersService;
import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.Result;
import com.hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.hrms.Hrms.Entities.Concretes.jobSeekers;
import com.hrms.Hrms.dataAccess.abstracts.jobSeekersDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobSeekersManager implements jobSeekersService {

    @Autowired
    public jobSeekersManager(jobSeekersDto jobSeekersdto) {
        super();
        this.jobSeekersdto = jobSeekersdto;
    }

    private jobSeekersDto jobSeekersdto;


    @Override
    public Result add(jobSeekers jobSeekers) {
        this.jobSeekersdto.save(jobSeekers);
        return new SuccessDataResult("Başarıyla Eklendi");
    }

    @Override
    public DataResult<List<jobSeekers>> getAll() {

        return new SuccessDataResult<>(this.jobSeekersdto.findAll(),"Data Listelendi");
    }
}
