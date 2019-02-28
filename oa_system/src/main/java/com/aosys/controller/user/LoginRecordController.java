package com.aosys.controller.user;

import com.aosys.pojo.user.LoginRecord;
import com.aosys.service.user.LoginRecordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LoginRecordController {
    @Resource
    LoginRecordService loginRecordService;

    @RequestMapping("/morelogrecord")
    public String deptmanage(Model model) {
        List<LoginRecord> loginRecords =  loginRecordService.findAll();
        model.addAttribute("loginRecords",loginRecords);
        return "user/userlogrecordmanagetable";
    }
}
