package com.hrms.Hrms.Api.Controllers;

import com.hrms.Hrms.Business.abstracts.employerService;
import com.hrms.Hrms.Core.utilities.results.DataResult;
import com.hrms.Hrms.Core.utilities.results.Result;
import com.hrms.Hrms.Entities.Concretes.employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class employerController {
    @Autowired
    public employerController(com.hrms.Hrms.Business.abstracts.employerService employerService) {
        this.employerService = employerService;
    }

    private employerService employerService;

    @GetMapping("/getallemployers")
    public DataResult<List<employer>> getAll(){
        return this.employerService.getAll();
    }

    @PostMapping("/addemployer")
    public Result add(@RequestBody employer employer){
        return this.employerService.add(employer);
    }
}
