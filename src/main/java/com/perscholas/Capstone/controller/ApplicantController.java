package com.perscholas.Capstone.controller;

import com.perscholas.Capstone.model.Applicant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ApplicantController {

    @GetMapping({"/new"})
    public String newApp(Model model) { return "new_app"; }

    @GetMapping({"/existing"})
    public String existingApp(Model model) { return "existing_app"; }

    @GetMapping({"/view"})
    public String viewApp(Model model) { return "view_app"; }

    @PostMapping("/new")
    public String submitCompose(@ModelAttribute("applicant") Applicant applicant,Model model){
        log.info(applicant.toString());
        model.addAttribute("firstName",applicant.getFirstName());
        model.addAttribute("lastName",applicant.getLastName());
        model.addAttribute("email",applicant.getEmail());
        model.addAttribute("position",applicant.getPosition());
        model.addAttribute("password",applicant.getPassword());
        //applicant.setDateReceived(emailsServices.getCurrentTimeUsingCalendar());
        //emailsRepo.save(email);
        return "new_app";
    }
}
