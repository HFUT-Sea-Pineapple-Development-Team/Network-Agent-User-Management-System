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
import com.ruoyi.system.domain.TCuvDevPlan;
import com.ruoyi.system.service.ITCuvDevPlanService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户开发计划Controller
 * 
 * @author ruoyi
 * @date 2021-10-24
 */
@Controller
@RequestMapping("/system/plan")
public class TCuvDevPlanController extends BaseController
{
    private String prefix = "system/plan";

    @Autowired
    private ITCuvDevPlanService tCuvDevPlanService;

    @RequiresPermissions("system:plan:view")
    @GetMapping()
    public String plan()
    {
        return prefix + "/plan";
    }

    /**
     * 查询客户开发计划列表
     */
    @RequiresPermissions("system:plan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TCuvDevPlan tCuvDevPlan)
    {
        startPage();
        List<TCuvDevPlan> list = tCuvDevPlanService.selectTCuvDevPlanList(tCuvDevPlan);
        return getDataTable(list);
    }

    /**
     * 导出客户开发计划列表
     */
    @RequiresPermissions("system:plan:export")
    @Log(title = "客户开发计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TCuvDevPlan tCuvDevPlan)
    {
        List<TCuvDevPlan> list = tCuvDevPlanService.selectTCuvDevPlanList(tCuvDevPlan);
        ExcelUtil<TCuvDevPlan> util = new ExcelUtil<TCuvDevPlan>(TCuvDevPlan.class);
        return util.exportExcel(list, "客户开发计划数据");
    }

    /**
     * 新增客户开发计划
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户开发计划
     */
    @RequiresPermissions("system:plan:add")
    @Log(title = "客户开发计划", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TCuvDevPlan tCuvDevPlan)
    {
        return toAjax(tCuvDevPlanService.insertTCuvDevPlan(tCuvDevPlan));
    }

    /**
     * 修改客户开发计划
     */
    @GetMapping("/edit/{planId}")
    public String edit(@PathVariable("planId") Long planId, ModelMap mmap)
    {
        TCuvDevPlan tCuvDevPlan = tCuvDevPlanService.selectTCuvDevPlanByPlanId(planId);
        mmap.put("tCuvDevPlan", tCuvDevPlan);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户开发计划
     */
    @RequiresPermissions("system:plan:edit")
    @Log(title = "客户开发计划", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TCuvDevPlan tCuvDevPlan)
    {
        return toAjax(tCuvDevPlanService.updateTCuvDevPlan(tCuvDevPlan));
    }

    /**
     * 删除客户开发计划
     */
    @RequiresPermissions("system:plan:remove")
    @Log(title = "客户开发计划", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tCuvDevPlanService.deleteTCuvDevPlanByPlanIds(ids));
    }
}
