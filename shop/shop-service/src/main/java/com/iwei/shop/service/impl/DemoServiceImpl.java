package com.iwei.shop.service.impl;

import com.iwei.shop.mapper.MemberMapper;
import com.iwei.shop.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public String getDemoService(){


        return memberMapper.selectById("6").toString();
    }
}
