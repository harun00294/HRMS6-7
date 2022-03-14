package com.hrms.Hrms.Business.concretes;

import com.hrms.Hrms.Business.abstracts.jobPositionService;
import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.Result;
import com.hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.hrms.Hrms.Entities.Concretes.jobPosition;
import com.hrms.Hrms.dataAccess.abstracts.jobPositionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobPositionManager implements jobPositionService {

    private jobPositionDto jobpositiondto;

    @Autowired
    public jobPositionManager(jobPositionDto jobpositiondto) {
        super();
        this.jobpositiondto = jobpositiondto;
    }


    @Override
    public Result add(jobPosition jobPosition) {
        this.jobpositiondto.save(jobPosition);
        return new SuccessDataResult("Eklendi");
    }

    @Override
    public DataResult<List<jobPosition>> getAll()
    {
       return new SuccessDataResult<List<jobPosition>>(this.jobpositiondto.findAll(),"Data Listelendi");
    }
}
