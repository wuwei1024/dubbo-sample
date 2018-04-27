package com.test.serviceImpl;

import com.test.service.ProviderService;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * @author: wuwei
 * @date: 2018/4/26 18:30
 */
@Service(group = "test", version = "1.0.0")
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String hello() {
        return "hello world!";
    }
}
