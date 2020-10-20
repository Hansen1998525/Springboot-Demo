package com.example.demo.service.impl;

import com.example.demo.entity.Hansen;
import com.example.demo.service.HelloService;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Hansen.Qu
 */
@Service("HelloService")
public class HelloServiceImpl implements HelloService {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public int getId() {
        List<Hansen> list = jdbcTemplate.query("select * from hansen", new Object[]{}, new BeanPropertyRowMapper<>(Hansen.class));
        for (Hansen a : list) {
            System.out.println("------------- :" + a.getId());
        }
        return 0;
    }
}
