package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TCusFeedback;

/**
 * 客户反馈Mapper接口
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
public interface TCusFeedbackMapper 
{
    /**
     * 查询客户反馈
     * 
     * @param id 客户反馈主键
     * @return 客户反馈
     */
    public TCusFeedback selectTCusFeedbackById(Long id);

    /**
     * 查询客户反馈列表
     * 
     * @param tCusFeedback 客户反馈
     * @return 客户反馈集合
     */
    public List<TCusFeedback> selectTCusFeedbackList(TCusFeedback tCusFeedback);

    /**
     * 新增客户反馈
     * 
     * @param tCusFeedback 客户反馈
     * @return 结果
     */
    public int insertTCusFeedback(TCusFeedback tCusFeedback);

    /**
     * 修改客户反馈
     * 
     * @param tCusFeedback 客户反馈
     * @return 结果
     */
    public int updateTCusFeedback(TCusFeedback tCusFeedback);

    /**
     * 删除客户反馈
     * 
     * @param id 客户反馈主键
     * @return 结果
     */
    public int deleteTCusFeedbackById(Long id);

    /**
     * 批量删除客户反馈
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTCusFeedbackByIds(String[] ids);
}
