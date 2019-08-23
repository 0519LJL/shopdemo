package com.iwei.shop.web.controller;

import com.iwei.shop.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class testController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String test() {
        return demoService.getDemoService();
    }
}
