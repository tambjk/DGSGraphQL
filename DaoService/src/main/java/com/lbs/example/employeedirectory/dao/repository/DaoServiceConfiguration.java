package com.lbs.example.employeedirectory.dao.repository;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by Erman.Kaygusuzer on 24/06/2022
 */
@Configuration
@ComponentScan(basePackages = "com.lbs.example.employeedirectory.dao.repository")
@EnableMongoRepositories(basePackages = "com.lbs.example.employeedirectory.dao.repository")
public class DaoServiceConfiguration {

}
