package com.springapp.mvc.dao;

import com.springapp.mvc.model.User;

/**
 * Created by huzhicheng on 2015/12/7.
 */
public interface UserDao {
    public User getUserById(int id);

    public int getUserCount();
}
