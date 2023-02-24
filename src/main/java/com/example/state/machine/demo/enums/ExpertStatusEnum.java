package com.example.state.machine.demo.enums;

/**
 * @author mao
 */
public enum ExpertStatusEnum {
    E10001("待提交", "E10001"),
    E10002("待部门管理员审核", "E10002"),
    E10003("待单位管理员审核", "E10003"),



    E10006("待审核", "E10006"),
    E10008("审核通过", "E10008"),
    E10009("审核不通过", "E10009"),
    E10010("公示中", "E10010"),
    E10011("已入库", "E10011"),
    E10012("已冻结", "E10012"),
    E10013("已出库", "E10013"),
    E10099("已内销", "E10099");
    private String name;
    private String value;

    ExpertStatusEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
