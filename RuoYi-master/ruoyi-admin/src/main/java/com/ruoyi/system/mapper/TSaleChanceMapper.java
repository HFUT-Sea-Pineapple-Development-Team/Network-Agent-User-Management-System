package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TSaleChance;

/**
 * 营销机会Mapper接口
 * 
 * @author ruoyi
 * @date 2021-10-20
 */
public interface TSaleChanceMapper 
{
    /**
     * 查询营销机会
     * 
     * @param chanceId 营销机会主键
     * @return 营销机会
     */
    public TSaleChance selectTSaleChanceByChanceId(Long chanceId);

    /**
     * 查询营销机会列表
     * 
     * @param tSaleChance 营销机会
     * @return 营销机会集合
     */
    public List<TSaleChance> selectTSaleChanceList(TSaleChance tSaleChance);

    /**
     * 新增营销机会
     * 
     * @param tSaleChance 营销机会
     * @return 结果
     */
    public int insertTSaleChance(TSaleChance tSaleChance);

    /**
     * 修改营销机会
     * 
     * @param tSaleChance 营销机会
     * @return 结果
     */
    public int updateTSaleChance(TSaleChance tSaleChance);

    /**
     * 删除营销机会
     * 
     * @param chanceId 营销机会主键
     * @return 结果
     */
    public int deleteTSaleChanceByChanceId(Long chanceId);

    /**
     * 批量删除营销机会
     * 
     * @param chanceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTSaleChanceByChanceIds(String[] chanceIds);
}
