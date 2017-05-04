package provider.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * Description:
 * Author: mif
 * Date: 2017/5/3
 * Time: 16:51
 * Copyright:拓道金服 Copyright (c) 2017
 */
@Service(version = "1.0.1")
public class PDServiceImpl implements PDService {

    @Override
    public String getMessage() {
        return "this is from provider-D";
    }
}
