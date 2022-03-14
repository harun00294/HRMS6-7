package com.hrms.Hrms.Api.Controllers;

import com.hrms.Hrms.Business.abstracts.jobPositionService;
import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.Result;
import com.hrms.Hrms.Entities.Concretes.jobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jobpositions")
public class jobPositionController {

    @Autowired
    public jobPositionController(com.hrms.Hrms.Business.abstracts.jobPositionService jobPositionService) {
        super();
        this.jobPositionService = jobPositionService;
    }

    private jobPositionService jobPositionService;

    @GetMapping("/getall")
    public DataResult<List<jobPosition>> getAll(){
        return this.jobPositionService.getAll();
    }

    @PostMapping("/addjobposition")
    public Result add(@RequestBody jobPosition jobPosition){
        return this.jobPositionService.add(jobPosition);
    }
}
