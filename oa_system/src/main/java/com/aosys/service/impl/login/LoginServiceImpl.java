package com.aosys.service.impl.login;

import com.aosys.dao.login.LoginDao;
import com.aosys.pojo.user.User;
import com.aosys.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginDao loginDao;



    @Override
    public Map findOneUser(User user) {
        Map<String, Object> map = new HashMap<>();
        String str = "用户不存在";
        List<User> lup = loginDao.findAllByUserName(user.getUserName());
        if (lup != null && lup.size() > 0) {
            str = "密码错误";
            User userLogin = lup.get(0);
            if (userLogin.getPassword().equals(user.getPassword())) {
                str = "登录成功";
                map.put("userLogin", userLogin);
            }

        }
        map.put("str", str);
        return map;
    }
}
