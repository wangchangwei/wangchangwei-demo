package com.example.state.machine.demo.handler;

import com.example.state.machine.demo.entity.Expert;
import com.example.state.machine.demo.enums.ExpertStatusEnum;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Admin
 */

public abstract class AbstractExpertApplyHandler {

    /**
     * 状态来源
     */
    private List<ExpertStatusEnum> source;

    /**
     * 状态终点
     */
    private ExpertStatusEnum target;

    /**
     * 上下文
     */
    private Expert context;


    /**
     * 完成审核，下一步
     *
     * @param id id
     * @auther David
     * @date 2023/02/24
     */
    public void next(String id){
        context = getContext(id);
        if (!checkSource()) {
            // TODO error:提示当前用户的状态已发生变更，无法再次发生变更
            return;
        }
        handler(id);
    }


    /**
     * 处理程序
     *
     * @param id id
     * @auther David
     * @date 2023/02/24
     */
    protected abstract void handler(String id);


    /**
     * 设置状态源
     * @return
     */
    protected abstract List<ExpertStatusEnum> setSource();


    /**
     * 设定目标源
     *
     * @return {@link ExpertStatusEnum }
     * @auther David
     * @date 2023/02/24
     */
    protected abstract ExpertStatusEnum setTarget();


    /**
     * 设置上下文
     *
     * @param id id
     * @return {@link Expert }
     * @auther David
     * @date 2023/02/24
     */
    protected abstract Expert getContext(String id);


    /**
     * 检查当前状态是否符合状态变更的要求
     * @return
     */
    protected Boolean checkSource(){
        if (source == null){
            return false;
        }
        return CollectionUtils.contains(Arrays.asList(source).iterator() ,context.getState());
    }



}
