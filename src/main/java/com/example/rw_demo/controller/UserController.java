package com.example.rw_demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.rw_demo.entity.User;
import com.example.rw_demo.service.UserService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author zgl
 * @create 2023-02-2023/2/2-16:19
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private DataSource dataSource;
    @Autowired
    private UserService userService;

    @PostMapping
    private User save (User user) {
        userService.save(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.removeById(id);
    }

    @PutMapping
    public User update(User user) {
        userService.updateById(user);
        return user;
    }



    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        User user = userService.getById(id);
        return user;
    }

    @GetMapping("/list")
    public List<User> list(User user) {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(user.getId()!=null,User::getId,user.getId());
        queryWrapper.eq(user.getName()!=null,User::getName,user.getName());
        List<User> list = userService.list(queryWrapper);
        return list;
    }
}
