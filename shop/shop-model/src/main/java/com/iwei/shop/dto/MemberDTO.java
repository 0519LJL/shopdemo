package com.iwei.shop.dto;

import lombok.Data;

@Data
public class MemberDTO {
    public int mid;
    public String name;
    public String address;
    public String postCode;
    public String mobile;
    public int verifyMobile;
    public String wxOpenid;
    public String wxName;
    public String createTime;
    public int enable;
}
