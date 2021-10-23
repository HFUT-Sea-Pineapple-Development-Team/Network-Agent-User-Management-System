package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CustomerOrderMapper;
import com.ruoyi.system.domain.CustomerOrder;
import com.ruoyi.system.service.ICustomerOrderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 查看订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-23
 */
@Service
public class CustomerOrderServiceImpl implements ICustomerOrderService 
{
    @Autowired
    private CustomerOrderMapper customerOrderMapper;

    /**
     * 查询查看订单
     * 
     * @param id 查看订单主键
     * @return 查看订单
     */
    @Override
    public CustomerOrder selectCustomerOrderById(Long id)
    {
        return customerOrderMapper.selectCustomerOrderById(id);
    }

    /**
     * 查询查看订单列表
     * 
     * @param customerOrder 查看订单
     * @return 查看订单
     */
    @Override
    public List<CustomerOrder> selectCustomerOrderList(CustomerOrder customerOrder)
    {
        return customerOrderMapper.selectCustomerOrderList(customerOrder);
    }

    /**
     * 新增查看订单
     * 
     * @param customerOrder 查看订单
     * @return 结果
     */
    @Override
    public int insertCustomerOrder(CustomerOrder customerOrder)
    {
        return customerOrderMapper.insertCustomerOrder(customerOrder);
    }

    /**
     * 修改查看订单
     * 
     * @param customerOrder 查看订单
     * @return 结果
     */
    @Override
    public int updateCustomerOrder(CustomerOrder customerOrder)
    {
        return customerOrderMapper.updateCustomerOrder(customerOrder);
    }

    /**
     * 批量删除查看订单
     * 
     * @param ids 需要删除的查看订单主键
     * @return 结果
     */
    @Override
    public int deleteCustomerOrderByIds(String ids)
    {
        return customerOrderMapper.deleteCustomerOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除查看订单信息
     * 
     * @param id 查看订单主键
     * @return 结果
     */
    @Override
    public int deleteCustomerOrderById(Long id)
    {
        return customerOrderMapper.deleteCustomerOrderById(id);
    }
}
