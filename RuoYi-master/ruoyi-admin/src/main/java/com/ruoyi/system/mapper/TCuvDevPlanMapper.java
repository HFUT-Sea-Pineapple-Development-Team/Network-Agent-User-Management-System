package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TCuvDevPlan;

/**
 * 客户开发计划Mapper接口
 * 
 * @author ruoyi
 * @date 2021-10-24
 */
public interface TCuvDevPlanMapper 
{
    /**
     * 查询客户开发计划
     * 
     * @param planId 客户开发计划主键
     * @return 客户开发计划
     */
    public TCuvDevPlan selectTCuvDevPlanByPlanId(Long planId);

    /**
     * 查询客户开发计划列表
     * 
     * @param tCuvDevPlan 客户开发计划
     * @return 客户开发计划集合
     */
    public List<TCuvDevPlan> selectTCuvDevPlanList(TCuvDevPlan tCuvDevPlan);

    /**
     * 新增客户开发计划
     * 
     * @param tCuvDevPlan 客户开发计划
     * @return 结果
     */
    public int insertTCuvDevPlan(TCuvDevPlan tCuvDevPlan);

    /**
     * 修改客户开发计划
     * 
     * @param tCuvDevPlan 客户开发计划
     * @return 结果
     */
    public int updateTCuvDevPlan(TCuvDevPlan tCuvDevPlan);

    /**
     * 删除客户开发计划
     * 
     * @param planId 客户开发计划主键
     * @return 结果
     */
    public int deleteTCuvDevPlanByPlanId(Long planId);

    /**
     * 批量删除客户开发计划
     * 
     * @param planIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTCuvDevPlanByPlanIds(String[] planIds);
}
