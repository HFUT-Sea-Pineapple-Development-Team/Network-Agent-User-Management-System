package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TSaleChanceMapper;
import com.ruoyi.system.domain.TSaleChance;
import com.ruoyi.system.service.ITSaleChanceService;
import com.ruoyi.common.core.text.Convert;

/**
 * 营销机会Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-20
 */
@Service
public class TSaleChanceServiceImpl implements ITSaleChanceService 
{
    @Autowired
    private TSaleChanceMapper tSaleChanceMapper;

    /**
     * 查询营销机会
     * 
     * @param chanceId 营销机会主键
     * @return 营销机会
     */
    @Override
    public TSaleChance selectTSaleChanceByChanceId(Long chanceId)
    {
        return tSaleChanceMapper.selectTSaleChanceByChanceId(chanceId);
    }

    /**
     * 查询营销机会列表
     * 
     * @param tSaleChance 营销机会
     * @return 营销机会
     */
    @Override
    public List<TSaleChance> selectTSaleChanceList(TSaleChance tSaleChance)
    {
        return tSaleChanceMapper.selectTSaleChanceList(tSaleChance);
    }

    /**
     * 新增营销机会
     * 
     * @param tSaleChance 营销机会
     * @return 结果
     */
    @Override
    public int insertTSaleChance(TSaleChance tSaleChance)
    {
        tSaleChance.setCreateTime(DateUtils.getNowDate());
        return tSaleChanceMapper.insertTSaleChance(tSaleChance);
    }

    /**
     * 修改营销机会
     * 
     * @param tSaleChance 营销机会
     * @return 结果
     */
    @Override
    public int updateTSaleChance(TSaleChance tSaleChance)
    {
        tSaleChance.setUpdateTime(DateUtils.getNowDate());
        return tSaleChanceMapper.updateTSaleChance(tSaleChance);
    }

    /**
     * 批量删除营销机会
     * 
     * @param chanceIds 需要删除的营销机会主键
     * @return 结果
     */
    @Override
    public int deleteTSaleChanceByChanceIds(String chanceIds)
    {
        return tSaleChanceMapper.deleteTSaleChanceByChanceIds(Convert.toStrArray(chanceIds));
    }

    /**
     * 删除营销机会信息
     * 
     * @param chanceId 营销机会主键
     * @return 结果
     */
    @Override
    public int deleteTSaleChanceByChanceId(Long chanceId)
    {
        return tSaleChanceMapper.deleteTSaleChanceByChanceId(chanceId);
    }
}
