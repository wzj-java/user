package com.wzj.dao;

import com.wzj.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    //获取所有
    @Select("select * from user")
    public List<User> getAll();

    //添加用户信息
    @Insert("insert into user(username,sex,address) values (#{username},#{sex},#{address})")
    public void save(User user);

    //删除用户
    @Delete("delete from user  where id=#{id}")
    public void deleteUser(int id);

    //查找用户详情
    @Select("select * from user where id=#{id}")
    public User findUserById(int id);

    //更新用户
    @Select("update user set username=#{username},sex=#{sex},address=#{address},birthday=#{birthday} where id=#{id}")
    public void updateUser(int id);

}
