package com.test.serviceImpl;

import com.test.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author: wuwei
 * @date: 2018/4/26 18:30
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String get() {
        return "hello world!";
    }
}
