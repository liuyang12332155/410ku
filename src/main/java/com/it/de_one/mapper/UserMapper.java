package com.it.de_one.mapper;

import com.it.de_one.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select t.*,d.dname from tuser t,dept d where t.deptno=d.deptno")
    public List<User> selectUsers();
}
