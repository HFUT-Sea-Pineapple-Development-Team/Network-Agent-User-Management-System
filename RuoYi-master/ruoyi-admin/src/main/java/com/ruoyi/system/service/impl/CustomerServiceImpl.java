package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CustomerMapper;
import com.ruoyi.system.domain.Customer;
import com.ruoyi.system.service.ICustomerService;
import com.ruoyi.common.core.text.Convert;

/**
 * 查看客户信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
@Service
public class CustomerServiceImpl implements ICustomerService 
{
    @Autowired
    private CustomerMapper customerMapper;

    /**
     * 查询查看客户信息
     * 
     * @param id 查看客户信息主键
     * @return 查看客户信息
     */
    @Override
    public Customer selectCustomerById(Long id)
    {
        return customerMapper.selectCustomerById(id);
    }

    /**
     * 查询查看客户信息列表
     * 
     * @param customer 查看客户信息
     * @return 查看客户信息
     */
    @Override
    public List<Customer> selectCustomerList(Customer customer)
    {
        return customerMapper.selectCustomerList(customer);
    }

    /**
     * 新增查看客户信息
     * 
     * @param customer 查看客户信息
     * @return 结果
     */
    @Override
    public int insertCustomer(Customer customer)
    {
        return customerMapper.insertCustomer(customer);
    }

    /**
     * 修改查看客户信息
     * 
     * @param customer 查看客户信息
     * @return 结果
     */
    @Override
    public int updateCustomer(Customer customer)
    {
        return customerMapper.updateCustomer(customer);
    }

    /**
     * 批量删除查看客户信息
     * 
     * @param ids 需要删除的查看客户信息主键
     * @return 结果
     */
    @Override
    public int deleteCustomerByIds(String ids)
    {
        return customerMapper.deleteCustomerByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除查看客户信息信息
     * 
     * @param id 查看客户信息主键
     * @return 结果
     */
    @Override
    public int deleteCustomerById(Long id)
    {
        return customerMapper.deleteCustomerById(id);
    }
    
    @Override
    public List<Customer> selectAll()
    {
        return customerMapper.selectAll();
    }
}
