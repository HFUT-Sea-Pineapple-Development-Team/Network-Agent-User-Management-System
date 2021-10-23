package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OrderDetailsMapper;
import com.ruoyi.system.domain.OrderDetails;
import com.ruoyi.system.service.IOrderDetailsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 订单详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-23
 */
@Service
public class OrderDetailsServiceImpl implements IOrderDetailsService 
{
    @Autowired
    private OrderDetailsMapper orderDetailsMapper;

    /**
     * 查询订单详情
     * 
     * @param id 订单详情主键
     * @return 订单详情
     */
    @Override
    public OrderDetails selectOrderDetailsById(Long id)
    {
        return orderDetailsMapper.selectOrderDetailsById(id);
    }

    /**
     * 查询订单详情列表
     * 
     * @param orderDetails 订单详情
     * @return 订单详情
     */
    @Override
    public List<OrderDetails> selectOrderDetailsList(OrderDetails orderDetails)
    {
        return orderDetailsMapper.selectOrderDetailsList(orderDetails);
    }

    /**
     * 新增订单详情
     * 
     * @param orderDetails 订单详情
     * @return 结果
     */
    @Override
    public int insertOrderDetails(OrderDetails orderDetails)
    {
        return orderDetailsMapper.insertOrderDetails(orderDetails);
    }

    /**
     * 修改订单详情
     * 
     * @param orderDetails 订单详情
     * @return 结果
     */
    @Override
    public int updateOrderDetails(OrderDetails orderDetails)
    {
        return orderDetailsMapper.updateOrderDetails(orderDetails);
    }

    /**
     * 批量删除订单详情
     * 
     * @param ids 需要删除的订单详情主键
     * @return 结果
     */
    @Override
    public int deleteOrderDetailsByIds(String ids)
    {
        return orderDetailsMapper.deleteOrderDetailsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单详情信息
     * 
     * @param id 订单详情主键
     * @return 结果
     */
    @Override
    public int deleteOrderDetailsById(Long id)
    {
        return orderDetailsMapper.deleteOrderDetailsById(id);
    }
    
    @Override
    public List<OrderDetails> selectOrderDetailsAll()
    {
        return orderDetailsMapper.selectOrderDetailsAll();
    }
}
