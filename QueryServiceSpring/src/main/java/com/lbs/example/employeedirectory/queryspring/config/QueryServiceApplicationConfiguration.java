package com.lbs.example.employeedirectory.queryspring.config;

import com.lbs.example.employeedirectory.business.EnableBusinessService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Erman.Kaygusuzer on 22/06/2022
 */
@Configuration
@EnableBusinessService
@ComponentScan(basePackages = "com.lbs.example.employeedirectory.queryspring")
public class QueryServiceApplicationConfiguration {

}
