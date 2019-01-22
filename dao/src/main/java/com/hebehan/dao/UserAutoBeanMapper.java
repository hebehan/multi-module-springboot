package com.hebehan.dao;

import com.hebehan.bean.UserAutoBean;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAutoBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAutoBean record);

    int insertSelective(UserAutoBean record);

    UserAutoBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAutoBean record);

    int updateByPrimaryKey(UserAutoBean record);
}