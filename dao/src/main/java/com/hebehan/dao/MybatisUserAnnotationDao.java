package com.hebehan.dao;

import com.hebehan.bean.MybatisUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by Hebe Han
 * Date: 2019-01-21
 */
@Mapper
@Repository
public interface MybatisUserAnnotationDao {
    @Select("select * from user where id=#{id}")
    MybatisUser findById(Integer id);
}
