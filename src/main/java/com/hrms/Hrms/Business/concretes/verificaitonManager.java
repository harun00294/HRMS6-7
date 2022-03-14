package com.hrms.Hrms.Business.concretes;

import com.hrms.Hrms.Business.abstracts.verificationService;
import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.SuccessDataResult;
import com.hrms.Hrms.Entities.Concretes.verification;
import com.hrms.Hrms.dataAccess.abstracts.verificationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class verificaitonManager implements verificationService {

    @Autowired
    public verificaitonManager(verificationDto verificationdto) {
        super();
        this.verificationdto = verificationdto;
    }

    private verificationDto verificationdto;

    @Override
    public DataResult<List<verification>> getAll() {

        return new SuccessDataResult<>(this.verificationdto.findAll(),"Data Listelendi");
    }
}
