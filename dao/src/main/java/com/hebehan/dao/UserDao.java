package com.hebehan.dao;

import com.alibaba.fastjson.JSON;
import com.hebehan.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Hebe Han
 * Date: 2019-01-14
 */
@Repository
public class UserDao {
    @Autowired
    JdbcTemplate template;

    public List<User> getAllUser(){
       List<Map> maps = template.query("select * from user", new RowMapper<Map>() {
            @Override
            public Map mapRow(ResultSet resultSet, int i) throws SQLException {
                Map row = new HashMap();
                row.put("id",resultSet.getInt("id"));
                row.put("name",resultSet.getString("name"));
                row.put("age",resultSet.getInt("age"));
                return row;
            }
        });
        return JSON.parseArray(JSON.toJSONString(maps),User.class);
    }
}
