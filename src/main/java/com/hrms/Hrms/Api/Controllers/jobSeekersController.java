package com.hrms.Hrms.Api.Controllers;

import com.hrms.Hrms.Business.abstracts.jobSeekersService;
import com.hrms.Hrms.Business.concretes.jobSeekersManager;
import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.Result;
import com.hrms.Hrms.Entities.Concretes.jobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class jobSeekersController {
    @Autowired
    public jobSeekersController(com.hrms.Hrms.Business.abstracts.jobSeekersService jobSeekersService) {
        this.jobSeekersService = jobSeekersService;
    }

    private jobSeekersService jobSeekersService;


    @GetMapping("/jobseekersgetall")
    public DataResult<List<jobSeekers>> getAll(){
        return this.jobSeekersService.getAll();
    }

    @PostMapping("/addjoobseekers")
    public Result add(@RequestBody jobSeekers jobSeekers){
        return this.jobSeekersService.add(jobSeekers);
    }
}
