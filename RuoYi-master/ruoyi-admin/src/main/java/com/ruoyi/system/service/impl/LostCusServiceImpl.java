package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LostCusMapper;
import com.ruoyi.system.domain.LostCus;
import com.ruoyi.system.service.ILostCusService;
import com.ruoyi.common.core.text.Convert;

/**
 * 流失客户信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-23
 */
@Service
public class LostCusServiceImpl implements ILostCusService 
{
    @Autowired
    private LostCusMapper lostCusMapper;

    /**
     * 查询流失客户信息
     * 
     * @param id 流失客户信息主键
     * @return 流失客户信息
     */
    @Override
    public LostCus selectLostCusById(Long id)
    {
        return lostCusMapper.selectLostCusById(id);
    }

    /**
     * 查询流失客户信息列表
     * 
     * @param lostCus 流失客户信息
     * @return 流失客户信息
     */
    @Override
    public List<LostCus> selectLostCusList(LostCus lostCus)
    {
        return lostCusMapper.selectLostCusList(lostCus);
    }

    /**
     * 新增流失客户信息
     * 
     * @param lostCus 流失客户信息
     * @return 结果
     */
    @Override
    public int insertLostCus(LostCus lostCus)
    {
        lostCus.setCreateTime(DateUtils.getNowDate());
        return lostCusMapper.insertLostCus(lostCus);
    }

    /**
     * 修改流失客户信息
     * 
     * @param lostCus 流失客户信息
     * @return 结果
     */
    @Override
    public int updateLostCus(LostCus lostCus)
    {
        lostCus.setUpdateTime(DateUtils.getNowDate());
        return lostCusMapper.updateLostCus(lostCus);
    }

    /**
     * 批量删除流失客户信息
     * 
     * @param ids 需要删除的流失客户信息主键
     * @return 结果
     */
    @Override
    public int deleteLostCusByIds(String ids)
    {
        return lostCusMapper.deleteLostCusByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除流失客户信息信息
     * 
     * @param id 流失客户信息主键
     * @return 结果
     */
    @Override
    public int deleteLostCusById(Long id)
    {
        return lostCusMapper.deleteLostCusById(id);
    }
    
    @Override
    public List<LostCus> selectLostAll()
    {
        return lostCusMapper.selectLostAll();
    }
}
