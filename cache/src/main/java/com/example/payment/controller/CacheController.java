package com.example.payment.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class CacheController {
    @RequestMapping(value = "cache/")
    public String index()
    {
        return "hello cache service";
    }
}
