package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 营销机会对象 t_sale_chance
 * 
 * @author ruoyi
 * @date 2021-10-20
 */
public class TSaleChance extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 机会id主键 */
    private Long chanceId;

    /** 机会来源 */
    @Excel(name = "机会来源")
    private String chanceSource;

    /** 客户昵称 */
    @Excel(name = "客户昵称")
    private String cusNick;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String cusPhone;

    /** 客户姓名 */
    @Excel(name = "客户姓名")
    private String cusName;

    /** 新老客户（0新客户 1老客户） */
    @Excel(name = "新老客户", readConverterExp = "0=新客户,1=老客户")
    private String isNew;

    /** 邀请客户（0邀请客户 1非邀请客户，根据有无邀请码判断） */
    @Excel(name = "邀请客户", readConverterExp = "0=邀请客户,1=非邀请客户，根据有无邀请码判断")
    private String isInv;

    /** 购买方式（0按时间购买 1按流量购买） */
    @Excel(name = "购买方式", readConverterExp = "0=按时间购买,1=按流量购买")
    private Long quarAndFlow;

    /** 代理等级 */
    @Excel(name = "代理等级")
    private Long chanceLevel;

    /** 开发结果 */
    @Excel(name = "开发结果")
    private Long chanceResult;

    /** 概要 */
    @Excel(name = "概要")
    private String title;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createMan;

    /** 有效状态（0有效 1无效） */
    @Excel(name = "有效状态", readConverterExp = "0=有效,1=无效")
    private String isValid;

    public void setChanceId(Long chanceId) 
    {
        this.chanceId = chanceId;
    }

    public Long getChanceId() 
    {
        return chanceId;
    }
    public void setChanceSource(String chanceSource) 
    {
        this.chanceSource = chanceSource;
    }

    public String getChanceSource() 
    {
        return chanceSource;
    }
    public void setCusNick(String cusNick) 
    {
        this.cusNick = cusNick;
    }

    public String getCusNick() 
    {
        return cusNick;
    }
    public void setCusPhone(String cusPhone) 
    {
        this.cusPhone = cusPhone;
    }

    public String getCusPhone() 
    {
        return cusPhone;
    }
    public void setCusName(String cusName) 
    {
        this.cusName = cusName;
    }

    public String getCusName() 
    {
        return cusName;
    }
    public void setIsNew(String isNew) 
    {
        this.isNew = isNew;
    }

    public String getIsNew() 
    {
        return isNew;
    }
    public void setIsInv(String isInv) 
    {
        this.isInv = isInv;
    }

    public String getIsInv() 
    {
        return isInv;
    }
    public void setQuarAndFlow(Long quarAndFlow) 
    {
        this.quarAndFlow = quarAndFlow;
    }

    public Long getQuarAndFlow() 
    {
        return quarAndFlow;
    }
    public void setChanceLevel(Long chanceLevel) 
    {
        this.chanceLevel = chanceLevel;
    }

    public Long getChanceLevel() 
    {
        return chanceLevel;
    }
    public void setChanceResult(Long chanceResult) 
    {
        this.chanceResult = chanceResult;
    }

    public Long getChanceResult() 
    {
        return chanceResult;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setCreateMan(String createMan) 
    {
        this.createMan = createMan;
    }

    public String getCreateMan() 
    {
        return createMan;
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
            .append("chanceId", getChanceId())
            .append("chanceSource", getChanceSource())
            .append("cusNick", getCusNick())
            .append("cusPhone", getCusPhone())
            .append("cusName", getCusName())
            .append("isNew", getIsNew())
            .append("isInv", getIsInv())
            .append("quarAndFlow", getQuarAndFlow())
            .append("chanceLevel", getChanceLevel())
            .append("chanceResult", getChanceResult())
            .append("title", getTitle())
            .append("description", getDescription())
            .append("createMan", getCreateMan())
            .append("isValid", getIsValid())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
