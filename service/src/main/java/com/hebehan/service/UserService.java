package com.hebehan.service;

import com.hebehan.bean.User;
import com.hebehan.dao.JpaUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Hebe Han
 * Date: 2019-01-15
 */
@Slf4j
@Service
public class UserService {

    @Autowired
    JpaUserRepository userRepository;

    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
