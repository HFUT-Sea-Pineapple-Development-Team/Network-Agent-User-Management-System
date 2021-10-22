package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 查看客户联系人对象 customer_contact
 * 
 * @author ruoyi
 * @date 2021-10-21
 */
public class CustomerContact extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id主键 */
    private Long id;

    /** 客服姓名 */
    @Excel(name = "客服姓名")
    private Long contactName;

    /** 用户id */
    @Excel(name = "用户id")
    private Long cusId;

    /** 联系时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "联系时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date contactTime;

    /** 概要 */
    @Excel(name = "概要")
    private String overview;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contactStyle;

    /** 是否有效 */
    @Excel(name = "是否有效")
    private String isValid;

    /** 创建时间 */
    private Date createDate;

    /** 更新时间 */
    private Date updateDate;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setContactName(Long contactName) 
    {
        this.contactName = contactName;
    }

    public Long getContactName() 
    {
        return contactName;
    }
    public void setCusId(Long cusId) 
    {
        this.cusId = cusId;
    }

    public Long getCusId() 
    {
        return cusId;
    }
    public void setContactTime(Date contactTime) 
    {
        this.contactTime = contactTime;
    }

    public Date getContactTime() 
    {
        return contactTime;
    }
    public void setOverview(String overview) 
    {
        this.overview = overview;
    }

    public String getOverview() 
    {
        return overview;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setContactStyle(String contactStyle) 
    {
        this.contactStyle = contactStyle;
    }

    public String getContactStyle() 
    {
        return contactStyle;
    }
    public void setIsValid(String isValid) 
    {
        this.isValid = isValid;
    }

    public String getIsValid() 
    {
        return isValid;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setUpdateDate(Date updateDate) 
    {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate() 
    {
        return updateDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("contactName", getContactName())
            .append("cusId", getCusId())
            .append("contactTime", getContactTime())
            .append("overview", getOverview())
            .append("description", getDescription())
            .append("contactStyle", getContactStyle())
            .append("isValid", getIsValid())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .toString();
    }
}
