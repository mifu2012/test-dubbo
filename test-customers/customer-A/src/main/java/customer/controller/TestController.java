package customer.controller;

import customer.service.CATestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Author: mif
 * Date: 2017/5/4
 * Time: 13:45
 * Copyright:拓道金服 Copyright (c) 2017
 */
@RestController
public class TestController {


    @Autowired
    private CATestService caTestService;

    @RequestMapping(value = "/getMessage", method = RequestMethod.GET)
    public String getMessagge() {
        return caTestService.getMessage ();
    }
}
