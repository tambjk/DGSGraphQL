package com.lbs.example.employeedirectory.business;

import com.lbs.example.employeedirectory.dao.repository.EnableDaoService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Erman.Kaygusuzer on 24/06/2022
 */

@Configuration
@ComponentScan(basePackages = "com.lbs.example.employeedirectory.business")
@EnableDaoService
public class BusinessServiceConfiguration {

}
