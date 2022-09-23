package com.jiawa.wiki.user.service;

import com.jiawa.wiki.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List test(){
        return userMapper.list();
    }

}
