package com.Geekster.jobSearchPortal.Service;

import com.Geekster.jobSearchPortal.Method.Job;
import com.Geekster.jobSearchPortal.Repository.IJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {
    @Autowired
    IJobRepository jobRepository;

    public Iterable<Job> getAllJobs() {
        Iterable<Job> allJobs =  jobRepository.findAll();
        return allJobs;
    }

    public String addJob(List<Job> jobList) {
        Iterable<Job> savedAllJobs = jobRepository.saveAll(jobList);
        if(savedAllJobs != null){
            return "Yes";
        }else{
            return "Not Added";
        }
    }

    public void removedJob(Integer id) {
        jobRepository.deleteById(id);
    }


    public List<Job> findByTitle(String title) {
        return jobRepository.findByTitle(title);
    }
}

