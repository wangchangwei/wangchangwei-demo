package com.example.state.machine.demo.entity;

import com.example.state.machine.demo.enums.ExpertStatusEnum;

/**
 * 专家
 *
 * @author David
 * @date 2023/02/24
 */
public class Expert {

    private String id;

    private ExpertStatusEnum state;










    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExpertStatusEnum getState() {
        return state;
    }

    public void setState(ExpertStatusEnum state) {
        this.state = state;
    }
}
