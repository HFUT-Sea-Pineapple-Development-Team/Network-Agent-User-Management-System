package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 查看客户信息对象 customer
 * 
 * @author ruoyi
 * @date 2021-10-22
 */
public class Customer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用户id */
    @Excel(name = "用户id")
    private Long id;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userNick;

    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String userName;

    /** 用户平台 */
    @Excel(name = "用户平台")
    private String userPlat;

    /** 用户性别 */
    @Excel(name = "用户性别")
    private String userSex;

    /** 电话号码 */
    @Excel(name = "电话号码")
    private String userPhone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String userEmail;

    /** 地区 */
    @Excel(name = "地区")
    private String userArea;

    /** 账号等级 */
    @Excel(name = "账号等级")
    private String userLevel;

    /** 最后下单 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后下单", width = 30, dateFormat = "yyyy-MM-dd")
    private Date userFinal;

    /** 满意度 */
    @Excel(name = "满意度")
    private Long userSatisfaction;

    /** 剩余时间 */
    @Excel(name = "剩余时间")
    private Long userTime;

    /** 剩余流量 */
    @Excel(name = "剩余流量")
    private Long userFlow;

    /** 创建时间 */
    private Date createDate;

    /** 更新时间 */
    private Date updateDate;

    /** 是否有效 */
    private String isValid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setUserNick(String userNick) 
    {
        this.userNick = userNick;
    }

    public String getUserNick() 
    {
        return userNick;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setUserPlat(String userPlat) 
    {
        this.userPlat = userPlat;
    }

    public String getUserPlat() 
    {
        return userPlat;
    }
    public void setUserSex(String userSex) 
    {
        this.userSex = userSex;
    }

    public String getUserSex() 
    {
        return userSex;
    }
    public void setUserPhone(String userPhone) 
    {
        this.userPhone = userPhone;
    }

    public String getUserPhone() 
    {
        return userPhone;
    }
    public void setUserEmail(String userEmail) 
    {
        this.userEmail = userEmail;
    }

    public String getUserEmail() 
    {
        return userEmail;
    }
    public void setUserArea(String userArea) 
    {
        this.userArea = userArea;
    }

    public String getUserArea() 
    {
        return userArea;
    }
    public void setUserLevel(String userLevel) 
    {
        this.userLevel = userLevel;
    }

    public String getUserLevel() 
    {
        return userLevel;
    }
    public void setUserFinal(Date userFinal) 
    {
        this.userFinal = userFinal;
    }

    public Date getUserFinal() 
    {
        return userFinal;
    }
    public void setUserSatisfaction(Long userSatisfaction) 
    {
        this.userSatisfaction = userSatisfaction;
    }

    public Long getUserSatisfaction() 
    {
        return userSatisfaction;
    }
    public void setUserTime(Long userTime) 
    {
        this.userTime = userTime;
    }

    public Long getUserTime() 
    {
        return userTime;
    }
    public void setUserFlow(Long userFlow) 
    {
        this.userFlow = userFlow;
    }

    public Long getUserFlow() 
    {
        return userFlow;
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
            .append("id", getId())
            .append("userNick", getUserNick())
            .append("userName", getUserName())
            .append("userPlat", getUserPlat())
            .append("userSex", getUserSex())
            .append("userPhone", getUserPhone())
            .append("userEmail", getUserEmail())
            .append("userArea", getUserArea())
            .append("userLevel", getUserLevel())
            .append("userFinal", getUserFinal())
            .append("userSatisfaction", getUserSatisfaction())
            .append("userTime", getUserTime())
            .append("userFlow", getUserFlow())
            .append("createDate", getCreateDate())
            .append("updateDate", getUpdateDate())
            .append("isValid", getIsValid())
            .toString();
    }
}
