package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CustomerOrder;

/**
 * 查看订单Service接口
 * 
 * @author ruoyi
 * @date 2021-10-21
 */
public interface ICustomerOrderService 
{
    /**
     * 查询查看订单
     * 
     * @param id 查看订单主键
     * @return 查看订单
     */
    public CustomerOrder selectCustomerOrderById(Long id);

    /**
     * 查询查看订单列表
     * 
     * @param customerOrder 查看订单
     * @return 查看订单集合
     */
    public List<CustomerOrder> selectCustomerOrderList(CustomerOrder customerOrder);

    /**
     * 新增查看订单
     * 
     * @param customerOrder 查看订单
     * @return 结果
     */
    public int insertCustomerOrder(CustomerOrder customerOrder);

    /**
     * 修改查看订单
     * 
     * @param customerOrder 查看订单
     * @return 结果
     */
    public int updateCustomerOrder(CustomerOrder customerOrder);

    /**
     * 批量删除查看订单
     * 
     * @param ids 需要删除的查看订单主键集合
     * @return 结果
     */
    public int deleteCustomerOrderByIds(String ids);

    /**
     * 删除查看订单信息
     * 
     * @param id 查看订单主键
     * @return 结果
     */
    public int deleteCustomerOrderById(Long id);
}
