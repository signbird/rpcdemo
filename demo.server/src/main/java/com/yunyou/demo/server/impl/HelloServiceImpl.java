package com.yunyou.demo.server.impl;

import com.yunyou.demo.api.HelloService;
import com.yunyou.demo.server.RpcService;

@RpcService(HelloService.class) // 指定远程接口
public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Hello! " + name;
    }
}