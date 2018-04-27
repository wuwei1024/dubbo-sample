package com.test.serviceImpl;

import com.test.service.ConsumerService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.test.service.ProviderService;
import org.springframework.stereotype.Service;

/**
 * @author wuwei
 * @date 2018/4/27 10:30
 */
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Reference(group = "test", version = "1.0.0")
    private ProviderService providerService;

    @Override
    public String hello() {
        String result = providerService.hello();
        System.out.println(result);
        return result;
    }
}
