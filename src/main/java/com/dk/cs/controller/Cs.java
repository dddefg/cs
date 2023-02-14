package com.dk.cs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 板凳宽宽
 */
@RestController
public class Cs {
    @RequestMapping("/cs")
    public String cs(){
        return "username:aa";
    }
}
