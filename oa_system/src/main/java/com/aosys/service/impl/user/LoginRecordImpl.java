package com.aosys.service.impl.user;

import com.aosys.dao.user.LoginRecordDao;
import com.aosys.pojo.user.LoginRecord;
import com.aosys.service.user.LoginRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginRecordImpl implements LoginRecordService{

    @Autowired
    LoginRecordDao loginRecordDao;


    @Override
    public List<LoginRecord> findAll() {
        return loginRecordDao.findAll();
    }
}
