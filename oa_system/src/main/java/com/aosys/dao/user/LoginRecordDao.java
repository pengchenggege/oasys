package com.aosys.dao.user;

import com.aosys.pojo.user.LoginRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRecordDao extends JpaRepository<LoginRecord,Long> {
}
