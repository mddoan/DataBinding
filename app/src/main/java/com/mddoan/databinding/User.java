package com.mddoan.databinding;

import lombok.Data;

/**
 * Using Lombok Plugin to grant getter setter coding:
 * 
 * Add to build.gradle:
 * compileOnly "org.projectlombok:lombok:1.18.2"
 * annotationProcessor 'org.projectlombok:lombok:1.18.2'
 *
 * Enable annotation processing
 * File -> Other Settings -> Default Settings -> Compiler -> Annotation Processors
 *
 * Install Lombok Plugin
 * Preferences -> Plugins
 * Search for Lombok Plugin and install
 *
 * Add annotation @Data to class
 */


@Data
public class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }
}
