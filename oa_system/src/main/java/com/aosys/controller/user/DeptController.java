package com.aosys.controller.user;

import com.aosys.pojo.user.Dept;
import com.aosys.service.user.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class DeptController {

    @Resource
    DeptService deptService;

    @RequestMapping("/list")
    public String deptmanage(Model model) {
        List<Dept> depts =  deptService.getDeptList();
        model.addAttribute("depts",depts);
        return "user/deptmanage";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {

        return "user/deptread";
    }

    @RequestMapping("/add")
    public String add(Dept dept) {
        deptService.save(dept);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,long id) {
        Dept dept=deptService.findOne(id);
        model.addAttribute("dept", dept);
        return "user/deptedit";
    }

    @RequestMapping("/edit")
    public String edit(Dept dept) {
        deptService.edit(dept);
        return "redirect:/list";
    }


    @RequestMapping("/delete")
    public String delete(long id) {
        deptService.delete(id);
        return "redirect:/list";
    }
}
