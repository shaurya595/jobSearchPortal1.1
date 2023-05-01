package com.Geekster.jobSearchPortal.Controller;

import com.Geekster.jobSearchPortal.Method.Job;
import com.Geekster.jobSearchPortal.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @GetMapping (value = "/getAllJobs")
    public Iterable<Job> getJob(){
        return jobService.getAllJobs();
    }
    @PostMapping(value = "/addJobs")
    public String insertJob(@RequestBody List<Job> jobList){
        return  jobService.addJob(jobList);
    }
    @DeleteMapping (value = "/deleteJobs/{id}")
    public void deleteJobsById(@PathVariable Integer id){
         jobService.removedJob(id);
    }
    @GetMapping(value = "/jobs/{name}")
    public List<Job> findJobsByTitle(@PathVariable String title){
       return jobService.findByTitle(title);
    }
}
