package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TCusFeedbackMapper;
import com.ruoyi.system.domain.TCusFeedback;
import com.ruoyi.system.service.ITCusFeedbackService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户反馈Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
@Service
public class TCusFeedbackServiceImpl implements ITCusFeedbackService 
{
    @Autowired
    private TCusFeedbackMapper tCusFeedbackMapper;

    /**
     * 查询客户反馈
     * 
     * @param id 客户反馈主键
     * @return 客户反馈
     */
    @Override
    public TCusFeedback selectTCusFeedbackById(Long id)
    {
        return tCusFeedbackMapper.selectTCusFeedbackById(id);
    }

    /**
     * 查询客户反馈列表
     * 
     * @param tCusFeedback 客户反馈
     * @return 客户反馈
     */
    @Override
    public List<TCusFeedback> selectTCusFeedbackList(TCusFeedback tCusFeedback)
    {
        return tCusFeedbackMapper.selectTCusFeedbackList(tCusFeedback);
    }

    /**
     * 新增客户反馈
     * 
     * @param tCusFeedback 客户反馈
     * @return 结果
     */
    @Override
    public int insertTCusFeedback(TCusFeedback tCusFeedback)
    {
        tCusFeedback.setCreateTime(DateUtils.getNowDate());
        return tCusFeedbackMapper.insertTCusFeedback(tCusFeedback);
    }

    /**
     * 修改客户反馈
     * 
     * @param tCusFeedback 客户反馈
     * @return 结果
     */
    @Override
    public int updateTCusFeedback(TCusFeedback tCusFeedback)
    {
        return tCusFeedbackMapper.updateTCusFeedback(tCusFeedback);
    }

    /**
     * 批量删除客户反馈
     * 
     * @param ids 需要删除的客户反馈主键
     * @return 结果
     */
    @Override
    public int deleteTCusFeedbackByIds(String ids)
    {
        return tCusFeedbackMapper.deleteTCusFeedbackByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户反馈信息
     * 
     * @param id 客户反馈主键
     * @return 结果
     */
    @Override
    public int deleteTCusFeedbackById(Long id)
    {
        return tCusFeedbackMapper.deleteTCusFeedbackById(id);
    }
}
