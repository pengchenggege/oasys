package com.aosys.service.login;

import com.aosys.pojo.user.User;

import java.util.Map;

public interface LoginService {
    public Map<String,Object> findOneUser(User user);

}
