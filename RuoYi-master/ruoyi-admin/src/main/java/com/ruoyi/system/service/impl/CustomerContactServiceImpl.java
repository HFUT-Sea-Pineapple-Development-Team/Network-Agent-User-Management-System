package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CustomerContactMapper;
import com.ruoyi.system.domain.CustomerContact;
import com.ruoyi.system.service.ICustomerContactService;
import com.ruoyi.common.core.text.Convert;

/**
 * 查看客户联系人Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-24
 */
@Service
public class CustomerContactServiceImpl implements ICustomerContactService 
{
    @Autowired
    private CustomerContactMapper customerContactMapper;

    /**
     * 查询查看客户联系人
     * 
     * @param id 查看客户联系人主键
     * @return 查看客户联系人
     */
    @Override
    public CustomerContact selectCustomerContactById(Long id)
    {
        return customerContactMapper.selectCustomerContactById(id);
    }

    /**
     * 查询查看客户联系人列表
     * 
     * @param customerContact 查看客户联系人
     * @return 查看客户联系人
     */
    @Override
    public List<CustomerContact> selectCustomerContactList(CustomerContact customerContact)
    {
        return customerContactMapper.selectCustomerContactList(customerContact);
    }

    /**
     * 新增查看客户联系人
     * 
     * @param customerContact 查看客户联系人
     * @return 结果
     */
    @Override
    public int insertCustomerContact(CustomerContact customerContact)
    {
        return customerContactMapper.insertCustomerContact(customerContact);
    }

    /**
     * 修改查看客户联系人
     * 
     * @param customerContact 查看客户联系人
     * @return 结果
     */
    @Override
    public int updateCustomerContact(CustomerContact customerContact)
    {
        return customerContactMapper.updateCustomerContact(customerContact);
    }

    /**
     * 批量删除查看客户联系人
     * 
     * @param ids 需要删除的查看客户联系人主键
     * @return 结果
     */
    @Override
    public int deleteCustomerContactByIds(String ids)
    {
        return customerContactMapper.deleteCustomerContactByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除查看客户联系人信息
     * 
     * @param id 查看客户联系人主键
     * @return 结果
     */
    @Override
    public int deleteCustomerContactById(Long id)
    {
        return customerContactMapper.deleteCustomerContactById(id);
    }
}
