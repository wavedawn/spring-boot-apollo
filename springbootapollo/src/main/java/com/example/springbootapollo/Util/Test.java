package com.example.springbootapollo.Util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by zhangjiajia on 18-11-14
 */
@Component
public class Test {
    @Value("${num:10}")
    public int num;

    @Value("${str:string}")
    public String str;
}
