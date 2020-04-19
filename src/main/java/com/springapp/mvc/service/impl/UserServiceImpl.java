package com.springapp.mvc.service.impl;

import com.springapp.mvc.dao.UserDao;
import com.springapp.mvc.model.User;
import com.springapp.mvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Created by  on 2015/12/7.
 */
public class UserServiceImpl implements UserService {
    /*@Autowired
    private UserDao userDao;*/


    /*@Autowired
    @Qualifier("userDao1")
    private UserDao userDao;*/

    @Resource(name = "userDao")
    private UserDao userDao;

    public User getUserById(int id){
        return userDao.getUserById(id);
    }

    public int getUserCount(){
        return userDao.getUserCount();
    }
}
