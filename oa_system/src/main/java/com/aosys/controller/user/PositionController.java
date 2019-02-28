package com.aosys.controller.user;

import com.aosys.pojo.user.Position;
import com.aosys.service.user.PositionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class PositionController {

    @Resource
  PositionService positionService;

    @RequestMapping("/positionmanage")
    public String deptmanage(Model model) {
        List<Position> positions =  positionService.findAll();
        model.addAttribute("positions",positions);
        return "user/positionmanage";
    }

    @RequestMapping("/positiontoAdd")
    public String toAdd() {

        return "user/positionread";
    }

    @RequestMapping("/positionadd")
    public String add(Position position) {
        positionService.save(position);
        return "redirect:/positionmanage";
    }

    @RequestMapping("/positiontoEdit")
    public String toEdit(Model model,long id) {
        Position position=positionService.findById(id);
        model.addAttribute("position", position);
        return "user/positionedit";
    }

    @RequestMapping("/positionedit")
    public String edit(Position position) {
        positionService.edit(position);
        return "redirect:/positionmanage";
    }


    @RequestMapping("/positiondelete")
    public String delete(long id) {
        positionService.delete(id);
        return "redirect:/positionmanage";
    }


}
