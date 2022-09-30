package com.jiawa.wiki.mapper;

import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {
    public List<User> list();
}
