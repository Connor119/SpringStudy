package com.boshen.service;

import com.boshen.dao.UserDao;

public class UserServiceIMPL implements UserService {
    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    public void getUser() {
        dao.getUser();
    }
}
