package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Customer;

/**
 * 查看客户信息Service接口
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
public interface ICustomerService 
{
    /**
     * 查询查看客户信息
     * 
     * @param id 查看客户信息主键
     * @return 查看客户信息
     */
    public Customer selectCustomerById(Long id);

    /**
     * 查询查看客户信息列表
     * 
     * @param customer 查看客户信息
     * @return 查看客户信息集合
     */
    public List<Customer> selectCustomerList(Customer customer);

    /**
     * 新增查看客户信息
     * 
     * @param customer 查看客户信息
     * @return 结果
     */
    public int insertCustomer(Customer customer);

    /**
     * 修改查看客户信息
     * 
     * @param customer 查看客户信息
     * @return 结果
     */
    public int updateCustomer(Customer customer);

    /**
     * 批量删除查看客户信息
     * 
     * @param ids 需要删除的查看客户信息主键集合
     * @return 结果
     */
    public int deleteCustomerByIds(String ids);

    /**
     * 删除查看客户信息信息
     * 
     * @param id 查看客户信息主键
     * @return 结果
     */
    public int deleteCustomerById(Long id);
    
    List<Customer> selectAll();
}
