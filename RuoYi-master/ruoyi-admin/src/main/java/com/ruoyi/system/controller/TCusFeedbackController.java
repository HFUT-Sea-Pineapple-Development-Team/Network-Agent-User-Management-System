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
import com.ruoyi.system.domain.TCusFeedback;
import com.ruoyi.system.service.ITCusFeedbackService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户反馈Controller
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
@Controller
@RequestMapping("/system/feedback")
public class TCusFeedbackController extends BaseController
{
    private String prefix = "system/feedback";

    @Autowired
    private ITCusFeedbackService tCusFeedbackService;

    @RequiresPermissions("system:feedback:view")
    @GetMapping()
    public String feedback()
    {
        return prefix + "/feedback";
    }

    /**
     * 查询客户反馈列表
     */
    @RequiresPermissions("system:feedback:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TCusFeedback tCusFeedback)
    {
        startPage();
        List<TCusFeedback> list = tCusFeedbackService.selectTCusFeedbackList(tCusFeedback);
        return getDataTable(list);
    }

    /**
     * 导出客户反馈列表
     */
    @RequiresPermissions("system:feedback:export")
    @Log(title = "客户反馈", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TCusFeedback tCusFeedback)
    {
        List<TCusFeedback> list = tCusFeedbackService.selectTCusFeedbackList(tCusFeedback);
        ExcelUtil<TCusFeedback> util = new ExcelUtil<TCusFeedback>(TCusFeedback.class);
        return util.exportExcel(list, "客户反馈数据");
    }

    /**
     * 新增客户反馈
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户反馈
     */
    @RequiresPermissions("system:feedback:add")
    @Log(title = "客户反馈", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TCusFeedback tCusFeedback)
    {
        return toAjax(tCusFeedbackService.insertTCusFeedback(tCusFeedback));
    }

    /**
     * 修改客户反馈
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TCusFeedback tCusFeedback = tCusFeedbackService.selectTCusFeedbackById(id);
        mmap.put("tCusFeedback", tCusFeedback);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户反馈
     */
    @RequiresPermissions("system:feedback:edit")
    @Log(title = "客户反馈", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TCusFeedback tCusFeedback)
    {
        return toAjax(tCusFeedbackService.updateTCusFeedback(tCusFeedback));
    }

    /**
     * 删除客户反馈
     */
    @RequiresPermissions("system:feedback:remove")
    @Log(title = "客户反馈", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tCusFeedbackService.deleteTCusFeedbackByIds(ids));
    }
}
