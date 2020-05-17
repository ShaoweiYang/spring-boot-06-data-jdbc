package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Shawn.Yang
 * @create 2020-05-17-16:49
 */
@Controller
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @RequestMapping("/map")
    public Map<String, Object> map() {
        List<Map<String, Object>> queryForList = jdbcTemplate.queryForList("select id,departmentName from department");

        return queryForList.size() > 0 ? queryForList.get(0) : null;
    }
}
