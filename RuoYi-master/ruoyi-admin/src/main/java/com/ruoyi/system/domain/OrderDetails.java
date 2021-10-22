package com.ruoyi.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 订单详情对象 order_details
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
public class OrderDetails extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 详情id */
    @Excel(name = "详情id")
    private Long id;

    /** 订单id */
    @Excel(name = "订单id")
    private Long orderId;

    /** 服务类型 */
    @Excel(name = "服务类型")
    private String serviceType;

    /** 价格 */
    @Excel(name = "价格")
    private BigDecimal price;

    /** 是否有效 */
    @Excel(name = "是否有效")
    private String isValid;

    /** 数量 */
    @Excel(name = "数量")
    private Long number;

    /** 创建时间 */
    private Date createDate;

    /** 剩余流量 */
    @Excel(name = "剩余流量")
    private BigDecimal resFlow;

    /** 总价 */
    @Excel(name = "总价")
    private BigDecimal total;

    /** 更新时间 */
    private Date updateDate;

    /** 剩余时间 */
    @Excel(name = "剩余时间")
    private Long resTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setOrderId(Long orderId) 
    {
        this.orderId = orderId;
    }

    public Long getOrderId() 
    {
        return orderId;
    }
    public void setServiceType(String serviceType) 
    {
        this.serviceType = serviceType;
    }

    public String getServiceType() 
    {
        return serviceType;
    }
    public void setPrice(BigDecimal price) 
    {
        this.price = price;
    }

    public BigDecimal getPrice() 
    {
        return price;
    }
    public void setIsValid(String isValid) 
    {
        this.isValid = isValid;
    }

    public String getIsValid() 
    {
        return isValid;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setResFlow(BigDecimal resFlow) 
    {
        this.resFlow = resFlow;
    }

    public BigDecimal getResFlow() 
    {
        return resFlow;
    }
    public void setTotal(BigDecimal total) 
    {
        this.total = total;
    }

    public BigDecimal getTotal() 
    {
        return total;
    }
    public void setUpdateDate(Date updateDate) 
    {
        this.updateDate = updateDate;
    }

    public Date getUpdateDate() 
    {
        return updateDate;
    }
    public void setResTime(Long resTime) 
    {
        this.resTime = resTime;
    }

    public Long getResTime() 
    {
        return resTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("orderId", getOrderId())
            .append("serviceType", getServiceType())
            .append("price", getPrice())
            .append("isValid", getIsValid())
            .append("number", getNumber())
            .append("createDate", getCreateDate())
            .append("resFlow", getResFlow())
            .append("total", getTotal())
            .append("updateDate", getUpdateDate())
            .append("resTime", getResTime())
            .toString();
    }
}
