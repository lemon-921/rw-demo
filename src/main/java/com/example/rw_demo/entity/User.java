package com.example.rw_demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zgl
 * @create 2023-02-2023/2/2-16:11
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;

    private String name;

    private int age;

    private String adress;
}
