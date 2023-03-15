package com.perscholas.Capstone.controller;

import com.perscholas.Capstone.model.Applicant;
import com.perscholas.Capstone.model.Staff;
import com.perscholas.Capstone.repository.StaffRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class StaffController {

    private StaffRepository staffRepository;

    @Autowired
    public StaffController(StaffRepository staffRepository) {
        this.staffRepository=staffRepository;
    }

    @GetMapping({"/new_staff"})
    public String newStaffApp(Model model) {
        Staff staff = new Staff();
        model.addAttribute("staff", staff);
        return "new_staff_app";
    }

    @PostMapping({"/new_staff"})
    public String submitApp(@ModelAttribute("staff") Staff staff, Model model){
        log.info(staff.toString());
        staffRepository.save(staff);
        return "new_staff_app";
    }
}
