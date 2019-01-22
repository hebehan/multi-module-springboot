package com.hebehan.dao;

import com.hebehan.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Hebe Han
 * Date: 2019-01-15
 */
public interface JpaUserRepository extends JpaRepository<User,Integer> {

}
