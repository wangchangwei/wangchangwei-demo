package com.example.state.machine.demo.factory;

import com.example.state.machine.demo.handler.AbstractExpertApplyHandler;
import com.example.state.machine.demo.handler.impl.ExpertApplyPassHandler;
import com.example.state.machine.demo.util.SpringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 专家审核工厂
 *
 * @author David
 * @date 2023/02/24
 */
@Component
public class ExpertApplyFactory {

    static ApplicationContext context;

    public static AbstractExpertApplyHandler init(String action){
        if (action.equals("pass")){
            return SpringUtil.getBean(ExpertApplyPassHandler.class);
        }
        return null;
    }


}
