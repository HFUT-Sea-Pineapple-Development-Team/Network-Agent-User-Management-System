package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.LostCus;

/**
 * 流失客户信息Service接口
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
public interface ILostCusService 
{
    /**
     * 查询流失客户信息
     * 
     * @param id 流失客户信息主键
     * @return 流失客户信息
     */
    public LostCus selectLostCusById(Long id);

    /**
     * 查询流失客户信息列表
     * 
     * @param lostCus 流失客户信息
     * @return 流失客户信息集合
     */
    public List<LostCus> selectLostCusList(LostCus lostCus);

    /**
     * 新增流失客户信息
     * 
     * @param lostCus 流失客户信息
     * @return 结果
     */
    public int insertLostCus(LostCus lostCus);

    /**
     * 修改流失客户信息
     * 
     * @param lostCus 流失客户信息
     * @return 结果
     */
    public int updateLostCus(LostCus lostCus);

    /**
     * 批量删除流失客户信息
     * 
     * @param ids 需要删除的流失客户信息主键集合
     * @return 结果
     */
    public int deleteLostCusByIds(String ids);

    /**
     * 删除流失客户信息信息
     * 
     * @param id 流失客户信息主键
     * @return 结果
     */
    public int deleteLostCusById(Long id);
}
