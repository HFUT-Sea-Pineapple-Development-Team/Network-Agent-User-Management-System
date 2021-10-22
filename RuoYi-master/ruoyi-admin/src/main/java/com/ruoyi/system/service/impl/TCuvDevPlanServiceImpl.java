package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TCuvDevPlanMapper;
import com.ruoyi.system.domain.TCuvDevPlan;
import com.ruoyi.system.service.ITCuvDevPlanService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户开发计划Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-20
 */
@Service
public class TCuvDevPlanServiceImpl implements ITCuvDevPlanService 
{
    @Autowired
    private TCuvDevPlanMapper tCuvDevPlanMapper;

    /**
     * 查询客户开发计划
     * 
     * @param planId 客户开发计划主键
     * @return 客户开发计划
     */
    @Override
    public TCuvDevPlan selectTCuvDevPlanByPlanId(Long planId)
    {
        return tCuvDevPlanMapper.selectTCuvDevPlanByPlanId(planId);
    }

    /**
     * 查询客户开发计划列表
     * 
     * @param tCuvDevPlan 客户开发计划
     * @return 客户开发计划
     */
    @Override
    public List<TCuvDevPlan> selectTCuvDevPlanList(TCuvDevPlan tCuvDevPlan)
    {
        return tCuvDevPlanMapper.selectTCuvDevPlanList(tCuvDevPlan);
    }

    /**
     * 新增客户开发计划
     * 
     * @param tCuvDevPlan 客户开发计划
     * @return 结果
     */
    @Override
    public int insertTCuvDevPlan(TCuvDevPlan tCuvDevPlan)
    {
        tCuvDevPlan.setCreateTime(DateUtils.getNowDate());
        return tCuvDevPlanMapper.insertTCuvDevPlan(tCuvDevPlan);
    }

    /**
     * 修改客户开发计划
     * 
     * @param tCuvDevPlan 客户开发计划
     * @return 结果
     */
    @Override
    public int updateTCuvDevPlan(TCuvDevPlan tCuvDevPlan)
    {
        tCuvDevPlan.setUpdateTime(DateUtils.getNowDate());
        return tCuvDevPlanMapper.updateTCuvDevPlan(tCuvDevPlan);
    }

    /**
     * 批量删除客户开发计划
     * 
     * @param planIds 需要删除的客户开发计划主键
     * @return 结果
     */
    @Override
    public int deleteTCuvDevPlanByPlanIds(String planIds)
    {
        return tCuvDevPlanMapper.deleteTCuvDevPlanByPlanIds(Convert.toStrArray(planIds));
    }

    /**
     * 删除客户开发计划信息
     * 
     * @param planId 客户开发计划主键
     * @return 结果
     */
    @Override
    public int deleteTCuvDevPlanByPlanId(Long planId)
    {
        return tCuvDevPlanMapper.deleteTCuvDevPlanByPlanId(planId);
    }
}
