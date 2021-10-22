package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户反馈对象 t_cus_feedback
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
public class TCusFeedback extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id主键 */
    private Long id;

    /** 客户id */
    @Excel(name = "客户id")
    private Long cusId;

    /** 满意度 */
    @Excel(name = "满意度")
    private String cusSatisfact;

    /** 反馈类型 */
    @Excel(name = "反馈类型")
    private String feedbackType;

    /** 详细描述 */
    @Excel(name = "详细描述")
    private String detailDes;

    /** 有效状态 */
    @Excel(name = "有效状态")
    private String isValid;

    /** 更新时间 */
    private Date updataTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCusId(Long cusId) 
    {
        this.cusId = cusId;
    }

    public Long getCusId() 
    {
        return cusId;
    }
    public void setCusSatisfact(String cusSatisfact) 
    {
        this.cusSatisfact = cusSatisfact;
    }

    public String getCusSatisfact() 
    {
        return cusSatisfact;
    }
    public void setFeedbackType(String feedbackType) 
    {
        this.feedbackType = feedbackType;
    }

    public String getFeedbackType() 
    {
        return feedbackType;
    }
    public void setDetailDes(String detailDes) 
    {
        this.detailDes = detailDes;
    }

    public String getDetailDes() 
    {
        return detailDes;
    }
    public void setIsValid(String isValid) 
    {
        this.isValid = isValid;
    }

    public String getIsValid() 
    {
        return isValid;
    }
    public void setUpdataTime(Date updataTime) 
    {
        this.updataTime = updataTime;
    }

    public Date getUpdataTime() 
    {
        return updataTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cusId", getCusId())
            .append("cusSatisfact", getCusSatisfact())
            .append("feedbackType", getFeedbackType())
            .append("detailDes", getDetailDes())
            .append("isValid", getIsValid())
            .append("createTime", getCreateTime())
            .append("updataTime", getUpdataTime())
            .toString();
    }
}
