package com.invengo.service;

import com.invengo.dao.UserDao;
import com.invengo.domain.User;

import java.util.List;

/**
 * Created By IntelliJ IDEA
 * User:Administrator
 * Date:2018/08/23
 * Time:09:31
 */
public class UserService {
    private  UserDao userDao = new UserDao();

    public List<User> findAll(){
        return userDao.findAll();
    }
}
