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
import com.ruoyi.system.domain.TSaleChance;
import com.ruoyi.system.service.ITSaleChanceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 营销机会Controller
 * 
 * @author ruoyi
 * @date 2021-10-20
 */
@Controller
@RequestMapping("/system/chance")
public class TSaleChanceController extends BaseController
{
    private String prefix = "system/chance";

    @Autowired
    private ITSaleChanceService tSaleChanceService;

    @RequiresPermissions("system:chance:view")
    @GetMapping()
    public String chance()
    {
        return prefix + "/chance";
    }

    /**
     * 查询营销机会列表
     */
    @RequiresPermissions("system:chance:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TSaleChance tSaleChance)
    {
        startPage();
        List<TSaleChance> list = tSaleChanceService.selectTSaleChanceList(tSaleChance);
        return getDataTable(list);
    }

    /**
     * 导出营销机会列表
     */
    @RequiresPermissions("system:chance:export")
    @Log(title = "营销机会", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TSaleChance tSaleChance)
    {
        List<TSaleChance> list = tSaleChanceService.selectTSaleChanceList(tSaleChance);
        ExcelUtil<TSaleChance> util = new ExcelUtil<TSaleChance>(TSaleChance.class);
        return util.exportExcel(list, "营销机会数据");
    }

    /**
     * 新增营销机会
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存营销机会
     */
    @RequiresPermissions("system:chance:add")
    @Log(title = "营销机会", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TSaleChance tSaleChance)
    {
        return toAjax(tSaleChanceService.insertTSaleChance(tSaleChance));
    }

    /**
     * 修改营销机会
     */
    @GetMapping("/edit/{chanceId}")
    public String edit(@PathVariable("chanceId") Long chanceId, ModelMap mmap)
    {
        TSaleChance tSaleChance = tSaleChanceService.selectTSaleChanceByChanceId(chanceId);
        mmap.put("tSaleChance", tSaleChance);
        return prefix + "/edit";
    }

    /**
     * 修改保存营销机会
     */
    @RequiresPermissions("system:chance:edit")
    @Log(title = "营销机会", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TSaleChance tSaleChance)
    {
        return toAjax(tSaleChanceService.updateTSaleChance(tSaleChance));
    }

    /**
     * 删除营销机会
     */
    @RequiresPermissions("system:chance:remove")
    @Log(title = "营销机会", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tSaleChanceService.deleteTSaleChanceByChanceIds(ids));
    }
}
