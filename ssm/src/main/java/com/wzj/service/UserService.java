package com.wzj.service;

import com.wzj.entity.User;

import java.util.List;

public interface UserService {
    //获取所有
    public List<User> getAll();

    //添加用户信息
    public void save(User user);

    //删除用户
    public void deleteUser(int id);

    //查找用户详情
    public User findUserById(int id);

    //更新用户
    public void updateUser(int id);
}
