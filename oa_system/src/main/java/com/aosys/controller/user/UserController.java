package com.aosys.controller.user;

import com.aosys.pojo.user.User;
import com.aosys.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/usermanage")
    public String usermanage(Model model) {
        List<User> users =  userService.findAll();
        model.addAttribute("users",users);
        return "user/usermanage";
    }

    @RequestMapping("/usertoAdd")
    public String toAdd() {

        return "user/userread";
    }

    @RequestMapping("/useradd")
    public String add(User user) {
        userService.save(user);
        return "redirect:/usermanage";
    }

    @RequestMapping("/userEdit")
    public String toEdit(Model model,long id) {
        User user=userService.findById(id);
        model.addAttribute("user", user);
        return "user/useredit";
    }

    @RequestMapping("/useredit")
    public String edit(User user) {
        userService.edit(user);
        return "redirect:/usermanage";
    }


    @RequestMapping("/userdelete")
    public String delete(long id) {
        userService.delete(id);
        return "redirect:/usermanage";
    }

}
