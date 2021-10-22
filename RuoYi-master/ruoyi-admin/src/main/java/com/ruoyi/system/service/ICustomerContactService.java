package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.CustomerContact;

/**
 * 查看客户联系人Service接口
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
public interface ICustomerContactService 
{
    /**
     * 查询查看客户联系人
     * 
     * @param id 查看客户联系人主键
     * @return 查看客户联系人
     */
    public CustomerContact selectCustomerContactById(Long id);

    /**
     * 查询查看客户联系人列表
     * 
     * @param customerContact 查看客户联系人
     * @return 查看客户联系人集合
     */
    public List<CustomerContact> selectCustomerContactList(CustomerContact customerContact);

    /**
     * 新增查看客户联系人
     * 
     * @param customerContact 查看客户联系人
     * @return 结果
     */
    public int insertCustomerContact(CustomerContact customerContact);

    /**
     * 修改查看客户联系人
     * 
     * @param customerContact 查看客户联系人
     * @return 结果
     */
    public int updateCustomerContact(CustomerContact customerContact);

    /**
     * 批量删除查看客户联系人
     * 
     * @param ids 需要删除的查看客户联系人主键集合
     * @return 结果
     */
    public int deleteCustomerContactByIds(String ids);

    /**
     * 删除查看客户联系人信息
     * 
     * @param id 查看客户联系人主键
     * @return 结果
     */
    public int deleteCustomerContactById(Long id);
}
