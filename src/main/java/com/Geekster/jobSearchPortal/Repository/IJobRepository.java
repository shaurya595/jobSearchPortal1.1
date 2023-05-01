package com.Geekster.jobSearchPortal.Repository;

import com.Geekster.jobSearchPortal.Method.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepository extends CrudRepository <Job,Integer> {
public List<Job> findByTitle(String title);
}
