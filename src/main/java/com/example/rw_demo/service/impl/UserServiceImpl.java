package com.example.rw_demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.rw_demo.entity.User;
import com.example.rw_demo.mapper.UserMapper;
import com.example.rw_demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author zgl
 * @create 2023-02-2023/2/2-16:16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
