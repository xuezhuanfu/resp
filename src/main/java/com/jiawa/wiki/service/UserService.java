package com.jiawa.wiki.service;

import com.jiawa.wiki.mapper.DemoMapper;
import com.jiawa.wiki.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DemoMapper demoMapper;

    public List test(){
        return userMapper.list();
    }

    public List testDemo(){
        return demoMapper.selectByExample(null);
    }

}
