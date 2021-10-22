package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户开发计划对象 t_cuv_dev_plan
 * 
 * @author ruoyi
 * @date 2021-10-20
 */
public class TCuvDevPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 计划id */
    private Long planId;

    /** 机会id */
    @Excel(name = "机会id")
    private Long chanceId;

    /** 计划内容 */
    @Excel(name = "计划内容")
    private String planItem;

    /** 计划时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "计划时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planTime;

    /** 执行效果 */
    @Excel(name = "执行效果")
    private String exeAffect;

    /** 有效状态（0有效 1无效） */
    @Excel(name = "有效状态", readConverterExp = "0=有效,1=无效")
    private String isValid;

    public void setPlanId(Long planId) 
    {
        this.planId = planId;
    }

    public Long getPlanId() 
    {
        return planId;
    }
    public void setChanceId(Long chanceId) 
    {
        this.chanceId = chanceId;
    }

    public Long getChanceId() 
    {
        return chanceId;
    }
    public void setPlanItem(String planItem) 
    {
        this.planItem = planItem;
    }

    public String getPlanItem() 
    {
        return planItem;
    }
    public void setPlanTime(Date planTime) 
    {
        this.planTime = planTime;
    }

    public Date getPlanTime() 
    {
        return planTime;
    }
    public void setExeAffect(String exeAffect) 
    {
        this.exeAffect = exeAffect;
    }

    public String getExeAffect() 
    {
        return exeAffect;
    }
    public void setIsValid(String isValid) 
    {
        this.isValid = isValid;
    }

    public String getIsValid() 
    {
        return isValid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("planId", getPlanId())
            .append("chanceId", getChanceId())
            .append("planItem", getPlanItem())
            .append("planTime", getPlanTime())
            .append("exeAffect", getExeAffect())
            .append("isValid", getIsValid())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
