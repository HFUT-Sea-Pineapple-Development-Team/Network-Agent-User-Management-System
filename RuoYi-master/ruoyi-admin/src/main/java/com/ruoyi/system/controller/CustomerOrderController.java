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
import com.ruoyi.system.domain.CustomerOrder;
import com.ruoyi.system.service.ICustomerOrderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 查看订单Controller
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
@Controller
@RequestMapping("/system/order")
public class CustomerOrderController extends BaseController
{
    private String prefix = "system/order";

    @Autowired
    private ICustomerOrderService customerOrderService;

    @RequiresPermissions("system:order:view")
    @GetMapping()
    public String order()
    {
        return prefix + "/order";
    }

    /**
     * 查询查看订单列表
     */
    @RequiresPermissions("system:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CustomerOrder customerOrder)
    {
        startPage();
        List<CustomerOrder> list = customerOrderService.selectCustomerOrderList(customerOrder);
        return getDataTable(list);
    }

    /**
     * 导出查看订单列表
     */
    @RequiresPermissions("system:order:export")
    @Log(title = "查看订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CustomerOrder customerOrder)
    {
        List<CustomerOrder> list = customerOrderService.selectCustomerOrderList(customerOrder);
        ExcelUtil<CustomerOrder> util = new ExcelUtil<CustomerOrder>(CustomerOrder.class);
        return util.exportExcel(list, "查看订单数据");
    }

    /**
     * 新增查看订单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存查看订单
     */
    @RequiresPermissions("system:order:add")
    @Log(title = "查看订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CustomerOrder customerOrder)
    {
        return toAjax(customerOrderService.insertCustomerOrder(customerOrder));
    }

    /**
     * 修改查看订单
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CustomerOrder customerOrder = customerOrderService.selectCustomerOrderById(id);
        mmap.put("customerOrder", customerOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存查看订单
     */
    @RequiresPermissions("system:order:edit")
    @Log(title = "查看订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CustomerOrder customerOrder)
    {
        return toAjax(customerOrderService.updateCustomerOrder(customerOrder));
    }

    /**
     * 删除查看订单
     */
    @RequiresPermissions("system:order:remove")
    @Log(title = "查看订单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customerOrderService.deleteCustomerOrderByIds(ids));
    }
}
