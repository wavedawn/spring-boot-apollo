package com.example.springbootapollo.Util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by zhangjiajia on 18-11-14
 */
@Slf4j
@Component
public class ApolloDemo {
    @Value("${timeout:200}")
    private int timeout;
    @Value("${test:test}")
    private String test;

    @Autowired
    Test test1;

    @Scheduled(fixedRate = 10000)
    private void test() {
        log.info("apollo test, timeout: {}", timeout);
        log.info("apollo test, test: {}", test);
        log.info("apollo test, test1: {}", test1.str);

    }
}
