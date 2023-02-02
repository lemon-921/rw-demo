package com.example.rw_demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.rw_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zgl
 * @create 2023-02-2023/2/2-16:15
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
