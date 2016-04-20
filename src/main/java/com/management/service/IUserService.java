package com.management.service;

import com.management.vo.User;

import java.util.List;

/**
 * Created by X on 2016/4/19.
 */

public interface IUserService {

    List<User> select(User user);
}

