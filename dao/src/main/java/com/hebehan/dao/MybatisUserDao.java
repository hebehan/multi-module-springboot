package com.hebehan.dao;

import com.hebehan.bean.MybatisUser;

/**
 * Created by Hebe Han
 * Date: 2019-01-21
 */

public interface MybatisUserDao {

    MybatisUser findById(Integer id);
}
