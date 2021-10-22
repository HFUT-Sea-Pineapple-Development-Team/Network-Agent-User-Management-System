package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.CustomerContact;
import com.ruoyi.system.service.ICustomerContactService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 查看客户联系人Controller
 * 
 * @author ruoyi
 * @date 2021-10-21
 */
@Controller
@RequestMapping("/system/contact")
public class CustomerContactController extends BaseController
{
    private String prefix = "system/contact";

    @Autowired
    private ICustomerContactService customerContactService;

    @RequiresPermissions("system:contact:view")
    @GetMapping()
    public String contact()
    {
        return prefix + "/contact";
    }

    /**
     * 查询查看客户联系人列表
     */
    @RequiresPermissions("system:contact:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CustomerContact customerContact)
    {
        startPage();
        List<CustomerContact> list = customerContactService.selectCustomerContactList(customerContact);
        return getDataTable(list);
    }

    /**
     * 导出查看客户联系人列表
     */
    @RequiresPermissions("system:contact:export")
    @Log(title = "查看客户联系人", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CustomerContact customerContact)
    {
        List<CustomerContact> list = customerContactService.selectCustomerContactList(customerContact);
        ExcelUtil<CustomerContact> util = new ExcelUtil<CustomerContact>(CustomerContact.class);
        return util.exportExcel(list, "查看客户联系人数据");
    }

    /**
     * 新增查看客户联系人
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存查看客户联系人
     */
    @RequiresPermissions("system:contact:add")
    @Log(title = "查看客户联系人", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CustomerContact customerContact)
    {
        return toAjax(customerContactService.insertCustomerContact(customerContact));
    }

    /**
     * 修改查看客户联系人
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CustomerContact customerContact = customerContactService.selectCustomerContactById(id);
        mmap.put("customerContact", customerContact);
        return prefix + "/edit";
    }

    /**
     * 修改保存查看客户联系人
     */
    @RequiresPermissions("system:contact:edit")
    @Log(title = "查看客户联系人", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CustomerContact customerContact)
    {
        return toAjax(customerContactService.updateCustomerContact(customerContact));
    }

    /**
     * 删除查看客户联系人
     */
    @RequiresPermissions("system:contact:remove")
    @Log(title = "查看客户联系人", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerContactService.deleteCustomerContactByIds(ids));
    }
}
