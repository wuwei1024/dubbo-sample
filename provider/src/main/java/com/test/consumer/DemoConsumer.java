package com.test.consumer;

import com.test.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: wuwei
 * @date: 2018/4/26 18:33
 */
@Component
public class DemoConsumer implements CommandLineRunner {

    @Autowired
    private DemoService service;

    @Override
    public void run(String... args) {
        System.out.println(service.get());
    }
}
