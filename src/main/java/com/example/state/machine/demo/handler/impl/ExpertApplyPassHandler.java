package com.example.state.machine.demo.handler.impl;

import com.example.state.machine.demo.entity.Expert;
import com.example.state.machine.demo.enums.ExpertStatusEnum;
import com.example.state.machine.demo.handler.AbstractExpertApplyHandler;
import com.example.state.machine.demo.service.ExpertService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 专家通过处理程序
 *
 * @author David
 * @date 2023/02/24
 */
@Service
public class ExpertApplyPassHandler extends AbstractExpertApplyHandler {

    @Resource
    private ExpertService expertService;

    private final ExpertStatusEnum[] SOURCE={ExpertStatusEnum.E10002};

    private final ExpertStatusEnum TARGET = ExpertStatusEnum.E10003;


    @Override
    protected void handler(String id) {

    }

    @Override
    protected List<ExpertStatusEnum> setSource() {
        return Arrays.asList(SOURCE);
    }

    @Override
    protected ExpertStatusEnum setTarget() {
        return TARGET;
    }

    @Override
    protected Expert getContext(String id) {
        return expertService.getById(id);
    }
}
