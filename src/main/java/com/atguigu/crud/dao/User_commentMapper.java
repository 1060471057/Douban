package com.atguigu.crud.dao;

import com.atguigu.crud.bean.User_comment;
import com.atguigu.crud.bean.User_commentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_commentMapper {
    long countByExample(User_commentExample example);

    int deleteByExample(User_commentExample example);

    int deleteByPrimaryKey(Integer fixId);

    int insert(User_comment record);

    int insertSelective(User_comment record);

    List<User_comment> selectByExample(User_commentExample example);

    User_comment selectByPrimaryKey(Integer fixId);

    int updateByExampleSelective(@Param("record") User_comment record, @Param("example") User_commentExample example);

    int updateByExample(@Param("record") User_comment record, @Param("example") User_commentExample example);

    int updateByPrimaryKeySelective(User_comment record);

    int updateByPrimaryKey(User_comment record);
}