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
import com.ruoyi.system.domain.LostCus;
import com.ruoyi.system.service.ILostCusService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 流失客户信息Controller
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
@Controller
@RequestMapping("/system/cus")
public class LostCusController extends BaseController
{
    private String prefix = "system/cus";

    @Autowired
    private ILostCusService lostCusService;

    @RequiresPermissions("system:cus:view")
    @GetMapping()
    public String cus()
    {
        return prefix + "/cus";
    }

    /**
     * 查询流失客户信息列表
     */
    @RequiresPermissions("system:cus:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LostCus lostCus)
    {
        startPage();
        List<LostCus> list = lostCusService.selectLostCusList(lostCus);
        return getDataTable(list);
    }

    /**
     * 导出流失客户信息列表
     */
    @RequiresPermissions("system:cus:export")
    @Log(title = "流失客户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LostCus lostCus)
    {
        List<LostCus> list = lostCusService.selectLostCusList(lostCus);
        ExcelUtil<LostCus> util = new ExcelUtil<LostCus>(LostCus.class);
        return util.exportExcel(list, "流失客户信息数据");
    }

    /**
     * 新增流失客户信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存流失客户信息
     */
    @RequiresPermissions("system:cus:add")
    @Log(title = "流失客户信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LostCus lostCus)
    {
        return toAjax(lostCusService.insertLostCus(lostCus));
    }

    /**
     * 修改流失客户信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LostCus lostCus = lostCusService.selectLostCusById(id);
        mmap.put("lostCus", lostCus);
        return prefix + "/edit";
    }

    /**
     * 修改保存流失客户信息
     */
    @RequiresPermissions("system:cus:edit")
    @Log(title = "流失客户信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LostCus lostCus)
    {
        return toAjax(lostCusService.updateLostCus(lostCus));
    }

    /**
     * 删除流失客户信息
     */
    @RequiresPermissions("system:cus:remove")
    @Log(title = "流失客户信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(lostCusService.deleteLostCusByIds(ids));
    }
}
