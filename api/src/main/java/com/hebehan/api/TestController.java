package com.hebehan.api;

import com.alibaba.fastjson.JSON;
import com.hebehan.dao.MybatisUserAnnotationDao;
import com.hebehan.dao.MybatisUserDao;
import com.hebehan.dao.UserAutoBeanMapper;
import com.hebehan.dao.UserDao;
import com.hebehan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    UserDao userDao;

    @Autowired
    UserService userService;

    @GetMapping(value = "user")
    public String jdbcgetall(){
        return JSON.toJSONString(userDao.getAllUser());
//        return "test";
    }


    @GetMapping(value = "jpauser")
    public String jpagetall(){
        return JSON.toJSONString(userService.getAllUser());
//        return "test";
    }

    @GetMapping(value = "testnull")
    public String testnull(){
        String str = null;
        str.substring(0);
        return JSON.toJSONString(userService.getAllUser());
//        return "test";
    }

    //xml形式mapper
//    @Autowired
//    MybatisUserDao mybatisUserDao;
//
//    @GetMapping(value = "testmybatis")
//    public String testmybatis(){
//       return JSON.toJSONString(mybatisUserDao.findById(1));
//    }

    //java注解形式mapper

    @Autowired
    MybatisUserAnnotationDao mybatisUserAnnotationDao;

    @Autowired
    UserAutoBeanMapper userAutoBeanMapper;

    @GetMapping(value = "testmybatisannotation")
    public String testmybatisannotation(){
//       return JSON.toJSONString(mybatisUserAnnotationDao.findById(1));
       return JSON.toJSONString(userAutoBeanMapper.selectByPrimaryKey(1));
    }
}
