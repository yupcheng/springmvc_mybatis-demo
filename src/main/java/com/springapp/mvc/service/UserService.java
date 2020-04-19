package com.springapp.mvc.service;

import com.springapp.mvc.model.User;

/**
 * Created by  on 2015/12/7.
 */
public interface UserService {
    public User getUserById(int id);

    public int getUserCount();
}
