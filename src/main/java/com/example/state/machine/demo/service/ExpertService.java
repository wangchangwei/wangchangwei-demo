package com.example.state.machine.demo.service;

import com.example.state.machine.demo.entity.Expert;

/**
 * 其实服务
 *
 * @author David
 * @date 2023/02/24
 */
public interface ExpertService {

    /**
     * 根据Id获取专家
     *
     * @param id id
     * @return {@link Expert }
     * @auther David
     * @date 2023/02/24
     */
    Expert getById(String id);

}
