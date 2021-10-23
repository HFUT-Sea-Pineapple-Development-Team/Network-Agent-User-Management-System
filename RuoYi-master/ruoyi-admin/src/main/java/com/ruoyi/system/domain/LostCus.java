package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 流失客户信息对象 lost_cus
 * 
 * @author ruoyi
 * @date 2021-10-23
 */
public class LostCus extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id主键 */
    private Long id;

    /** 客户id */
    @Excel(name = "客户id")
    private Long lostId;

    /** 流失时间 */
    @Excel(name = "流失时间")
    private Long lostTime;

    /** 客户电话 */
    @Excel(name = "客户电话")
    private String cusPhone;

    /** 客户邮箱 */
    @Excel(name = "客户邮箱")
    private String cusEmail;

    /** 联系次数 */
    @Excel(name = "联系次数")
    private Long contactTime;

    /** 确认流失 */
    @Excel(name = "确认流失")
    private String confirmLoss;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLostId(Long lostId) 
    {
        this.lostId = lostId;
    }

    public Long getLostId() 
    {
        return lostId;
    }
    public void setLostTime(Long lostTime) 
    {
        this.lostTime = lostTime;
    }

    public Long getLostTime() 
    {
        return lostTime;
    }
    public void setCusPhone(String cusPhone) 
    {
        this.cusPhone = cusPhone;
    }

    public String getCusPhone() 
    {
        return cusPhone;
    }
    public void setCusEmail(String cusEmail) 
    {
        this.cusEmail = cusEmail;
    }

    public String getCusEmail() 
    {
        return cusEmail;
    }
    public void setContactTime(Long contactTime) 
    {
        this.contactTime = contactTime;
    }

    public Long getContactTime() 
    {
        return contactTime;
    }
    public void setConfirmLoss(String confirmLoss) 
    {
        this.confirmLoss = confirmLoss;
    }

    public String getConfirmLoss() 
    {
        return confirmLoss;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("lostId", getLostId())
            .append("lostTime", getLostTime())
            .append("cusPhone", getCusPhone())
            .append("cusEmail", getCusEmail())
            .append("contactTime", getContactTime())
            .append("confirmLoss", getConfirmLoss())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
