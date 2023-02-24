package com.example.state.machine.demo.client;

import com.example.state.machine.demo.factory.ExpertApplyFactory;
import com.example.state.machine.demo.handler.AbstractExpertApplyHandler;
import com.example.state.machine.demo.handler.impl.ExpertApplyPassHandler;

import javax.annotation.Resource;

public class Client {

    private static AbstractExpertApplyHandler expertApplyHandler;

    public static void main(String[] args) {
        // 工作流审核通过业务
        String single = "success";
        expertApplyHandler = ExpertApplyFactory.init(single);
        expertApplyHandler.next("123");
    }

}
