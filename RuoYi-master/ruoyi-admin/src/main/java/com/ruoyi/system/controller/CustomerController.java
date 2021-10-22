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
import com.ruoyi.system.domain.Customer;
import com.ruoyi.system.service.ICustomerService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 查看客户信息Controller
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
@Controller
@RequestMapping("/system/customer")
public class CustomerController extends BaseController
{
    private String prefix = "system/customer";

    @Autowired
    private ICustomerService customerService;

    @RequiresPermissions("system:customer:view")
    @GetMapping()
    public String customer()
    {
        return prefix + "/customer";
    }

    @GetMapping("/region")
    public String region(ModelMap mmap)
    {
    	List<Customer> list = customerService.selectAll();
    	mmap.put("regiondis",list);
        return prefix + "/region";
    }
    
    /**
     * 查询查看客户信息列表
     */
    @RequiresPermissions("system:customer:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Customer customer)
    {
        startPage();
        List<Customer> list = customerService.selectCustomerList(customer);
        return getDataTable(list);
    }

    /**
     * 导出查看客户信息列表
     */
    @RequiresPermissions("system:customer:export")
    @Log(title = "查看客户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Customer customer)
    {
        List<Customer> list = customerService.selectCustomerList(customer);
        ExcelUtil<Customer> util = new ExcelUtil<Customer>(Customer.class);
        return util.exportExcel(list, "查看客户信息数据");
    }

    /**
     * 新增查看客户信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存查看客户信息
     */
    @RequiresPermissions("system:customer:add")
    @Log(title = "查看客户信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Customer customer)
    {
        return toAjax(customerService.insertCustomer(customer));
    }

    /**
     * 修改查看客户信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Customer customer = customerService.selectCustomerById(id);
        mmap.put("customer", customer);
        return prefix + "/edit";
    }

    /**
     * 修改保存查看客户信息
     */
    @RequiresPermissions("system:customer:edit")
    @Log(title = "查看客户信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Customer customer)
    {
        return toAjax(customerService.updateCustomer(customer));
    }

    /**
     * 删除查看客户信息
     */
    @RequiresPermissions("system:customer:remove")
    @Log(title = "查看客户信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerService.deleteCustomerByIds(ids));
    }
}
