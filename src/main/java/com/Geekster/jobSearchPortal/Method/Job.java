package com.Geekster.jobSearchPortal.Method;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String location;
    @Column
    private Integer salary;
    @Column
    private String companyName;
    @Column
    private String employerName;
    @Column
    private String jobType;
}
